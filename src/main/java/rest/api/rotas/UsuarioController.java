package rest.api.rotas;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import rest.api.model.Usuario;
import rest.api.service.usuario.UsuarioService;

import java.util.List;
import java.util.Optional;


@RestController
public class UsuarioController {

    @Autowired
    UsuarioService usuarioService;

    @GetMapping("/usuario")
      public List<Usuario> findAll(){
         return usuarioService.findAll();
    }

    @GetMapping("/usuario/{id}")
      public Optional<Usuario> findById(@PathVariable long id){
         return usuarioService.findById(id);
    }

    @PostMapping("/usuario")
     public String createNewUser(@RequestBody Usuario usuario){
        try {
            usuarioService.save(usuario);
            return "Usuario criado";
        }catch (Exception e){
            throw new IllegalArgumentException("Erro", e);
        }
    }

    @PutMapping("/usuario/{id}")
    public Usuario update(@RequestBody Usuario usuario, @PathVariable long id){
        return  usuarioService.update(usuario, id);
    }


    @DeleteMapping("/usuario/{id}")
        public void delete(@PathVariable long id){
             usuarioService.delete(id);
    }



}
