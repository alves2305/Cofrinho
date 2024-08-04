package src;
import java.util.ArrayList;
import java.util.Scanner;
import src.moedas.*;

public class Principal {
    public static void main(String[] args) {

        Cofinho cofrinho = new Cofinho();

        // ArrayList<Integer> lista = new ArrayList<>();

        try (Scanner scanner = new Scanner(System.in)) {
            System.err.println("Olá, Bem-vindo ao Emulador de cofre. Digite seu nome para darmos continuidade \n");
            String usuario = scanner.nextLine();
            System.err.println(
                    "Olá, " + usuario + " esolha uma das opções abaixo ou digite 5 para finalizar o programa \n");

            int escolha = 0;

            while (escolha != 5) {

                System.err.println("1- Adicionar moedas de diferentes valores e países em seu cofrinho");
                System.err.println("2- Remover moedas específicas do cofrinho.");
                System.err.println("3- Listar todas as moedas que estão dentro do cofrinho");
                System.err.println("4- Calcular quanto dinheiro existe no cofrinho convertido para Real");
                System.err.println("5- Sair do programa");
                escolha = scanner.nextInt();

                switch (escolha) {

                    case 1:
                        int subMenuAdicao = 0;
                        while (subMenuAdicao != 4) {
                            System.err.println("Escolha qual moeda você deseja adcionar em seu cofrinho : \n");
                            System.err.println("1- Euro");
                            System.err.println("2- Dolar");
                            System.err.println("3- Real");
                            System.err.println("4- Voltar para o menu anterior");
                            subMenuAdicao = scanner.nextInt();

                            switch (subMenuAdicao) {
                                case 1:
                                    System.err.println("Adcione a quantia de Euro que for de sua escolha  :");
                                    Euro moedaEuro = new Euro();
                                    int inputEuro = scanner.nextInt();
                                    moedaEuro.setValor(inputEuro);
                                    cofrinho.adicionarMoedas(moedaEuro);

                                    break;
                                case 2:
                                    System.err.println("Adcione a quantia de Dolar que for de sua escolha  :");
                                    Dolar moedaDolar = new Dolar();
                                    int inputDolar = scanner.nextInt();
                                    moedaDolar.setValor(inputDolar);
                                    cofrinho.adicionarMoedas(moedaDolar);

                                    break;
                                case 3:
                                    System.err.println("Adcione a quantia de Real que for de sua escolha  :");
                                    Real moedaReal = new Real();
                                    int inputReal = scanner.nextInt();
                                    moedaReal.setValor(inputReal);
                                    cofrinho.adicionarMoedas(moedaReal);

                                default:
                                    System.err.println("Retornando ao menu anterior...");

                                    break;
                            }
                        }
                        break;

                    case 2:
                        int subMenuRemocao = 0;
                        while (subMenuRemocao != 4) {
                            System.err.println("Escolha qual moeda você deseja remover do seu cofrinho : \n");
                            System.err.println("1- Euro");
                            System.err.println("2- Dolar");
                            System.err.println("3- Real");
                            System.err.println("4- Voltar para o menu anterior");
                            subMenuRemocao = scanner.nextInt();

                            switch (subMenuRemocao) {
                                case 1:
                                    System.err.println("Remova a quantia de Euro que for de sua escolha  :");
                                    Euro removEuro = new Euro();
                                    int inputRemovEuro = scanner.nextInt();
                                    removEuro.setValor(inputRemovEuro);
                                    cofrinho.removerMoedas(removEuro);

                                    break;
                                case 2:
                                    System.err.println("Remova a quantia de Dolar que for de sua escolha  :");
                                    Dolar removDolar = new Dolar();
                                    int inputRemovDolar = scanner.nextInt();
                                    removDolar.setValor(inputRemovDolar);
                                    cofrinho.removerMoedas(removDolar);
                                    break;
                                case 3:
                                    System.err.println("Remova a quantia de Real que for de sua escolha  :");
                                    Real removReal = new Real();
                                    int inputRemovReal = scanner.nextInt();
                                    removReal.setValor(inputRemovReal);
                                    cofrinho.removerMoedas(removReal);
                                    break;

                                default:
                                    System.err.println("Retornando ao menu anterior ");
                                    break;

                            }
                        }
                        break;

                    case 3:
                        System.err.println("Listagem de moedas : ");

                        cofrinho.listarMoedas();

                        break;

                    case 4:
                        System.err.println("Total de dinheiro em seu cofrinho : ");
                        double totalDinheiro = cofrinho.somarMoedas();
                        System.err.println("Total: " + totalDinheiro);

                        break;

                    default:

                        break;
                }

            }
        }

    }
}