package itguigu.study.dao.impl;

import itguigu.study.dao.HelloDao;
import org.springframework.stereotype.Repository;

@Repository
public class HelloDaoImpl implements HelloDao {
    @Override
    public String sayHello() {
        return "Hello this is Hello";
    }
}
