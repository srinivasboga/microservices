package com.boga.payment_service.service;

import com.boga.payment_service.entity.Payment;
import com.boga.payment_service.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class PaymentService {
	
	@Autowired
	public PaymentRepository service;
	
	public Payment doPayment(Payment payment) {
		payment.setTransactionId(UUID.randomUUID().toString());
		return service.save(payment);
	}
}
