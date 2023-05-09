package ra.model.entity;

import java.util.Date;

public class Student {
    private int id;
    private String name;
    private int age;
    private boolean sex;
    private Date birthDate;
    private String address;
    private boolean status;

    public Student() {
    }

    public Student(int id, String name, int age, boolean sex, Date birtDate, String address, boolean status) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.birthDate = birtDate;
        this.address = address;
        this.status = status;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public Date getbirtDate() {
        return birthDate;
    }

    public void setbirtDate(Date date) {
        this.birthDate = date;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
