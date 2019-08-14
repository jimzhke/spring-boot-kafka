package com.heibaiying.springboot.bean;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
// 需要实现序列化接口
public class Programmer implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Programmer(String name, int age, float salary, Date date) {
		// TODO Auto-generated constructor stub
	    this.name = name;

	    this.age = age;

	    this.salary = salary;

	    this.birthday = date;
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

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	private String name;

    private int age;

    private float salary;

    private Date birthday;
}

