package lojinha.repository;

import lojinha.entity.Cliente;

public class ClienteRepository {
    public Cliente buscarClienteNoBanco(int clienteId)
    {
        Cliente cliente=null;

        switch (clienteId)
        {
            case 1:
                cliente = new Cliente(1,"Teste", false);
                break;
            case 2:
                cliente =new Cliente(2, "Teste 2", true);
                break;
            default:
                cliente =null;
                break;
        }
        return cliente;
    }
}
