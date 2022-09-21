package lojinha.entity;

public class Cliente {
    private int clienteId;
    private String clienteNome;
    private boolean clienteVip;

    public Cliente(int clienteId, String clienteNome, boolean clienteVip){
        this.clienteId=clienteId;
        this.clienteNome=clienteNome;
        this.clienteVip=clienteVip;
    }
    public int getClienteId() {
        return clienteId;
    }
    public String getClienteNome() {
        return clienteNome;
    }
    public boolean isClienteVip() {
        return clienteVip;
    }
    public void setClienteId(int clienteId) {
        this.clienteId = clienteId;
    }
    public void setClienteNome(String clienteNome) {
        this.clienteNome = clienteNome;
    }
    public void setClienteVip(boolean clienteVip) {
        this.clienteVip = clienteVip;
    }
}
