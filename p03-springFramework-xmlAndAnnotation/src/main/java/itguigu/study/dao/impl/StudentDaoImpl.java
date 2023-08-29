package itguigu.study.dao.impl;

import itguigu.study.dao.StudentDao;
import itguigu.study.entity.Student;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

@Repository
public class StudentDaoImpl implements StudentDao {
    @Resource
    JdbcTemplate jdbcTemplate;

    @Override
    public List<Student> findAll() {
        String sql = "SELECT * FROM students";

        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Student.class));
    }
}
