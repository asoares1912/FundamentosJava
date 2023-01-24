//github.com/interasys
// 1ª parte Pacote
package fundamentos;
// 2 - Bibliotecas
import java.util.Scanner;
// 3 - Classe
public class Medidas {
    //3.1 - Atributos
    //3.2 - Metodos e Funções
    static Scanner entrada = new Scanner(System.in);
    public static void main (String []args) {
        String opcao = " ";
        int area = 0;

       // while ((!opcao.toUpperCase().equals("S"))){

            System.out.println("Olá Mundo!");
            System.out.println("Escolha o Calculo desejado");
            System.out.println("(1) - area do Quadrado");
            System.out.println("(2) - area do Retangulo");
            System.out.println("(3) - area do Triangulo");
            System.out.println("(4) - area do Circulo");
            System.out.println("(5) - Tabuada");
            System.out.println("(6) - Fibonacci");
            System.out.println("(7) - Contagem Regressiva");
            System.out.println("(8) - Divisão por Zero");
            System.out.println("(S) - Sair");

            opcao = entrada.nextLine();

            switch (opcao) {
                case "1":
                    area = calcularAreadoQuadrado();
                    break;
                case "2":
                    //ToDo: Calcular area do retangulo
                    break;
                case "5":
                    tabuada();
                    break;
                case "6":
                    fibonacci();
                    break;
                case "7":
                    contagemRegressiva();
                    break;
                case "8":
                    divisaoPorZero();
                    break;
                case "S":
                case "s":
                    System.out.println("Agradeçemos pela preferencia ! Fui!!");
                    break;
                default:
                    System.out.println("Valor Inválido: " + opcao);
            }
            if (area > 0) {
                System.out.println("A area e: " + area + "m²");
            }
      //  }
     }
    public static int calcularAreadoQuadrado(){

        int lado; //tamanho do lado do quadrado
        //int area; //area do quadrado a ser calculado

        System.out.println("Digite o tamanho do lado: ");
        lado = entrada.nextInt(); // Leitura do tamanho do lado

        //Desenhar o quadrado
        for(int linha = 1; linha <=lado; linha+=2) {
            for (int coluna = 1; coluna <= lado; coluna++) {
                System.out.print("#");
            }
            System.out.println("");
        }
        System.out.println("");
        //area = lado ^ 2;
        return lado * lado ;
    }
    public static void tabuada(){
        System.out.println("Qual tabuada quer calcular: ");
        int numero = entrada.nextInt();

        for (int i = 1; i<=10; i++){
            System.out.print(numero * i + " ");
        }
    }
    public static void fibonacci(){
        System.out.println("Quantos número quer na sequência: ");
        byte numero = entrada.nextByte();

        switch (numero){
            case 0:
                System.out.println("A Sequencia está vazia.");
                break;
            case 1:
                System.out.println(("Sequencia de Fibonacci: 1"));
                break;
            default:
                int num1 = 0;
                int num2 = 1;
                System.out.print(("Sequencia de Fibonacci: 1 "));

                for( int i = 2; i<=numero; i++){
                    int fib = num1 + num2;
                    System.out.print(fib + " ");
                    num1 = num2;
                    num2 = fib;

                }
        }
    }
    public static void contagemRegressiva(){
        System.out.print("Começar a contagem a partir de qual número ? ");
        int numero = entrada.nextInt();

        System.out.print("Diminuindo de quantos e quantos numeros por vez? ");
        int decrescimo = entrada.nextInt();

        for (int i = numero; i>=1; i-=decrescimo){
            System.out.println(i);
        }
    }
    public static void divisaoPorZero(){


        try {
            System.out.print("Qual é o dividendo? (número a ser divido)");
            byte dividendo = entrada.nextByte();
            System.out.print("Qual é o divisor? (número que divide o dividendo) ");
            byte divisor = entrada.nextByte();

            System.out.println("O Resultado é: " + dividendo / divisor);

        }
        catch (Exception e){

                    System.out.println("Msg temporaria em Inglês: " + e.getMessage());

        }
        finally {
            System.out.println("Por hoje só: ");
        }

    }

}