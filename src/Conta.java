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
}
