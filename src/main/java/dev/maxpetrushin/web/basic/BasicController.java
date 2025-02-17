package dev.maxpetrushin.web.basic;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BasicController {
    @RequestMapping("/home")
    public String home(@RequestParam(required = false) String color,
                       @RequestParam(required = false) String name,
                       Model page) {
        page.addAttribute("username", name);
        page.addAttribute("color", color);
        return "home.html";
    }

    @RequestMapping("/path/{id}")
    public String map(@PathVariable String id, Model page) {
        page.addAttribute("id", id);
        return "path.html";
    }
}
