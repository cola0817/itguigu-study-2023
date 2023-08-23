package itguigu.study.dao;

public class OrderDao {

    private Integer id;
    private String orderName;

    public OrderDao() {
    }

    public OrderDao(Integer id, String orderName) {
        this.id = id;
        this.orderName = orderName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

}
