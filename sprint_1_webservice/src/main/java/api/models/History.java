package api.models;

public class History {
    private int test;
    private String chienle;
    private int id;
    private String name;
    private String phone;

    public History() {
    }

    public History(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getChienle() {
        return chienle;
    }

    public void setChienle(String chienle) {
        this.chienle = chienle;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
