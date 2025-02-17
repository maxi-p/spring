package dev.maxpetrushin.web.rest.request_body;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestBodyControllerREST {
    @PostMapping("/req-body")
    public ResponseEntity<String> reqMappingPost(@RequestBody ReqBodyREST reqBody) {
        String text = reqBody.getText();
        return ResponseEntity.ok(text);
    }

    @GetMapping("/req-body")
    public ResponseEntity<String> reqMappingGet(@RequestBody ReqBodyREST reqBody) {
        String text = reqBody.getText();
        return ResponseEntity.ok(text);
    }
}
