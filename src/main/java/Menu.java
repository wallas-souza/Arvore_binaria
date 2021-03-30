
import java.util.Scanner;

public class Menu {
    public void Start(){
        Scanner entrada = new Scanner(System.in);
        Arvore<Integer> arvore = new Arvore<Integer>();

        int repetir = 1;
        int opcao;
        int aux;
        while (repetir != 3) {
            repetir = 1;
            System.out.println("O que deseja fazer?");
            System.out.println("\n[1] - adicionar um número.");
            System.out.println("[2] - Consultar arvore.");
            System.out.println("[3] - Sair.\n");
            opcao = entrada.nextInt();

            switch (opcao) {

                case 1:
                    System.out.println("Digite um  número para adicionar:");
                    while (repetir == 1) {
                        aux = entrada.nextInt();
                        if (aux < 0) {
                            break;
                        } else {
                            arvore.adicionar(aux);
                        }
                    }
                    break;
                case 2:

                    while (repetir == 1) {

                        System.out.println("Escolha um metodo de pesquisa abaixo:");
                        System.out.println("\n[1] - Em ordem");//esquerda > cima > direita
                        System.out.println("[2] - Em Pré-ordem");//cima > esquerda > direita
                        System.out.println("[3] - Em Pós-ordem\n");//esquerda > direita > cima
                        opcao = entrada.nextInt();

                        switch (opcao) {

                            case 1:
                                System.out.println("\nEm ordem:");
                                arvore.emOrdem(arvore.getRaiz());
                                break;
                            case 2:
                                System.out.println("\nPré-ordem:");
                                arvore.preOrdem(arvore.getRaiz());
                                break;
                            case 3:
                                System.out.println("\nPós-ordem:");
                                arvore.posOrdem(arvore.getRaiz());
                                break;
                            default:
                                System.out.println("\nOpção não existe.");
                                break;
                        }
                        System.out.println("\nDeseja continuar?\n[1] - sim \n[2] - não\n");
                        aux = entrada.nextInt();
                        if (aux != 1) {
                            repetir = 2;
                        }
                    }
                    break;
                case 3:
                    repetir = 3;
                    break;
                default:
                    System.out.println("\nOpção não existe.");
                    break;
            }
        }
    }
}
