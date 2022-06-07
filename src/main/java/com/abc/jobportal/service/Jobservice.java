package com.abc.jobportal.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.abc.jobportal.entity.Jobs;

@Service
public interface Jobservice {
	public List<Jobs> AllJobs();
	public List<Jobs> ExperienceFilter(int experience);
	public List<Jobs> LocationsFilter(String location);
	public List<Jobs> TechnologyFilter(String technology);
	public List<Jobs> SalaryFilter(int salary);
	public List<Jobs> RatingFilter(float rating);
	public List<Jobs> viewApplied();
	

}
