package com.ewatchproject.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.springframework.stereotype.Component;
@Component
@Entity
public class Plan {
	@Id
	private long planId;
	private String name;
	private double amountperMonth;
	private String detail;
	private float taxpercent;
	@ManyToOne
	private Channel channelEntity;
//	@ManyToOne
//	private AppUser appUserentity;
	
	public Plan() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Plan(long planId, String name, double amountperMonth, String detail, float taxpercent,
			Channel channelEntity) {
		super();
		this.planId = planId;
		this.name = name;
		this.amountperMonth = amountperMonth;
		this.detail = detail;
		this.taxpercent = taxpercent;
		this.channelEntity = channelEntity;
			}
	@Override
	public String toString() {
		return "Plan [planId=" + planId + ", name=" + name + ", amountperMonth=" + amountperMonth + ", detail=" + detail
				+ ", taxpercent=" + taxpercent + ", channelEntity=" + channelEntity + "]";
	}
	public long getPlanId() {
		return planId;
	}
	public void setPlanId(long planId) {
		this.planId = planId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getAmountperMonth() {
		return amountperMonth;
	}
	public void setAmountperMonth(double amountperMonth) {
		this.amountperMonth = amountperMonth;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public float getTaxpercent() {
		return taxpercent;
	}
	public void setTaxpercent(float taxpercent) {
		this.taxpercent = taxpercent;
	}
	public Channel getChannelEntity() {
		return channelEntity;
	}
	public void setChannelEntity(Channel channelEntity) {
		this.channelEntity = channelEntity;
	}
	
		

}
