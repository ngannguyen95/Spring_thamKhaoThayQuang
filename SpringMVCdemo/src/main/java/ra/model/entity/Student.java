package ra.model.entity;


import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Student {
    private int id;
    private String name;
    private int age;
    private boolean sex;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birthDate;
    private String address;
    private boolean status;

    public Student() {
    }

    public Student(int id, String name, int age, boolean sex, Date birthDate, String address, boolean status) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.birthDate = birthDate;
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

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
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
