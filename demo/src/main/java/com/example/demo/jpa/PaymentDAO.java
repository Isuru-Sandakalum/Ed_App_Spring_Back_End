package com.example.demo.jpa;

import com.example.demo.model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentDAO extends JpaRepository<Payment , Integer>{
Payment findByPaymentId(Integer pID);
}
