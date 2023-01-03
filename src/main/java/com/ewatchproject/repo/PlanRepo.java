package com.ewatchproject.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ewatchproject.entity.Plan;

public interface PlanRepo extends JpaRepository<Plan,Long> {



}
