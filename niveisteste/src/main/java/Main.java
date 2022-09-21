import lojinha.dto.ClienteDto;
import lojinha.repository.ClienteRepository;
import lojinha.services.ClienteService;
import lojinha.services.PromocaoService;

public class Main {
    public static void main(String[] args) throws Exception {
        ClienteRepository clienteRepository = new ClienteRepository();
        ClienteService clienteService = new ClienteService();
        ClienteDto clienteDto = clienteService.buscarCliente(clienteRepository,2);
        PromocaoService promocaoService = new PromocaoService();
        String promocao = promocaoService.promocaoDisponivel(clienteDto);

        System.out.println(promocao);
    }
}