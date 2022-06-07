package com.abc.jobportal.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abc.jobportal.entity.Jobs;
import com.abc.jobportal.service.Jobservice;

@RestController
@CrossOrigin(origins= {"http://localhost:8080","http://localhost:4200"},allowedHeaders="*")
@RequestMapping("/job")
public class JobRestController {
	
	@Autowired
	Jobservice jobService;
	
	@GetMapping("/experience/{experience}")
	public List<Jobs> FilterByExperience(@PathVariable int experience){
		List<Jobs> lst1 = jobService.ExperienceFilter(experience);
		return lst1;
	}
	@GetMapping("/locations/{location}")
	public List<Jobs> FilterByLocations(@PathVariable String location){
		List<Jobs> lst2 = jobService.LocationsFilter(location);
		return lst2;
	}
	@GetMapping("/technologies/{technology}")
	public List<Jobs> FilterByTechnology(@PathVariable String technology){
		List<Jobs> lst3 = jobService.TechnologyFilter(technology);
		return lst3;
	}
	@GetMapping("/salaries/{salary}")
	public List<Jobs> FilterByTechnology(@PathVariable int salary){
		List<Jobs> lst4 = jobService.SalaryFilter(salary);
		return lst4;
	}
	@GetMapping("/ratings/{rating}")
	public List<Jobs> FilterByTechnology(@PathVariable float rating){
		List<Jobs> lst5 = jobService.RatingFilter(rating);
		return lst5;
	}
	@GetMapping("/Appliedjobs")
	public List<Jobs> getApplied(){
		List<Jobs> lst5 = jobService.viewApplied();
		return lst5;
	}
	@GetMapping("/Jobs")
	public List<Jobs> getJobs(){
		return jobService.AllJobs();
	}
	
	
	

}
