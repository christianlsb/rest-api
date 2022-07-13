package rest.api.service.usuario;

import org.jboss.jandex.TypeTarget;
import rest.api.model.Usuario;

import java.util.List;
import java.util.Optional;

public interface UsuarioService {
    public List<Usuario> findAll();
    public Optional <Usuario> findById(long id);
    public Usuario create(Usuario usuario);
    public Usuario update(Usuario usuario, long id);
    public void delete (long id);
    public Usuario save(Usuario usuario);
}
