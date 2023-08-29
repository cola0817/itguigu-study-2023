package itguigu.study.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.*;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
@PropertySource("classpath:jdbc.properties")
@ComponentScan("itguigu.study")
public class SpringConfig {

    @Value("${cola.url}")
    private String url;
    @Value("${cola.driver}")
    private String driverName;
    @Value("${cola.username}")
    private String username;
    @Value("${cola.password}")
    private String password;

    @Bean
    public DruidDataSource druidDataSource(){
        DruidDataSource druidDataSource = new DruidDataSource();

        druidDataSource.setUrl(url);
        druidDataSource.setDriverClassName(driverName);
        druidDataSource.setUsername(username);
        druidDataSource.setPassword(password);

        return druidDataSource;
    }

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public JdbcTemplate jdbcTemplate(){
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(druidDataSource());
        return jdbcTemplate;
    }
}
