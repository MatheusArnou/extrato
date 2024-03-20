import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        //menu inicial
        String nome = "Matheus Bispo Arnou";
        String tipoConta = "Conta corrente"; // Corrigido "Conta correte" para "Conta corrente"
        double saldoInicial = 2500;
        Scanner entradaDeDados = new Scanner(System.in);
        System.out.println("************************************");
        System.out.println("Cliente: " + nome);
        System.out.println("Tipo de conta: " + tipoConta);
        System.out.println("Saldo atual R$: " + saldoInicial);
        System.out.println("************************************");
        System.out.println("Operações\n\n");
        System.out.println(
                        "1 - Consultar Saldo\n" +
                        "2 - Receber um valor\n" +
                        "3 - Transferir valor\n" +
                        "4 - Sair\n" +
                        "Digite uma opção:\n"
        );

        int opcao = entradaDeDados.nextInt();
        while (opcao != 4) {
            switch (opcao) {
                case 1:
                    System.out.println("Seu saldo atual é de R$ " + saldoInicial);
                    break;
                case 2:
                    System.out.println("Informe o valor a ser recebido R$ ");
                    double valorDeposito = entradaDeDados.nextDouble();
                    if (valorDeposito <= 0) {
                        System.out.println("Por favor, digite um valor válido acima de R$ 0,01");
                        break;
                    } else {
                        saldoInicial += valorDeposito;
                        System.out.println("Valor recebido R$ " + valorDeposito + " saldo atual em conta R$ " + saldoInicial);
                    }
                    break;
                case 3:
                    System.out.println("Informe o valor que irá transferir R$ ");
                    double valorTransferir = entradaDeDados.nextDouble();
                    if (valorTransferir > saldoInicial) {
                        System.out.println("Saldo insuficiente");
                    } else {
                        saldoInicial -= valorTransferir;
                        System.out.println("Transferido o valor de R$ " + valorTransferir + " saldo atual em conta R$ " + saldoInicial);
                    }
                    break;
                case 4:
                    System.out.println("Programa Encerrado");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente");
            }
            System.out.println(
                    "1 - Consultar Saldo\n" +
                            "2 - Receber um valor\n" +
                            "3 - Transferir valor\n" +
                            "4 - Sair\n" +
                            "Digite uma opção:\n"
            );
            opcao = entradaDeDados.nextInt();
        }
    }
}
