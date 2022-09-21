package lojinha.dto;

public class ClienteDto {
    private int clienteId;
    private String clienteNome;
    private boolean clienteVip;

    public ClienteDto(){

    }
    public ClienteDto(int clienteId, String clienteNome, boolean clienteVip){
        this.clienteId=clienteId;
        this.clienteNome=clienteNome;
        this.clienteVip=clienteVip;
    }

    public int getClienteId() {
        return clienteId;
    }

    public void setClienteId(int clienteId) {
        this.clienteId = clienteId;
    }

    public String getClienteNome() {
        return clienteNome;
    }

    public void setClienteNome(String clienteNome) {
        this.clienteNome = clienteNome;
    }

    public boolean isClienteVip() {
        return clienteVip;
    }

    public void setClienteVip(boolean clienteVip) {
        this.clienteVip = clienteVip;
    }
}
