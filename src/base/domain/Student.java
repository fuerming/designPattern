package designPattern.src.base.domain;

import java.io.Serializable;
import java.util.List;

/**
 * description:
 *
 * @date 2021/4/20 13:41
 */
public class Student implements Serializable {
    private String name;
    private String sex;
    private Integer age;

    private List<Teacher> teacherList;

    public List<Teacher> getTeacherList() {
        return teacherList;
    }

    public void setTeacherList(List<Teacher> teacherList) {
        this.teacherList = teacherList;
    }

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
