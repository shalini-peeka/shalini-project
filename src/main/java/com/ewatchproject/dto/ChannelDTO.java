//package com.ewatchproject.dto;
//
//import java.util.List;
//
//import javax.persistence.Entity;
//import javax.persistence.Id;
//
//import com.ewatchproject.entity.Plan;
//@Entity
//public class ChannelDTO {
//	@Id
//	private long channelId;
//	private String channelName;
//	private List<Plan> plans;
//	@Override
//	public String toString() {
//		return "ChannelDTO [channelId=" + channelId + ", channelName=" + channelName + ", plans=" + plans + "]";
//	}
//	public ChannelDTO(long channelId, String channelName, List<Plan> plans) {
//		super();
//		this.channelId = channelId;
//		this.channelName = channelName;
//		this.plans = plans;
//	}
//	public long getChannelId() {
//		return channelId;
//	}
//	public void setChannelId(long channelId) {
//		this.channelId = channelId;
//	}
//	public String getChannelName() {
//		return channelName;
//	}
//	public void setChannelName(String channelName) {
//		this.channelName = channelName;
//	}
//	public List<Plan> getPlans() {
//		return plans;
//	}
//	public void setPlans(List<Plan> plans) {
//		this.plans = plans;
//	}
//}
