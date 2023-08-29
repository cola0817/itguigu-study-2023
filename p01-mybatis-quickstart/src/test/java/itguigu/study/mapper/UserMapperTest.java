package itguigu.study.mapper;

import itguigu.study.entity.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class UserMapperTest {

    private SqlSession sqlSession;

    @BeforeEach
    void createSqlSession() throws IOException {
        sqlSession    = new SqlSessionFactoryBuilder().build(
                Resources.getResourceAsStream("mybatis-config.xml")
        ).openSession();
    }

    @Test
    void insertUser() {
        User user = new User();
        user.setUserName("Cola");
        user.setPassWord("123");

        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

        int key = userMapper.insertUser(user);

        System.out.println(key);
    }

    @Test
    void deleteUser() {
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

        int count = userMapper.deleteUser(1);

        System.out.println(count == 1?"删除成功":"删除失败");
    }

    @Test
    void updateUser() {
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

        int count = userMapper.updateUser(1, "222");

        System.out.println(count == 1?"更新成功":"更新失败");


    }

    @Test
    void selectByUserId() {
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

        User user = userMapper.selectByUserId(1);

        System.out.println(user);
    }

    @Test
    void selectAll() {
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

        userMapper.selectAll().forEach(System.out::println);
    }

    @AfterEach
    void clear(){
        sqlSession.commit();
        sqlSession.close();
    }
}