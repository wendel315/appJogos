package br.edu.infnet.appJogos.model.service;

import br.edu.infnet.appJogos.clients.IEnderecoClient;
import br.edu.infnet.appJogos.model.domain.Endereco;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EnderecoService {

    @Autowired
    private IEnderecoClient enderecoClient;

    public Endereco buscarCep(String cep) {
        return enderecoClient.buscarCep(cep);
    }

}
