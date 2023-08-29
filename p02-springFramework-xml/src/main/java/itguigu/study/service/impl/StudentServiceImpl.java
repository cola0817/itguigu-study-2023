package itguigu.study.service.impl;

import itguigu.study.dao.StudentDao;
import itguigu.study.dao.impl.StudentDaoImpl;
import itguigu.study.entity.Student;
import itguigu.study.service.StudentService;

import java.util.List;

public class StudentServiceImpl implements StudentService {
    private StudentDao studentDao;

    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    @Override
    public List<Student> fondAll() {
        return studentDao.fondAll();
    }
}
