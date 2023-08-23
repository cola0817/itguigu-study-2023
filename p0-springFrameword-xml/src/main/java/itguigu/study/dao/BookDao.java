package itguigu.study.dao;


public class BookDao {
    private static BookDao bookDao = new BookDao();

    private BookDao() {
    }

    public static BookDao createBookDao(){
        return bookDao;
    }
}
