package dev.maxpetrushin.web.rest.consuming_rest.rest_template;

import dev.maxpetrushin.web.rest.consuming_rest.PaymentProxy;
import feign.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestTemplateController {
    private final PaymentProxyRestTemplate paymentProxyRestTemplate;

    @Autowired
    public RestTemplateController(PaymentProxyRestTemplate paymentProxyRestTemplate) {
        this.paymentProxyRestTemplate = paymentProxyRestTemplate;
    }

    @PostMapping("consuming-rest/rest-template")
    public ResponseEntity<PaymentProxy> consumingRestTemplate(@RequestBody PaymentProxy paymentProxy) {
        PaymentProxy response = paymentProxyRestTemplate.processPayment(paymentProxy);
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(response);
    }
}
