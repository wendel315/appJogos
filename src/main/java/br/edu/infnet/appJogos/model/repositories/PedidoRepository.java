package br.edu.infnet.appJogos.model.repositories;

import br.edu.infnet.appJogos.model.domain.Pedido;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PedidoRepository extends CrudRepository<Pedido, Integer> {

}