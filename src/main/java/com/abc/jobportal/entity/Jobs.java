package com.abc.jobportal.entity;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Jobs")
public class Jobs {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int jobId;
	private String company;
	private String jobTitle;
	private int experience;
	private int salary;
	private String technology;
	private float rating;
	private String location;
	private String status;
	private String education;
	private String WorkType;
	public Jobs() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Jobs(int jobId, String company, String jobTitle, int experience, int salary, String technology, float rating,
			String location, String status, String education, String workType) {
		super();
		this.jobId = jobId;
		this.company = company;
		this.jobTitle = jobTitle;
		this.experience = experience;
		this.salary = salary;
		this.technology = technology;
		this.rating = rating;
		this.location = location;
		this.status = status;
		this.education = education;
		WorkType = workType;
	}
	public int getJobId() {
		return jobId;
	}
	public void setJobId(int jobId) {
		this.jobId = jobId;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getTechnology() {
		return technology;
	}
	public void setTechnology(String technology) {
		this.technology = technology;
	}
	public float getRating() {
		return rating;
	}
	public void setRating(float rating) {
		this.rating = rating;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getEducation() {
		return education;
	}
	public void setEducation(String education) {
		this.education = education;
	}
	public String getWorkType() {
		return WorkType;
	}
	public void setWorkType(String workType) {
		WorkType = workType;
	}
	@Override
	public int hashCode() {
		return Objects.hash(WorkType, company, education, experience, jobId, jobTitle, location, rating, salary, status,
				technology);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Jobs other = (Jobs) obj;
		return Objects.equals(WorkType, other.WorkType) && Objects.equals(company, other.company)
				&& Objects.equals(education, other.education) && experience == other.experience && jobId == other.jobId
				&& Objects.equals(jobTitle, other.jobTitle) && Objects.equals(location, other.location)
				&& Float.floatToIntBits(rating) == Float.floatToIntBits(other.rating) && salary == other.salary
				&& Objects.equals(status, other.status) && Objects.equals(technology, other.technology);
	}
	@Override
	public String toString() {
		return "Jobs [jobId=" + jobId + ", company=" + company + ", jobTitle=" + jobTitle + ", experience=" + experience
				+ ", salary=" + salary + ", technology=" + technology + ", rating=" + rating + ", location=" + location
				+ ", status=" + status + ", education=" + education + ", WorkType=" + WorkType + "]";
	}
	

}
