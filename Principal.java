
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ListaEncadeada lista = new ListaEncadeada();

        int opcao;
        int valor;
        int posicao;

        do {

            System.out.println("\n========== LISTA ENCADEADA ==========");
            System.out.println("1 - Inserir no início");
            System.out.println("2 - Inserir no final");
            System.out.println("3 - Inserir em uma posição específica");
            System.out.println("4 - Remover do início");
            System.out.println("5 - Remover do final");
            System.out.println("6 - Remover de uma posição específica");
            System.out.println("7 - Buscar um elemento");
            System.out.println("8 - Exibir a lista");
            System.out.println("9 - Contar elementos");
            System.out.println("0 - Sair");
            System.out.print("\nEscolha uma opção: ");

            opcao = scanner.nextInt();

            switch (opcao) {

                case 1:
                    System.out.print("Digite o valor: ");
                    valor = scanner.nextInt();

                    lista.inserirInicio(valor);
                    break;

                case 2:
                    System.out.print("Digite o valor: ");
                    valor = scanner.nextInt();

                    lista.inserirFinal(valor);
                    break;

                case 3:
                    System.out.print("Digite o valor: ");
                    valor = scanner.nextInt();

                    System.out.print("Digite a posição: ");
                    posicao = scanner.nextInt();

                    lista.inserirPosicao(valor, posicao);
                    break;

                case 4:
                    lista.removerInicio();
                    break;

                case 5:
                    lista.removerFinal();
                    break;

                case 6:
                    System.out.print("Digite a posição: ");
                    posicao = scanner.nextInt();

                    lista.removerPosicao(posicao);
                    break;

                case 7:
                    System.out.print("Digite o valor que deseja buscar: ");
                    valor = scanner.nextInt();

                    lista.buscar(valor);
                    break;

                case 8:
                    lista.exibir();
                    break;

                case 9:
                    System.out.println(
                        "Quantidade de elementos: " +
                        lista.contarElementos()
                    );
                    break;

                case 0:
                    System.out.println("Programa encerrado!");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        scanner.close();
    }
}
