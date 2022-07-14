package rest.api.model;


import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@Entity(name = "Produto")
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Size(max = 100)
    @NotNull
    private String nomeDoProduto;

    @Size(max = 150)
    @NotNull
    private String quantidadeDoProduto;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    @JsonBackReference
    private Usuario usuario;

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Produto() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeDoProduto() {
        return nomeDoProduto;
    }

    public void setNomeDoProduto(String nomeDoProduto) {
        this.nomeDoProduto = nomeDoProduto;
    }

    public String getQuantidadeDoProduto() {
        return quantidadeDoProduto;
    }

    public void setQuantidadeDoProduto(String quantidadeDoProduto) {
        this.quantidadeDoProduto = quantidadeDoProduto;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "id=" + id +
                ", nomeDoProduto='" + nomeDoProduto + '\'' +
                ", quantidadeDoProduto='" + quantidadeDoProduto + '\'' +
                '}';
    }
}
