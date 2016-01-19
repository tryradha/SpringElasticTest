package com.radha.sample.elastic.bean;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldIndex;
import org.springframework.data.elasticsearch.annotations.FieldType;

@Document(indexName = "user")
public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	private String id;

	@Field(index = FieldIndex.analyzed, type = FieldType.String, indexAnalyzer = "standard", store = true)
	private String name;

	@Field(index = FieldIndex.analyzed, type = FieldType.Integer, indexAnalyzer = "standard", store = true)
	private Integer age;

	@Field(index = FieldIndex.analyzed, type = FieldType.Date, indexAnalyzer = "standard", store = true)
	private Date registrationDate;
	@Field(index = FieldIndex.analyzed, type = FieldType.Date, indexAnalyzer = "standard", store = true)
	private Date dob;
	@Field(index = FieldIndex.analyzed, type = FieldType.Integer, indexAnalyzer = "standard", store = true)
	private Integer score;
	@Field(index = FieldIndex.analyzed, type = FieldType.Boolean, indexAnalyzer = "standard", store = true)
	private Boolean isActive;

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

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Date getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(Date registrationDate) {
		this.registrationDate = registrationDate;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public Integer getScore() {
		return score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

}
