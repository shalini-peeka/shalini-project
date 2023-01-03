package com.ewatchproject.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.ewatchproject.enums.status;
@Entity
public class Transaction {
	@Id
	@GeneratedValue
	private long transactionId;
	private long customerId;
	private long planId;
	private double amount;
	private status paymentStatus;
	private String comments;
	public Transaction(long transactionId, long customerId, long planId, double amount, status paymentStatus,
			String comments) {
		super();
		this.transactionId = transactionId;
		this.customerId = customerId;
		this.planId = planId;
		this.amount = amount;
		paymentStatus = paymentStatus;
		this.comments = comments;
	}
	@Override
	public String toString() {
		return "Transaction [transactionId=" + transactionId + ", customerId=" + customerId + ", planId=" + planId
				+ ", amount=" + amount + ", PaymentStatus=" + paymentStatus + ", comments=" + comments + "]";
	}
	public long getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(long transactionId) {
		this.transactionId = transactionId;
	}
	public long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}
	public long getPlanId() {
		return planId;
	}
	public void setPlanId(long planId) {
		this.planId = planId;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public status getPaymentStatus() {
		return paymentStatus;
	}
	public void setPaymentStatus(status paymentStatus) {
		paymentStatus = paymentStatus;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}

}
