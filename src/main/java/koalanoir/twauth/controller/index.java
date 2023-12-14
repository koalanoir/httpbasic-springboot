package koalanoir.twauth.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class index {
    @GetMapping("/")
    public String publicInfo() {
        return " Connexion reussi!";
    }
}
