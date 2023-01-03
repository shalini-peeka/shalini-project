package com.ewatchproject.service;


import java.util.List;

import com.ewatchproject.entity.Channel;
import com.ewatchproject.entity.Plan;
import com.ewatchproject.exception.InvalidSubscriptionException;

public interface IcustomerService {
	public List<Channel> viewChannel();
	public List<Plan> viewPlans();
	public String subscribeChannelPlan(long channelId, long planId) throws InvalidSubscriptionException;
	public String unsubscribeChannelPlan(long channelId,long planId) throws InvalidSubscriptionException ;
	public List<Channel> viewSubscriptions(String UserName);
}
