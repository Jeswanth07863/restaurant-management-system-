
package com.rest.services;

import com.rest.models.Payment;
import com.rest.repository.PaymentRepository;
import java.util.List;

public class PaymentService {

    private final PaymentRepository repository;
    private int nextPaymentId = 1;

    public PaymentService() {
        repository = new PaymentRepository();
    }

    public Payment processPayment(Object method, double amount) {
        if (method == null) {
            throw new IllegalArgumentException("Payment method cannot be null");
        }

        if (amount <= 0 || Double.isNaN(amount) || Double.isInfinite(amount)) {
            throw new IllegalArgumentException("Invalid payment amount");
        }

        String methodName = method.toString();
        Payment payment = new Payment(
            nextPaymentId++,
            amount,
            methodName,
            "SUCCESS"
        );

        repository.save(payment);
        return payment;
    }

    public List<Payment> getAllPayment() {
        return repository.findAll();
    }
}
