package com.demo.model;

public class teachar {
	
	private Integer edu_teacher_id;
	private String edu_teacher_name;
	private String edu_teacher_education; 
	private String edu_teacher_career; 
	//头衔 1高级讲师2首席讲师
	private Integer edu_teacher_is_star; 
	private String edu_teacher_pic_path;
	//状态:0正常1删除
	private Integer edu_teacher_status; 
	private String edu_teacher_create_time; 
	private String edu_teacher_update_time; 
	private Integer edu_teacher_subject_id; 
	private Integer edu_teacher_sort ;
	public Integer getEdu_teacher_id() {
		return edu_teacher_id;
	}
	public void setEdu_teacher_id(Integer edu_teacher_id) {
		this.edu_teacher_id = edu_teacher_id;
	}
	public String getEdu_teacher_name() {
		return edu_teacher_name;
	}
	public void setEdu_teacher_name(String edu_teacher_name) {
		this.edu_teacher_name = edu_teacher_name;
	}
	public String getEdu_teacher_education() {
		return edu_teacher_education;
	}
	public void setEdu_teacher_education(String edu_teacher_education) {
		this.edu_teacher_education = edu_teacher_education;
	}
	public String getEdu_teacher_career() {
		return edu_teacher_career;
	}
	public void setEdu_teacher_career(String edu_teacher_career) {
		this.edu_teacher_career = edu_teacher_career;
	}
	public Integer getEdu_teacher_is_star() {
		return edu_teacher_is_star;
	}
	public void setEdu_teacher_is_star(Integer edu_teacher_is_star) {
		this.edu_teacher_is_star = edu_teacher_is_star;
	}
	public String getEdu_teacher_pic_path() {
		return edu_teacher_pic_path;
	}
	public void setEdu_teacher_pic_path(String edu_teacher_pic_path) {
		this.edu_teacher_pic_path = edu_teacher_pic_path;
	}
	public Integer getEdu_teacher_status() {
		return edu_teacher_status;
	}
	public void setEdu_teacher_status(Integer edu_teacher_status) {
		this.edu_teacher_status = edu_teacher_status;
	}
	public String getEdu_teacher_create_time() {
		return edu_teacher_create_time;
	}
	public void setEdu_teacher_create_time(String edu_teacher_create_time) {
		this.edu_teacher_create_time = edu_teacher_create_time;
	}
	public String getEdu_teacher_update_time() {
		return edu_teacher_update_time;
	}
	public void setEdu_teacher_update_time(String edu_teacher_update_time) {
		this.edu_teacher_update_time = edu_teacher_update_time;
	}
	public Integer getEdu_teacher_subject_id() {
		return edu_teacher_subject_id;
	}
	public void setEdu_teacher_subject_id(Integer edu_teacher_subject_id) {
		this.edu_teacher_subject_id = edu_teacher_subject_id;
	}
	public Integer getEdu_teacher_sort() {
		return edu_teacher_sort;
	}
	public void setEdu_teacher_sort(Integer edu_teacher_sort) {
		this.edu_teacher_sort = edu_teacher_sort;
	}
}
