package com.ewatchproject.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.ewatchproject.enums.PaymentStatus;
import com.ewatchproject.enums.PaymentType;
@Entity
public class Transaction {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long transactionId;
    private long customerId;
    private long channelId;
    private long planId;
    private double amount;
    private PaymentStatus status;
    private PaymentType paidBy;
    private String comments;
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
    public long getChannelId() {
        return channelId;
    }
    public void setChannelId(long channelId) {
        this.channelId = channelId;
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
    public PaymentStatus getStatus() {
        return status;
    }
    public void setStatus(PaymentStatus status) {
        this.status = status;
    }
    public String getComments() {
        return comments;
    }
    public void setComments(String comments) {
        this.comments = comments;
    }

    public PaymentType getPaidBy() {
        return paidBy;
    }
    public void setPaidBy(PaymentType paidBy) {
        this.paidBy = paidBy;
    }
        @Override
    public String toString() {
        return "Transaction [transactionId=" + transactionId + ", customerId=" + customerId + ", channelId=" + channelId
                + ", planId=" + planId + ", amount=" + amount + ", status=" + status + ", paidBy=" + paidBy
                + ", comments=" + comments + "]";
    }
        public Transaction(long transactionId, long customerId, long channelId, long planId, double amount,
            PaymentStatus status, String comments, PaymentType paidBy) {
        super();
        this.transactionId = transactionId;
        this.customerId = customerId;
        this.channelId = channelId;
        this.planId = planId;
        this.amount = amount;
        this.status = status;
        this.paidBy= paidBy;
        this.comments = comments;
    }
    public Transaction() {
        super();
        // TODO Auto-generated constructor stub
    }

}
