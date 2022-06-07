package com.abc.jobportal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abc.jobportal.entity.Jobs;


@Repository
public interface JobRepository extends JpaRepository<Jobs,Integer> {

}
