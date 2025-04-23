import java.util.Scanner;

public class App {
public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);


    //entrada dos valores.

    System.out.println("Informe o primeiro número: ");
    float valor1 = scanner.nextFloat();

    System.out.println("Informe o segundo número: ");
    float valor2 = scanner.nextFloat();

    Operadores op = new Operadores(valor1, valor2);

    //menu de operaçoes

    System.out.println("Digite o número da operação: 1 - Soma, 2 - Subtração, 3 - Multiplicação, 4 - Divisão, 5 - Atribuição, 6 - Comparação, 7 - Operação Lógica");

    int operacao = scanner.nextInt();


    //System.out.println("Valor 1: " + op.getValor1());
    //System.out.println("Valor 2: " + op.getValor2());
    //System.out.println("Soma: " + op.somar());
    //System.out.println("Subtração: " + op.subtrair());
    //System.out.println("Multiplicação: " + op.multiplicar());
    //verificação na divisao // 0 nao pode dividir.

    switch (operacao) {

        case 1:
            System.out.println("Adição: " + (valor1 + valor2));
            break;
            
        case 2:
            System.out.println("Subtração: " + (valor1 - valor2));
            break;
        case 3:
            System.out.println("Multiplicação: " + (valor1 * valor2));
            break;
        case 4:
            if (valor2 !=0){
                System.out.println("Divisão: " + (valor1 / valor2));
            } else {
                System.out.println("Não é possível dividir por 0.");
            }
            break;
        case 5:
            valor1 += valor2;
            System.out.println("Atrbuição: " + valor1);
            break;
        case 6:
            System.out.println("Comparação: " + (valor1 == valor2));
            break;
        case 7:
            System.out.println("Operação Lógica: " + (valor1 > 0 && valor2 >0));
            break;
        default:
            System.out.println("Opção inválida.");
            break;
        }

        scanner.close();


}

    }

