package itguigu.study.dao;


public class BookDao {

    private Integer id;
    private String bookName;

    public void init(){
        System.out.println("BookDao init method ");
    }

    public void destroy(){
        System.out.println("BookDao destroy method ");
    }

    public BookDao(Integer id, String bookName) {
        this.id = id;
        this.bookName = bookName;
    }

    private static BookDao bookDao = new BookDao();

    private BookDao() {
    }

    public static BookDao createBookDao(){
        return bookDao;
    }
}
