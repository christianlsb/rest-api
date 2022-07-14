package rest.api.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import javax.validation.constraints.Size;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Set;


@Entity(name = "Usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    
    @Size(max = 100)
    @NotNull
    private String nome;
    
    @Size(max = 100)
    @NotNull
    private String username;

    @Size(max = 100)
    @NotNull
    private String senha;

    @OneToMany(mappedBy = "usuario")
    @JsonManagedReference
    private Set<Produto> produtos_list;


    public Set<Produto> getProdutos_list() {
        return produtos_list;
    }

    public void setProdutos_list(Set<Produto> produtos_list) {
        this.produtos_list = produtos_list;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", username='" + username + '\'' +
                ", senha='" + senha + '\'' +
                '}';
    }
}