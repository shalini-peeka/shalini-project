package com.ewatchproject.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ewatchproject.entity.Transaction;

public interface TransactionRepo extends JpaRepository<Transaction,Long> {

}
