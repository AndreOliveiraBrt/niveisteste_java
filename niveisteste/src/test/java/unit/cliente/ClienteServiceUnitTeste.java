package unit.cliente;

import lojinha.dto.ClienteDto;
import lojinha.entity.Cliente;
import lojinha.repository.ClienteRepository;
import lojinha.services.ClienteService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.testng.annotations.Test;
import static org.mockito.Mockito.*;

public class ClienteServiceUnitTeste {
    @Test
    @DisplayName("Validando a busca de cliente existente")
    public void testValidandoBuscaPorClienteExistente() throws Exception {

      //Arrange
        Cliente cliente = new Cliente(2,"Teste2", true);
        ClienteRepository clienteRepositoryMock = mock(ClienteRepository.class);
        when(clienteRepositoryMock.buscarClienteNoBanco(2)).thenReturn(cliente);

      //Action
        ClienteService clienteService = new ClienteService();
        ClienteDto clienteDto = clienteService.buscarCliente(clienteRepositoryMock,2);

      //Assert
        Assertions.assertEquals(2,clienteDto.getClienteId());
    }
}
