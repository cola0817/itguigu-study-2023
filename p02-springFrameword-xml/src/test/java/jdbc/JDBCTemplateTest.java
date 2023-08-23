package jdbc;

import itguigu.study.entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class JDBCTemplateTest {

    @Test
    public void selectAll(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-ioc.xml");
        JdbcTemplate jdbcTemplate = context.getBean(JdbcTemplate.class);

        String sql = "SELECT * FROM students";
        List<Student> studentDaoList = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Student.class));
        studentDaoList.forEach(System.out::println);
    }

}
