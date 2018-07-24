package com.example.springcloudeurekaserverproducer.vo;

/**
 * @Auther: xuepengbo
 * @Date: 2018/7/17 10:31
 * @Description:
 */
public class User {

    private String userName;

    private String sex;

    private String age;

    public User() {
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", sex='" + sex + '\'' +
                ", age='" + age + '\'' +
                '}';
    }

    public User(String userName, String sex, String age) {
        this.userName = userName;
        this.sex = sex;
        this.age = age;
    }
}
