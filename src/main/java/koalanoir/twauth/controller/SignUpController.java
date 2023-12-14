package koalanoir.twauth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class SignUpController {
    @GetMapping("/api/signup")
    public String publicInfo() {
        return " inscription";
    }
}
