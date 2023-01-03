package com.ewatchproject.service;

import com.ewatchproject.entity.AppUser;
import com.ewatchproject.entity.LoginDTO;
import com.ewatchproject.exception.AppUserException;

 

public interface AppUserService {

	public AppUser validate(LoginDTO dto);
	public AppUser register(AppUser appuser) throws AppUserException;

}