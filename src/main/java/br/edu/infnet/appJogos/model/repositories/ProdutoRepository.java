package br.edu.infnet.appJogos.model.repositories;

import br.edu.infnet.appJogos.model.domain.Produto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProdutoRepository extends CrudRepository<Produto, Integer> {

}