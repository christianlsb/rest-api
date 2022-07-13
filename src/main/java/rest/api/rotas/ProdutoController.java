package rest.api.rotas;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import rest.api.model.Produto;
import rest.api.model.Usuario;
import rest.api.service.produto.ProdutoService;

import java.util.List;
import java.util.Optional;

@RestController
    public class ProdutoController {

    @Autowired
    ProdutoService produtoService;

    @GetMapping("/produto")
    public List<Produto> findAll() {return produtoService.findAll();}

    @GetMapping("/produto/{id}")
    public Optional<Produto> findById(@PathVariable long id) {return produtoService.findById(id);}

    @PostMapping("/produto")
    public String createNewUser(@RequestBody Produto produto){
        try {
            produtoService.save(produto);
            return "Novo produto criado";
        }catch (Exception e){
            throw new IllegalArgumentException("Erro", e);
        }
    }

}
