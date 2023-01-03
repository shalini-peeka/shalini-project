package com.ewatchproject.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ewatchproject.entity.Channel;
import com.ewatchproject.entity.Plan;
import com.ewatchproject.repo.PlanRepo;
import com.ewatchproject.service.IpromoterService;
@RestController
@RequestMapping("/plan")
public class PlanController {
	@Autowired
	private PlanRepo planrepo;
	@Autowired
	private IpromoterService Ipromoterservice;
	
	@GetMapping("/viewplans")
	public ResponseEntity<List<Plan>> viewPlans(@PathVariable long channelId) {
		List<Plan> plans = Ipromoterservice.viewPlans(channelId);
		if (plans.isEmpty()) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(plans);
	}

	@PostMapping("/addplan")
	public ResponseEntity<Plan> addPlan(@RequestBody Plan plan) {
		Plan plans = Ipromoterservice.addPlan(plan);
		if (plans == null) {
			return ResponseEntity.badRequest().build();
		}
		return ResponseEntity.ok(plans);
	}

	
}
