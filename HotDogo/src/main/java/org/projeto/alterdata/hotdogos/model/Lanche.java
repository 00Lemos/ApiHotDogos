package org.projeto.alterdata.hotdogos.model;

import org.projeto.alterdata.hotdogos.model.enums.Ingrediente;
import org.projeto.alterdata.hotdogos.model.enums.TipoLanche;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;


public class Lanche {


    private String id;
    private String descricao;
    private TipoLanche tipoLanche;
    private String preco;

    public List<Adicional> adicionais;

    public static Collection<? extends Ingrediente> ingredientes(TipoLanche tipoLanche){
        switch (tipoLanche){
            case CompletoComSalsicha:
                return Arrays.asList(Ingrediente.Pao, Ingrediente.BatataPalha, Ingrediente.Codorna, Ingrediente.PureDeBatata, Ingrediente.Ervilha, Ingrediente.Salsicha);
            case CompletoComLinguica:
                return Arrays.asList(Ingrediente.Pao, Ingrediente.BatataPalha, Ingrediente.Codorna, Ingrediente.PureDeBatata, Ingrediente.Ervilha, Ingrediente.Linguica);
            case LowCarb:
                return Arrays.asList(Ingrediente.Linguica, Ingrediente.BatataPalha, Ingrediente.Codorna, Ingrediente.Salsicha);
        }
        return new ArrayList<Ingrediente>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public TipoLanche getTipoLanche() {
        return tipoLanche;
    }

    public void setTipoLanche(TipoLanche tipoLanche) {
        this.tipoLanche = tipoLanche;
    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }

    public List<Adicional> getAdicionais() {
        return adicionais;
    }

    public void setAdicionais(List<Adicional> adicionais) {
        this.adicionais = adicionais;
    }
}
