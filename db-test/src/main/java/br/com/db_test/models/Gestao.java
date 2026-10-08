package br.com.db_test.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
@Table (name = "Gestao")
class Gestao {
    @Id
    @GeneratedValue (strategy = jakarta.persistence.GenerationType.IDENTITY)
    @Column (name = "id")
    private Integer id;

    @Column (name = "entrada")
    private Integer entrada;

    @Column (name = "saida")
    private Integer saida;

    @Column (name = "receitaLiquida")
    private Integer receitaLiquida;

    @ManyToOne
    @JoinColumn (name = "UsuarioId")
    private Usuario usuario;

    public Gestao() {
    }

    public Gestao(Integer id, Integer entrada, Integer saida, Integer receitaLiquida, Usuario usuario) {
        this.id = id;
        this.entrada = entrada;
        this.saida = saida;
        this.receitaLiquida = receitaLiquida;
        this.usuario = usuario;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getEntrada() {
        return entrada;
    }

    public void setEntrada(Integer entrada) {
        this.entrada = entrada;
    }

    public Integer getSaida() {
        return saida;
    }

    public void setSaida(Integer saida) {
        this.saida = saida;
    }

    public Integer getReceitaLiquida() {
        return receitaLiquida;
    }

    public void setReceitaLiquida(Integer receitaLiquida) {
        this.receitaLiquida = receitaLiquida;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}