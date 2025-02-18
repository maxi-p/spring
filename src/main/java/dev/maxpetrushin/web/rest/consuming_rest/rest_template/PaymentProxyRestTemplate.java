package dev.maxpetrushin.web.rest.consuming_rest.rest_template;

import dev.maxpetrushin.web.rest.consuming_rest.PaymentProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.UUID;
import java.util.logging.Logger;

@Component
public class PaymentProxyRestTemplate {
    private final RestTemplate restTemplate;
    private Logger logger = Logger.getLogger(PaymentProxyRestTemplate.class.getName());

    @Value("${name.service.url}")
    private String paymentServiceURL;

    @Autowired
    public PaymentProxyRestTemplate(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public PaymentProxy processPayment(PaymentProxy payment) {
        String uri = paymentServiceURL + "/payment";
        HttpHeaders headers = new HttpHeaders();
        String requestId = UUID.randomUUID().toString();
        logger.info("Payment processed: " + requestId);
        headers.add("requestId", requestId);
        HttpEntity<PaymentProxy> entity = new HttpEntity<>(payment, headers);

        ResponseEntity<PaymentProxy> response =
                restTemplate.exchange(
                        uri,
                        HttpMethod.POST,
                        entity,
                        PaymentProxy.class);

        return response.getBody();
    }
}
