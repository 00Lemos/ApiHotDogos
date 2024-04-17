package org.projeto.alterdata.hotdogos.model;

import org.projeto.alterdata.hotdogos.model.enums.Ingrediente;

public class Adicional {

    private Ingrediente ingrediente;
    private Integer quantidade;

    public Ingrediente getIngrediente() {
        return ingrediente;
    }

    public void setIngrediente(Ingrediente ingrediente) {
        this.ingrediente = ingrediente;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }
}
