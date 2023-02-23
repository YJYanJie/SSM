package com.yj.spring.pojo;

import java.util.List;

/**
 * Description:
 *
 * @Author YJ
 * @Create 2023/1/31 16:27
 * @Version 1.0
 */
public class Clazz {

    private Integer cid;

    private String cname;

    private List<Student> students;

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Clazz{" +
                "cid=" + cid +
                ", cname='" + cname + '\'' +
                ", students=" + students +
                '}';
    }
}
