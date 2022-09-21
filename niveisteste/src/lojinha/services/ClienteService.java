package lojinha.services;

import lojinha.dto.ClienteDto;
import lojinha.entity.Cliente;
import lojinha.repository.ClienteRepository;

public class ClienteService {
    public ClienteDto buscarCliente(ClienteRepository clienteRepository, int clienteId) throws Exception {
        ClienteDto clienteDto = new ClienteDto();
        Cliente cliente = clienteRepository.buscarClienteNoBanco(clienteId);
        if(cliente==null){
            throw new Exception("teste");
        }

        clienteDto.setClienteId(cliente.getClienteId());
        clienteDto.setClienteNome(cliente.getClienteNome());
        clienteDto.setClienteVip(cliente.isClienteVip());

        return  clienteDto;
    }
}
