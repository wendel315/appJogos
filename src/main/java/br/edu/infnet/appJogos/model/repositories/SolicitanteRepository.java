package br.edu.infnet.appJogos.model.repositories;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import br.edu.infnet.appJogos.model.domain.Solicitante;


@Repository
public interface SolicitanteRepository extends CrudRepository<Solicitante, Integer> {

}