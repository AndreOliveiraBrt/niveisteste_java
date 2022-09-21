package lojinha.dto;

public class ClienteDto {
    private int clienteId;
    private String clienteNone;
    private boolean clienteVip;

    public ClienteDto(){

    }
    public ClienteDto(int clienteId, String clienteNone, boolean clienteVip){
        this.clienteId=clienteId;
        this.clienteNone=clienteNone;
        this.clienteVip=clienteVip;
    }

    public int getClienteId() {
        return clienteId;
    }

    public void setClienteId(int clienteId) {
        this.clienteId = clienteId;
    }

    public String getClienteNone() {
        return clienteNone;
    }

    public void setClienteNone(String clienteNone) {
        this.clienteNone = clienteNone;
    }

    public boolean isClienteVip() {
        return clienteVip;
    }

    public void setClienteVip(boolean clienteVip) {
        this.clienteVip = clienteVip;
    }
}
