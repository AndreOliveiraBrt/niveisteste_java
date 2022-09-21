package lojinha.repository;

import lojinha.entity.Cliente;

public class ClienteRepository {
    public Cliente buscarClienteNoBanco(int clienteId)
    {
        Cliente cliente=null;

        switch (clienteId)
        {
            case 1:
                //cliente = new Cliente(clienteId:1, clienteNome:"Teste", clienteVip: false);
                break;
            case 2:
                //cliente =new Cliente(clienteId:1, clienteNome:"Teste", clienteVip:true);
                break;

            default:
                cliente =null;
                break;
        }
        return cliente;
    }
}
