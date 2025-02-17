package dev.maxpetrushin.web.rest.exception;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentControllerREST {
    private final PaymentServiceREST paymentServiceREST;

    @Autowired
    public PaymentControllerREST(PaymentServiceREST paymentServiceREST) {
        this.paymentServiceREST = paymentServiceREST;
    }

    @GetMapping("/payment")
    public ResponseEntity<?> payment() {
        try {
            PaymentDetailsREST paymentDetails = paymentServiceREST.processPayment();
            return ResponseEntity
                    .status(HttpStatus.ACCEPTED)
                    .body(paymentDetails);
        } catch (NotEnoughMoneyException e) {
            ErrorDetailsREST errorDetails = new ErrorDetailsREST();
            errorDetails.setMessage("Not enough money");
            return ResponseEntity
                    .badRequest()
                    .body(errorDetails);
        }
    }

    @GetMapping("/payment-aop")
    public ResponseEntity<PaymentDetailsREST> paymentAop() {
        PaymentDetailsREST paymentDetails = paymentServiceREST.processPayment2();
        return ResponseEntity
                .status(HttpStatus.ACCEPTED)
                .body(paymentDetails);
    }
}
