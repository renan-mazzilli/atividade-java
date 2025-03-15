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

    public boolean depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            return true;
        }
        return false;
    }

    public boolean sacar(double valor) {
        if (valor > 0 && this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Conta: " + numeroConta +
                "\nAgência: " + nomeAgencia +
                "\nCliente: " + nomeCliente +
                "\nSaldo: R$ " + String.format("%.2f", saldo);
    }
}
