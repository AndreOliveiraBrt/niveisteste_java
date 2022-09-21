package lojinha.services;

import lojinha.dto.ClienteDto;

public class PromocaoService {
    public String promocaoDisponivel(ClienteDto clienteDto){
        String promocaoDisponivel= "Teste Promoçao ";
        if (clienteDto.isClienteVip()){
            promocaoDisponivel="Teste promocao Cliente Vip";
        }

        return promocaoDisponivel;
    }
}
