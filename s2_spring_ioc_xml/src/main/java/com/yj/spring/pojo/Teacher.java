package com.yj.spring.pojo;

/**
 * Description:
 *
 * @Author YJ
 * @Create 2023/1/31 16:57
 * @Version 1.0
 */
public class Teacher {

   private Integer tid;

   private String tname;

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "tid=" + tid +
                ", tname='" + tname + '\'' +
                '}';
    }
}
