package com.ewatchproject.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.springframework.stereotype.Component;
@Component
@Entity
public class Channel {
	@Id
	private long channelId;
	private String channelName;
	@ManyToOne
	private Promoter promoterEntity;
	@OneToMany(mappedBy="channelEntity")
	private List<Plan> plans;
	@ManyToOne
	private AppUser appUserEntity;
	public Channel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Channel(long channelId, String channelName, Promoter promoterEntity, List<Plan> plans,
			AppUser appUserEntity) {
		super();
		this.channelId = channelId;
		this.channelName = channelName;
		this.promoterEntity = promoterEntity;
		this.plans = plans;
		this.appUserEntity = appUserEntity;
	}
	public long getChannelId() {
		return channelId;
	}
	public void setChannelId(long channelId) {
		this.channelId = channelId;
	}
	public String getChannelName() {
		return channelName;
	}
	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}
	public Promoter getPromoterEntity() {
		return promoterEntity;
	}
	public void setPromoterEntity(Promoter promoterEntity) {
		this.promoterEntity = promoterEntity;
	}
	public List<Plan> getPlans() {
		return plans;
	}
	public void setPlans(List<Plan> plans) {
		this.plans = plans;
	}
	public AppUser getAppUserEntity() {
		return appUserEntity;
	}
	public void setAppUserEntity(AppUser appUserEntity) {
		this.appUserEntity = appUserEntity;
	}
	

}
