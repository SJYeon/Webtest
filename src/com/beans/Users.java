package com.beans;
// default package

import java.util.Date;


/**
 * Users entity. @author MyEclipse Persistence Tools
 */
public class Users extends AbstractUsers implements java.io.Serializable {

    // Constructors

    /** default constructor */
    public Users() {
    }

	/** minimal constructor */
    public Users(String name, String password, String email) {
        super(name, password, email);        
    }
    
    /** full constructor */
    public Users(String name, String password, Integer sex, Integer age, String email, Date birth, String constellation, String qq, String phone, String experience, String resume, Integer authentication, String portrait) {
        super(name, password, sex, age, email, birth, constellation, qq, phone, experience, resume, authentication, portrait);        
    }
   
}
