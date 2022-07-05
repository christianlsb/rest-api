package rest.api.rotas;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/users")
    public ResponseEntity<String> alarraquiba(){
        return ResponseEntity.ok("Olá =)");
    }

}
