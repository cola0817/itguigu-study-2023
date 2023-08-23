package itguigu.study.dao;

public class Happy {
    private Integer id;
    private String message;

    public Happy() {
    }

    public Happy(Integer id, String message) {
        this.id = id;
        this.message = message;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Happy{" +
                "id=" + id +
                ", message='" + message + '\'' +
                '}';
    }
}
