import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<Conta> contas = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;

        do {
            exibirMenu();
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    cadastrarConta();
                    break;
                case 2:
                    consultarConta();
                    break;
                case 3:
                    listarContas();
                    break;
                case 4:
                    realizarDeposito();
                    break;
                case 5:
                    realizarSaque();
                    break;
                case 6:
                    excluirConta();
                    break;
                case 7:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

            System.out.println();

        } while (opcao != 7);

        scanner.close();
    }

    private static void exibirMenu() {
        System.out.println("===== GERENCIADOR DE CONTAS BANCÁRIAS =====");
        System.out.println("1 - Cadastrar nova conta");
        System.out.println("2 - Consultar dados de uma conta");
        System.out.println("3 - Listar todas as contas");
        System.out.println("4 - Realizar depósito");
        System.out.println("5 - Realizar saque");
        System.out.println("6 - Excluir conta");
        System.out.println("7 - Sair");
        System.out.print("Escolha uma opção: ");
    }

    private static void cadastrarConta() {
        System.out.println("===== CADASTRO DE NOVA CONTA =====");

        System.out.print("Número da conta: ");
        String numeroConta = scanner.nextLine();

        if (buscarContaPorNumero(numeroConta) != null) {
            System.out.println("Erro: Já existe uma conta com este número!");
            return;
        }

        System.out.print("Nome da agência: ");
        String nomeAgencia = scanner.nextLine();

        System.out.print("Nome do cliente: ");
        String nomeCliente = scanner.nextLine();

        Conta novaConta = new Conta(numeroConta, nomeAgencia, nomeCliente);
        contas.add(novaConta);

        System.out.println("Conta cadastrada com sucesso!");
    }

    private static void consultarConta() {
        System.out.println("===== CONSULTA DE CONTA =====");

        System.out.print("Informe o número da conta: ");
        String numeroConta = scanner.nextLine();

        Conta conta = buscarContaPorNumero(numeroConta);

        if (conta != null) {
            System.out.println("Dados da conta:");
            System.out.println(conta);
        } else {
            System.out.println("Conta não encontrada!");
        }
    }

    private static void listarContas() {
        System.out.println("===== LISTA DE CONTAS CADASTRADAS =====");

        if (contas.isEmpty()) {
            System.out.println("Não há contas cadastradas.");
            return;
        }

        for (int i = 0; i < contas.size(); i++) {
            System.out.println("Conta #" + (i + 1));
            System.out.println(contas.get(i));
            System.out.println("-----------------------");
        }
    }

    private static void realizarDeposito() {
        System.out.println("===== DEPÓSITO =====");

        System.out.print("Informe o número da conta: ");
        String numeroConta = scanner.nextLine();

        Conta conta = buscarContaPorNumero(numeroConta);

        if (conta == null) {
            System.out.println("Conta não encontrada!");
            return;
        }

        System.out.print("Informe o valor do depósito: R$ ");
        double valor = scanner.nextDouble();
        scanner.nextLine(); // Consumir quebra de linha

        if (conta.depositar(valor)) {
            System.out.println("Depósito realizado com sucesso!");
            System.out.println("Novo saldo: R$ " + String.format("%.2f", conta.getSaldo()));
        } else {
            System.out.println("Erro: Valor de depósito inválido!");
        }
    }

    private static void realizarSaque() {
        System.out.println("===== SAQUE =====");

        System.out.print("Informe o número da conta: ");
        String numeroConta = scanner.nextLine();

        Conta conta = buscarContaPorNumero(numeroConta);

        if (conta == null) {
            System.out.println("Conta não encontrada!");
            return;
        }

        System.out.print("Informe o valor do saque: R$ ");
        double valor = scanner.nextDouble();
        scanner.nextLine(); // Consumir quebra de linha

        if (conta.sacar(valor)) {
            System.out.println("Saque realizado com sucesso!");
            System.out.println("Novo saldo: R$ " + String.format("%.2f", conta.getSaldo()));
        } else {
            System.out.println("Erro: Valor de saque inválido ou saldo insuficiente!");
            System.out.println("Saldo atual: R$ " + String.format("%.2f", conta.getSaldo()));
        }
    }

    private static void excluirConta() {
        System.out.println("===== EXCLUIR CONTA =====");

        System.out.print("Informe o número da conta a ser excluída: ");
        String numeroConta = scanner.nextLine();

        Conta conta = buscarContaPorNumero(numeroConta);

        if (conta != null) {
            contas.remove(conta);
            System.out.println("Conta excluída com sucesso!");
        } else {
            System.out.println("Conta não encontrada!");
        }
    }

    private static Conta buscarContaPorNumero(String numeroConta) {
        for (Conta conta : contas) {
            if (conta.getNumeroConta().equals(numeroConta)) {
                return conta;
            }
        }
        return null;
    }
}