package com.yj.mybatis.pojo;

public class Dept {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_dept.id
     *
     * @mbggenerated Mon Jan 30 21:06:00 CST 2023
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_dept.deptName
     *
     * @mbggenerated Mon Jan 30 21:06:00 CST 2023
     */
    private String deptname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_dept.address
     *
     * @mbggenerated Mon Jan 30 21:06:00 CST 2023
     */
    private String address;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_dept.id
     *
     * @return the value of t_dept.id
     *
     * @mbggenerated Mon Jan 30 21:06:00 CST 2023
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_dept.id
     *
     * @param id the value for t_dept.id
     *
     * @mbggenerated Mon Jan 30 21:06:00 CST 2023
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_dept.deptName
     *
     * @return the value of t_dept.deptName
     *
     * @mbggenerated Mon Jan 30 21:06:00 CST 2023
     */
    public String getDeptname() {
        return deptname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_dept.deptName
     *
     * @param deptname the value for t_dept.deptName
     *
     * @mbggenerated Mon Jan 30 21:06:00 CST 2023
     */
    public void setDeptname(String deptname) {
        this.deptname = deptname == null ? null : deptname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_dept.address
     *
     * @return the value of t_dept.address
     *
     * @mbggenerated Mon Jan 30 21:06:00 CST 2023
     */
    public String getAddress() {
        return address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_dept.address
     *
     * @param address the value for t_dept.address
     *
     * @mbggenerated Mon Jan 30 21:06:00 CST 2023
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    @Override
    public String toString() {
        return "Dept{" +
                "id=" + id +
                ", deptname='" + deptname + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}