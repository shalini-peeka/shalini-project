package com.ewatchproject.service.Impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ewatchproject.entity.AppUser;
import com.ewatchproject.entity.LoginDTO;
import com.ewatchproject.exception.AppUserException;
import com.ewatchproject.repo.AppUserRepo;
import com.ewatchproject.service.AppUserService;

@Service
public class AppUserServiceImpl implements AppUserService{

	@Autowired
	private AppUserRepo repo;
	
	@Override
	public AppUser validate(LoginDTO dto) {

		AppUser appuser = repo.findById(dto.getUserName()).orElse(null);
		if(appuser!=null && appuser.getPassword().equals(dto.getPassword())) {
			return appuser;
		}
		return null;

	}

	@Override

	public AppUser register(AppUser appuser) throws AppUserException {
		Optional<AppUser> existingAppUser=repo.findById(appuser.getUserName());
		if(existingAppUser.isPresent()){
			throw new AppUserException("App User Already exists");
		}
		else{
			return repo.save(appuser);
	     }

	}
}
