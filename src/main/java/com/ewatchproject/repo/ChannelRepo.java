package com.ewatchproject.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ewatchproject.entity.Channel;

public interface ChannelRepo extends JpaRepository<Channel,Long> {

}
