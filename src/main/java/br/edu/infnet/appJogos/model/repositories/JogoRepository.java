package br.edu.infnet.appJogos.model.repositories;

import br.edu.infnet.appJogos.model.domain.Jogo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface JogoRepository extends CrudRepository<Jogo, Integer> {
}
