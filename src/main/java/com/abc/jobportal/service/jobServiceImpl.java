package com.abc.jobportal.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abc.jobportal.entity.Jobs;
import com.abc.jobportal.repository.JobRepository;

@Service
public class jobServiceImpl implements Jobservice{
	@Autowired
	JobRepository jobRepository;
	
	
	@Override
	public List<Jobs> ExperienceFilter(int experience) {
		List<Jobs> frstList = jobRepository.findAll();
		List<Jobs> scndList = new ArrayList<Jobs>();
		for(Jobs job:frstList) {
			if(job.getExperience()==experience) {
				scndList.add(job);
			}
		}
		return scndList;
	}

	@Override
	public List<Jobs> LocationsFilter(String location) {
		List<Jobs> frstList1 = jobRepository.findAll();
		List<Jobs> scndList1 = new ArrayList<Jobs>();
		for(Jobs jobs:frstList1){
			if(jobs.getLocation().equalsIgnoreCase(location)) {
				scndList1.add(jobs);
			}
		}
		return scndList1;
	}

	@Override
	public List<Jobs> TechnologyFilter(String technology) {
		List<Jobs> frstList2 = jobRepository.findAll();
		List<Jobs> scndList2 = new ArrayList<Jobs>();
		for(Jobs jobs:frstList2) {
			if(jobs.getTechnology().equalsIgnoreCase(technology)){
				scndList2.add(jobs);
			}
		}
		return scndList2;
	}

	@Override
	public List<Jobs> SalaryFilter(int salary) {
		List<Jobs> frstList3 = jobRepository.findAll();
		List<Jobs> scndList3 = new ArrayList<Jobs>();
		for(Jobs jobs:frstList3) {
			if(jobs.getSalary()==salary){
				scndList3.add(jobs);
			}
		}
		return scndList3;
	
	}

	@Override
	public List<Jobs> RatingFilter(float rating) {
		List<Jobs> frstList4 = jobRepository.findAll();
		List<Jobs> scndList4 = new ArrayList<Jobs>();
		for(Jobs jobs:frstList4) {
			if(jobs.getRating()==rating){
				scndList4.add(jobs);
			}
		}
		return scndList4;
	
		
	}

	@Override
	public List<Jobs> viewApplied() {
		List<Jobs> frstList5 = jobRepository.findAll();
		List<Jobs> scndList5 = new ArrayList<Jobs>();
		for(Jobs jobs:frstList5) {
			if(jobs.getStatus().equalsIgnoreCase("Applied")){
				scndList5.add(jobs);
			}
		}
		return scndList5;
	
	}

	@Override
	public List<Jobs> AllJobs() {
		List<Jobs> lst1 = jobRepository.findAll();
		
		return lst1;
	}
	
	
	
	
}
