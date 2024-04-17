package org.projeto.alterdata.hotdogos.model;

import org.projeto.alterdata.hotdogos.model.enums.TipoLanche;

import java.math.BigDecimal;
import java.util.List;

public class Pedido {


    private String id;
    private TipoLanche lanche;
    private List<Adicional> adicionais;
    private String total;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public TipoLanche getLanche() {
        return lanche;
    }

    public void setLanche(TipoLanche lanche) {
        this.lanche = lanche;
    }

    public List<Adicional> getAdicionais() {
        return adicionais;
    }

    public void setAdicionais(List<Adicional> adicionais) {
        this.adicionais = adicionais;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }
}
