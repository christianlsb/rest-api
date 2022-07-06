package rest.api.rotas;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;

import rest.api.model.Usuario;
import rest.api.service.UsuarioService;

import java.util.List;
import java.util.Optional;


@RestController
public class UsuarioController {

    @Autowired
    UsuarioService usuarioService;

    @GetMapping("/user")
      public List<Usuario> findAll(){
         return usuarioService.findAll();
    }

    @GetMapping("/user/{id}")
      public Optional<Usuario> findById(@PathVariable long id){
         return usuarioService.findById(id);
    }

    @PostMapping("/createUser")
     public String createNewUser(@RequestBody Usuario usuario){
        try {
            usuarioService.save(usuario);
            return "Usuario criado";
        }catch (Exception e){
            throw new IllegalArgumentException("Erro", e);
        }
    }


}
