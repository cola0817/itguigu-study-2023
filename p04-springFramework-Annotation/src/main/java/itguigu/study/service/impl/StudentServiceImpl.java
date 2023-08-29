package itguigu.study.service.impl;

import itguigu.study.dao.StudentDao;
import itguigu.study.entity.Student;
import itguigu.study.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Resource
    StudentDao studentDao;
    @Override
    public List<Student> findAll() {
        return studentDao.findAll();
    }
}
