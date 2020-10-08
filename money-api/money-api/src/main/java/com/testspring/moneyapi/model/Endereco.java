package com.testspring.moneyapi.model;


import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.validation.constraints.NotNull;
import java.util.Objects;

@Embeddable
public class Endereco {

    private String logradouro;

    private String numero;
    private String complemento;

    private String bairro;

    private String cep;

    private String cidade;

    private String estado;

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Endereco)) return false;
        Endereco endereco = (Endereco) o;
        return logradouro.equals(endereco.logradouro) &&
                numero.equals(endereco.numero) &&
                complemento.equals(endereco.complemento) &&
                bairro.equals(endereco.bairro) &&
                cep.equals(endereco.cep) &&
                cidade.equals(endereco.cidade) &&
                estado.equals(endereco.estado);
    }

    @Override
    public int hashCode() {
        return Objects.hash(logradouro, numero, complemento, bairro, cep, cidade, estado);
    }
}
