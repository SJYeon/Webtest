package com.beans;
// default package

import java.util.Date;


/**
 * AbstractUsers entity provides the base persistence definition of the Users entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractUsers  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private String name;
     private String password;
     private Integer sex;
     private Integer age;
     private String email;
     private Date birth;
     private String constellation;
     private String qq;
     private String phone;
     private String experience;
     private String resume;
     private Integer authentication;
     private String portrait;


    // Constructors

    /** default constructor */
    public AbstractUsers() {
    }

	/** minimal constructor */
    public AbstractUsers(String name, String password, String email) {
        this.name = name;
        this.password = password;
        this.email = email;
    }
    
    /** full constructor */
    public AbstractUsers(String name, String password, Integer sex, Integer age, String email, Date birth, String constellation, String qq, String phone, String experience, String resume, Integer authentication, String portrait) {
        this.name = name;
        this.password = password;
        this.sex = sex;
        this.age = age;
        this.email = email;
        this.birth = birth;
        this.constellation = constellation;
        this.qq = qq;
        this.phone = phone;
        this.experience = experience;
        this.resume = resume;
        this.authentication = authentication;
        this.portrait = portrait;
    }

   
    // Property accessors

    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getSex() {
        return this.sex;
    }
    
    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return this.age;
    }
    
    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBirth() {
        return this.birth;
    }
    
    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public String getConstellation() {
        return this.constellation;
    }
    
    public void setConstellation(String constellation) {
        this.constellation = constellation;
    }

    public String getQq() {
        return this.qq;
    }
    
    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getPhone() {
        return this.phone;
    }
    
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getExperience() {
        return this.experience;
    }
    
    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getResume() {
        return this.resume;
    }
    
    public void setResume(String resume) {
        this.resume = resume;
    }

    public Integer getAuthentication() {
        return this.authentication;
    }
    
    public void setAuthentication(Integer authentication) {
        this.authentication = authentication;
    }

    public String getPortrait() {
        return this.portrait;
    }
    
    public void setPortrait(String portrait) {
        this.portrait = portrait;
    }
   








}