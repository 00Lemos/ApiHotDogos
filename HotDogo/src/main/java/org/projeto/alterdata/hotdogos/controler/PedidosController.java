package org.projeto.alterdata.hotdogos.controler;

import org.projeto.alterdata.hotdogos.service.PedidosService;
import org.projeto.alterdata.hotdogos.model.Lanche;
import org.projeto.alterdata.hotdogos.model.Pedido;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pedidos")
public class PedidosController {

    @Autowired
    private PedidosService pedidosService;

    private  Lanche lanche;

    @GetMapping
    public List<Pedido> getAllLanche(){
        return pedidosService.findAll();
    }

    @GetMapping("/lanche/{id}")
    public ResponseEntity<Pedido> getLanche(@PathVariable("id") String  id){
        final Pedido lanche = pedidosService.findById(id);
        return ResponseEntity.ok(lanche);
    }

    @DeleteMapping("/lanche/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable("id") String id){
        pedidosService.delete(id);
    }

}
