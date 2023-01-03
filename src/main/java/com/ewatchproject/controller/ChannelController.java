package com.ewatchproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

import com.ewatchproject.entity.Channel;
import com.ewatchproject.repo.ChannelRepo;
import com.ewatchproject.service.IpromoterService;

@RestController
@RequestMapping("/channels")
public class ChannelController {
	@Autowired
	private IpromoterService Ipromoterservice;
	//get all channels
	@GetMapping("/viewchannel")
	public ResponseEntity<List<Channel>> viewChannels(@PathVariable Long promoterId){
		List<Channel> channels = Ipromoterservice.viewChannels(promoterId);
		if(channels.isEmpty()) {
		return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(channels);
	}
	
	@PostMapping("/add")
	public ResponseEntity<Channel> addChannel(@RequestBody Channel channel) {
		Channel addedChannel = Ipromoterservice.addChannel(channel);
		if (addedChannel == null) {
			return ResponseEntity.badRequest().build();
		}
		return ResponseEntity.ok(addedChannel);
	}
	
	@PutMapping("/updatechannelplan")
	public ResponseEntity<Channel> updateChannelPlan(@PathVariable Long id , @RequestParam Long channelID){
		Channel updatechannel = Ipromoterservice.updateChannelPlan(id,channelID);
		if(updatechannel == null) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(updatechannel);
	}
	
	@PutMapping("/updateChannel")
	@RequestMapping(name = "updateChannelMethod1")
	public ResponseEntity<Channel> updateChannel(@PathVariable long channelId) {
		Channel updatedChannel = Ipromoterservice.updateChannel(channelId);
		if (updatedChannel == null) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(updatedChannel);	
	}
	

}