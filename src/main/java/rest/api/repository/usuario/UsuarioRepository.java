package rest.api.repository.usuario;

import org.springframework.data.jpa.repository.JpaRepository;
import rest.api.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    

}
