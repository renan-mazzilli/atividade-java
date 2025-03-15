public class Conta {
    private String numeroConta;
    private String nomeAgencia;
    private String nomeCliente;
    private double saldo;

    public Conta(String numeroConta, String nomeAgencia, String nomeCliente) {
        this.numeroConta = numeroConta;
        this.nomeAgencia = nomeAgencia;
        this.nomeCliente = nomeCliente;
        this.saldo = 0.0;
    }
    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getNomeAgencia() {
        return nomeAgencia;
    }

    public void setNomeAgencia(String nomeAgencia) {
        this.nomeAgencia = nomeAgencia;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public double getSaldo() {
        return saldo;
    }
}
