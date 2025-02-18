package dev.maxpetrushin.web.rest.consuming_rest.open_feign;

import dev.maxpetrushin.web.rest.consuming_rest.PaymentProxy;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(name="payments", url="${name.service.url}")
public interface PaymentServiceProxy {
    @PostMapping("/payment")
    PaymentProxy processPayment(@RequestHeader String requestId, @RequestBody PaymentProxy payment);
}
