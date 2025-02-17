package dev.maxpetrushin.web.rest.exception;

import org.springframework.stereotype.Service;

@Service
public class PaymentServiceREST {
    public PaymentDetailsREST processPayment() {
        throw new NotEnoughMoneyException();
    }

    public PaymentDetailsREST processPayment2() {
        throw new UnknownMoneyException();
    }
}
