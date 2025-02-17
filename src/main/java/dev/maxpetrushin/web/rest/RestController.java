package dev.maxpetrushin.web.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RestController {
    @GetMapping("/rest")
    @ResponseBody
    public String rest() {
        return "Hello REST";
    }
}
