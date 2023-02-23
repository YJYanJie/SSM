package com.yj.mybatis.pojo;

import java.util.List;

/**
 * ClassName: Dept
 * Package: com.yj.mybatis.pojo
 * Description:
 *
 * @Author YJ
 * @Create 2023/1/5 12:55
 * @Version 1.0
 */
public class Dept {

    private Integer deptId;
    private String deptName;
    private List<Emp> emps; //对多就是一个集合

    public Dept() {
    }

    public Dept(Integer deptId, String deptName) {
        this.deptId = deptId;
        this.deptName = deptName;
    }

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public List<Emp> getEmps() {
        return emps;
    }

    public void setEmps(List<Emp> emps) {
        this.emps = emps;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "deptId=" + deptId +
                ", deptName='" + deptName + '\'' +
                ", emps=" + emps +
                '}';
    }
}
