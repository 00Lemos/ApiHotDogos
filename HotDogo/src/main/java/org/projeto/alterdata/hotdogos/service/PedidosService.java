package org.projeto.alterdata.hotdogos.service;

import org.projeto.alterdata.hotdogos.exception.PedidosNotFoundException;
import org.projeto.alterdata.hotdogos.model.Lanche;
import org.projeto.alterdata.hotdogos.model.Pedido;
import org.projeto.alterdata.hotdogos.model.enums.Ingrediente;
import org.projeto.alterdata.hotdogos.model.enums.TipoLanche;
import org.projeto.alterdata.hotdogos.repository.HotDogosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PedidosService {

    @Autowired
    HotDogosRepository hotDogosRepository;

    public List<Pedido> findAll(){
        return this.hotDogosRepository.findAll();
    }

    public void delete(String id) {
        final Pedido lanche = findById(id);
        hotDogosRepository.delete(lanche);
    }

    public Pedido findById(final String id) {
        final Optional<Pedido> lanche = hotDogosRepository.findById(id);
        if(lanche.isPresent()){
            return lanche.get();
        }else {
            throw new PedidosNotFoundException();
        }

    }
    public Lanche precoLanche(TipoLanche tipoLanche){
        Lanche lanche = new Lanche();

        List<Ingrediente> ingredientes = new ArrayList<>();

        ingredientes.addAll(Lanche.ingredientes(tipoLanche));


        return lanche;
    }

    public BigDecimal precoIngrediente(Ingrediente tipoIngrediente){
        switch (tipoIngrediente){
            case Pao:
                return new BigDecimal(2.00);
            case BatataPalha:
                return new BigDecimal(0.40);
            case Codorna:
                return new BigDecimal(3.00);
            case PureDeBatata:
                return new BigDecimal(0.80);
            case Ervilha:
                return new BigDecimal(1.50);
            case Salsicha:
                return new BigDecimal(1.50);
            case Linguica:
                return new BigDecimal(1.50);
        }
        return BigDecimal.ZERO;
    }

    private String formatValor(BigDecimal valor) {
        DecimalFormat decimalFormat = new DecimalFormat();
        decimalFormat.setMinimumFractionDigits(2);
        return decimalFormat.format(valor);
    }


}
