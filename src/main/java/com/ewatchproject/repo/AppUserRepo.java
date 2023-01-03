package com.ewatchproject.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ewatchproject.entity.AppUser;

public interface AppUserRepo extends JpaRepository<AppUser,String> {

}
