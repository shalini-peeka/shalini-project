package com.ewatchproject.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ewatchproject.entity.Transaction;
import com.ewatchproject.exception.InvalidInputException;
import com.ewatchproject.repo.TransactionRepo;
import com.ewatchproject.service.IPaymentService;

 
@Service
public class IpaymentServiceImpl implements IPaymentService {
	 @Autowired
	    private TransactionRepo transactionRepo;

	    public IpaymentServiceImpl(TransactionRepo transactionRepo) {
	        this.transactionRepo=transactionRepo;
	    }
	    
	   @Override 
	   public Transaction payBill(Transaction transaction) throws InvalidInputException {
		Transaction payment= new Transaction();
        if(transaction.getAmount() == 0 || transaction.getCustomerId()==0)  {
            throw new InvalidInputException("Invalid Input");
        }
        else {
            payment.setComments(transaction.getComments());
            payment.setChannelId(transaction.getChannelId());
            payment.setPlanId(transaction.getPlanId());
            payment.setCustomerId(transaction.getCustomerId());
            payment.setAmount(transaction.getAmount());
            payment.setStatus(transaction.getStatus());
            payment.setPaidBy(transaction.getPaidBy());
            Transaction save = this.transactionRepo.save(transaction);
            return save;
        }

	}

	@Override
	public String cancelTransaction(long transactionId) {
		Transaction transaction=transactionRepo.findById(transactionId).orElseThrow();
        if(transaction==null) {
            throw new NullPointerException("Empty");
        }
        transactionRepo.delete(transaction);
        return "Cancelled";
	}

	@Override
	public Transaction viewTransaction(long transactionId) {
		 Transaction transaction=transactionRepo.findById(transactionId).orElseThrow();
	        if(transaction==null) {
	            throw new NullPointerException("Empty");
	        }
	        else {
	        Transaction viewPayments=transaction;
	        return viewPayments;    
	        }
	}
	
  
}
