package rest.api.service.usuario;

import rest.api.model.Usuario;
import rest.api.repository.usuario.UsuarioRepository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rest.api.service.usuario.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired

    UsuarioRepository usuarioRepository;

    @Override
    public List<Usuario> findAll() {
        return usuarioRepository.findAll();
    }

    @Override
    public Optional <Usuario> findById(long id) {
        return usuarioRepository.findById(id);
    }

    @Override
    public Usuario create(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    @Override
    public Usuario update(Usuario updatedUsuario, long id) {
        return usuarioRepository.findById(id)
                .map(u -> {
                    u.setNome(updatedUsuario.getNome());
                    u.setUsername(updatedUsuario.getUsername());
                    u.setSenha(updatedUsuario.getSenha());
                    return usuarioRepository.save(u);
                })
                .orElseGet(() ->{
                    updatedUsuario.setId(id);
                    return  usuarioRepository.save(updatedUsuario);
                });
    }

    @Override
    public void delete(long id) {
        usuarioRepository.deleteById(id);
    }

    @Override
    public Usuario save(Usuario usuario) {
        try {
            return usuarioRepository.save(usuario);
        }catch (Exception e){
            throw new IllegalArgumentException("Fudeo", e);
        }
    }

   
}