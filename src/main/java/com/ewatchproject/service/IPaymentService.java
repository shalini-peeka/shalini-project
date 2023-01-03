package com.ewatchproject.service;

import com.ewatchproject.entity.Transaction;
import com.ewatchproject.exception.InvalidInputException;

public interface IPaymentService {
	public Transaction payBill(Transaction transaction) throws InvalidInputException;
    public String cancelTransaction(long transactionId);
    public Transaction viewTransaction(long transactionId);


}
