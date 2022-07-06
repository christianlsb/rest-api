package rest.api.service;

import rest.api.model.Usuario;
import rest.api.repository.UsuarioRepository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
    public Usuario update(Usuario usuario, long id) {
        return null;
    }

    @Override
    public void delete(long id) {
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