import itguigu.study.dao.BookDao;
import itguigu.study.dao.UserDao;
import itguigu.study.service.AdminService;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XMLTest {

    @Test
    public void loadBean(){
        ApplicationContext context = new ClassPathXmlApplicationContext("userDao.xml", "bookDao.xml", "adminService.xml");

        UserDao userDao = context.getBean("userDao", UserDao.class);
        System.out.println("通过无参构造函数创建 bean");
        System.out.println(userDao);

        BookDao bookDao = context.getBean("bookDao", BookDao.class);
        System.out.println("通过静态工厂创建 bean");
        System.out.println(bookDao);

        AdminService adminService = context.getBean("adminService", AdminService.class);
        System.out.println("通过实例工厂创建 bean");
        System.out.println(adminService);
    }

    @Test
    public void DIByConstruct(){
        ApplicationContext context = new ClassPathXmlApplicationContext("userDao.xml");
        UserDao userDaoDIByConstruct = context.getBean("userDaoDIByConstruct", UserDao.class);
        System.out.println(userDaoDIByConstruct);
    }
    @Test
    public void DIBySetter(){
        ApplicationContext context = new ClassPathXmlApplicationContext("userDao.xml");
        UserDao userDaoDIBySetter = context.getBean("userDaoDIBySetter", UserDao.class);
        System.out.println(userDaoDIBySetter);
    }

    @Test
    public void InitOrDestroy(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bookDao.xml");
        BookDao bookDao = context.getBean("bookDaoInitOrDestroy", BookDao.class);
        System.out.println(bookDao);
    }


}
