package com.app.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;

import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="Student")
public class User {

	private String school_name;
	private String student_name;
	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String email;
	private String phone;
	private String city;
	private String state;
	private String zip;
	private String parent_name;
	private String Date_of_begin;
	private String Address;
	public String getSchool_name() {
		return school_name;
	}
	public void setSchool_name(String school_name) {
		this.school_name = school_name;
	}
	public String getStudent_name() {
		return student_name;
	}
	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getParent_name() {
		return parent_name;
	}
	public void setParent_name(String parent_name) {
		this.parent_name = parent_name;
	}
	public String getDate_of_begin() {
		return Date_of_begin;
	}
	public void setDate_of_begin(String date_of_begin) {
		Date_of_begin = date_of_begin;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	@Override
	public String toString() {
		return "User [school_name=" + school_name + ", student_name=" + student_name + ", email=" + email + ", phone="
				+ phone + ", city=" + city + ", state=" + state + ", zip=" + zip + ", parent_name=" + parent_name
				+ ", Date_of_begin=" + Date_of_begin + ", Address=" + Address + "]";
	}
	
}
