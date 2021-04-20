package designPattern.src.base.domain;

import java.io.Serializable;

/**
 * description:
 *
 * @date 2021/4/20 13:42
 */
public class Teacher implements Serializable {
    private String name;
    private String sex;
    private Integer age;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
