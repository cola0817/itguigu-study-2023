package itguigu.study.service.impl;

import itguigu.study.dao.HelloDao;
import itguigu.study.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class HelloServiceImpl implements HelloService {

    @Autowired
    HelloDao helloDao;

    @Override
    public String sayHello() {
        return helloDao.sayHello();
    }
}
