package com.ewatchproject.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ewatchproject.entity.Transaction;
import com.ewatchproject.exception.InvalidInputException;
import com.ewatchproject.service.IPaymentService;

 


@RestController
@RequestMapping("/transaction")
public class TransactionController {
	@Autowired
    private IPaymentService iPaymentServiceImpl;
    @PostMapping("/addPayment")
    public Transaction payBill(@RequestBody Transaction transaction) throws InvalidInputException {
        Transaction payment=iPaymentServiceImpl.payBill(transaction);
        return payment;
    }
    @DeleteMapping("/cancelTransaction/{id}")
    public String cancelTransaction(@PathVariable("id") Long transactionId) {
        String message = iPaymentServiceImpl.cancelTransaction(transactionId);
        return message;
    }
    @GetMapping("/viewTransaction/{id}")
    public Transaction viewTransaction(@PathVariable("id")Long transactionId) {
        Transaction viewPayments = iPaymentServiceImpl.viewTransaction(transactionId);
        return viewPayments;
    }
 

 
 

}