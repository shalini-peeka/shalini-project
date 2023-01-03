package com.ewatchproject.entity;


import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.springframework.stereotype.Component;
@Component
@Entity
public class Promoter {
	@Id
	private long promoterId;
	private String promoterName;
	@OneToMany(mappedBy="promoterEntity")
	private List<Channel> channels;
	@Override
	public String toString() {
		return "Promoter [promoterId=" + promoterId + ", promoterName=" + promoterName  + ", channels=" + channels + "]";
	}
	public Promoter() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Promoter(long promoterId, String promoterName, List<Channel> channels) {
		super();
		this.promoterId = promoterId;
		this.promoterName = promoterName;
		this.channels = channels;
	}
	public long getPromoterId() {
		return promoterId;
	}
	public void setPromoterId(long promoterId) {
		this.promoterId = promoterId;
	}
	public String getPromoterName() {
		return promoterName;
	}
	public void setName(String promoterName) {
		this.promoterName = promoterName;
	}
	public List<Channel> getChannels() {
		return channels;
	}
	public void setChannels(List<Channel> channels) {
		this.channels = channels;
	}
}
