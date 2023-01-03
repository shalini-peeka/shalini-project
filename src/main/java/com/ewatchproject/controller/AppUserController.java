package com.ewatchproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ewatchproject.entity.AppUser;
import com.ewatchproject.entity.LoginDTO;
import com.ewatchproject.exception.AppUserException;
import com.ewatchproject.service.AppUserService;

 
@RestController
@RequestMapping("/appuser")
public class AppUserController {

	@Autowired
	private AppUserService service;
	
	@PostMapping("/validate")
	public ResponseEntity<?> validate (@RequestBody LoginDTO dto){
		System.out.println(dto);
		AppUser appuser = service.validate(dto);
		if(appuser==null) {
			return ResponseEntity.badRequest().body("Incorrect userName OR Password");
		}
		return ResponseEntity.ok(appuser);
	}

	@PostMapping("/register")
	public ResponseEntity<AppUser> createNewAppUser( @RequestBody AppUser appuser) throws AppUserException{
		
		return new ResponseEntity<AppUser>(service.register(appuser),HttpStatus.CREATED);
	}
		
}

