package com.test.test8;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;


@AllArgsConstructor
@Data
public class SysUser {

    private String id;

    //姓名
    private String name;

    //年龄
    private int age;

    //工号
    private String jobNumber;

    //性别
    private String sex;

    //入职日期
    private Date entryDate;

    //家庭成员数量
    private BigDecimal familyMemberQuantity;

    public SysUser() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    public String getJobNumber() {
        return jobNumber;
    }

    public void setJobNumber(String jobNumber) {
        this.jobNumber = jobNumber;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
    }

    public BigDecimal getFamilyMemberQuantity() {
        return familyMemberQuantity;
    }

    public void setFamilyMemberQuantity(BigDecimal familyMemberQuantity) {
        this.familyMemberQuantity = familyMemberQuantity;
    }
}
