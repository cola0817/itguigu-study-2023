import itguigu.study.entity.Employee;
import itguigu.study.mapper.EmployeeMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

public class EmployeeTest {

    @Test
    public void selectEmployee() throws IOException {
        String mybatisConfigFilePath = "mybatis-config.xml";

        InputStream inputStream = Resources.getResourceAsStream(mybatisConfigFilePath);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();

        EmployeeMapper employeeMapper = sqlSession.getMapper(EmployeeMapper.class);
        Employee employee = employeeMapper.selectEmployee(4);
        System.out.println(employee);

        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void insertEmployee() throws IOException {
        String mybatisConfigFilePath = "mybatis-config.xml";

        InputStream inputStream = Resources.getResourceAsStream(mybatisConfigFilePath);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        EmployeeMapper employeeMapper = sqlSession.getMapper(EmployeeMapper.class);

        Employee employee = new Employee();
        employee.setEmpName("Cola");
        employee.setEmpSalary(1.0);

        int count = employeeMapper.insertEmployee(employee);

        System.out.println(count == 1?"插入成功":"插入失败");

        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void updateEmployee() throws IOException {
        String mybatisConfigFilePath = "mybatis-config.xml";

        InputStream inputStream = Resources.getResourceAsStream(mybatisConfigFilePath);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        EmployeeMapper employeeMapper = sqlSession.getMapper(EmployeeMapper.class);

        int count = employeeMapper.updateEmployee(4, 2.2);

        System.out.println(count == 1?"更新成功":"更新失败");

        sqlSession.commit();
        sqlSession.close();

    }

    @Test
    public void updateEmployeeByMap() throws IOException {
        String mybatisConfigFilePath = "mybatis-config.xml";

        InputStream inputStream = Resources.getResourceAsStream(mybatisConfigFilePath);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        EmployeeMapper employeeMapper = sqlSession.getMapper(EmployeeMapper.class);

        Map<String, Object> map = new HashMap<>();
        map.put("empId", 4);
        map.put("empSalary", 3.3);

        int count = employeeMapper.updateEmployeeByMap(map);

        System.out.println(count == 1?"更新成功":"更新失败");

        sqlSession.commit();
        sqlSession.close();

    }

}
