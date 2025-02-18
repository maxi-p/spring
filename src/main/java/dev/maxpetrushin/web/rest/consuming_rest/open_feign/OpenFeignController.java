package dev.maxpetrushin.web.rest.consuming_rest.open_feign;

import dev.maxpetrushin.web.rest.consuming_rest.PaymentProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;
import java.util.logging.Logger;

@RestController
public class OpenFeignController {
    private final PaymentServiceProxy paymentServiceProxy;
    private final Logger logger = Logger.getLogger(OpenFeignController.class.getName());

    @Autowired
    public OpenFeignController(PaymentServiceProxy paymentServiceProxy) {
        this.paymentServiceProxy = paymentServiceProxy;
    }

    @PostMapping("/consuming-rest/open-feign")
    public ResponseEntity<PaymentProxy> processPayment(@RequestBody PaymentProxy paymentProxy) {
        String requestId = UUID.randomUUID().toString();
        paymentServiceProxy.processPayment(requestId, paymentProxy);
        logger.info("Payment processed: " + requestId);
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(paymentProxy);
    }
}
