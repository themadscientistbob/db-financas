package br.com.db_test.models;

import java.util.List;
import java.util.ArrayList;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
@Table (name = "Usuario")
class Usuario {
    @Id
    @GeneratedValue (strategy = jakarta.persistence.GenerationType.IDENTITY)
    @Column (name = "id")
    private Integer id;

    @Column (name = "nome")
    private String nome;

    @Column (name = "senha")
    private String senha;

    @OneToMany (mappedBy = "Usuario", cascade = CascadeType.ALL)
    private List<Gestao> Gestao = new ArrayList<>();

    public Usuario() {
    }

    public Usuario(Integer id, String nome, String senha, List<br.com.db_test.models.Gestao> gestao) {
        this.id = id;
        this.nome = nome;
        this.senha = senha;
        Gestao = gestao;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public List<Gestao> getGestao() {
        return Gestao;
    }

    public void setGestao(List<Gestao> gestao) {
        Gestao = gestao;
    }
}