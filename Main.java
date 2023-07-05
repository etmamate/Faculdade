import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // atividades
        Scanner scn = new Scanner(System.in);
        int opcao;
        String breakline = "-".repeat(24);
        String menu = """
                ATIVIDADE 1: LER DOIS NÚMERO INTEIROS E EXIBI-LOS
                ATIVIDADE 2: LER UM NÚMERO INTEIRO E EXIBIR SEU ANTECESSOR E SEU SUCESSOR!
                ATIVIDADE 3: LEIA DOIS NÚMEROS E FAÇA A SOMA
                ATIVIDADE 4: MOSTRE A DIFERENÇA DE DOIS NÚMEROS
                ATIVIDADE 5: ESCREVA UM PROGRAMA QUE MOSTRE A MULTIPLICAÇÃO DE DOIS NÚMEROS
                ATIVIDADE 6: ESCREVA UM PROGRAMA PARA LER DOIS NÚMEROS INTEIROS E EXIBIR O QUOCIENTE E O RESTO DELES
                ATIVIDADE 7: RESTAURANTE
                ATIVIDADE 8: CALCULADORA DE SALARIOS MINIMOS
                ATIVIDADE 9: MÉDIA ARITMÉTICA DE 7, 8 e 9
                ATIVIDADE 10: MÉDIA ARITMÉTICA
                0 - PARA SAIR
                """;
        do {
            System.out.println(breakline);
            System.out.println(menu);
            System.out.println(breakline);
            opcao = scn.nextInt();

            switch (opcao) {
                case 1:
                    Atividade1();
                    break;
                case 2:
                    Atividade2();
                    break;
                case 3:
                    Atividade3();
                    break;
                case 4:
                    Atividade4();
                    break;
                case 5:
                    Atividade5();
                    break;
                case 6:
                    Atividade6();
                    break;
                case 7:
                    Atividade7();
                    break;
                case 8:
                    Atividade8();
                    break;
                case 9:
                    Atividade9();
                    break;
                case 10:
                    Atividade10();
                    break;
                default:
            }
        } while (opcao != 0);
    }

    public static void Atividade1() {
        Scanner scn = new Scanner(System.in);
        System.out.println("ATIVIDADE 1: ESCREVA UM PROGRAMA PARA LER DOIS NÚMERO INTEIROS E EXIBI-LOS");
        System.out.println("Digite um número: ");
        int n1 = scn.nextInt();
        System.out.println("Digite outro número: ");
        int n2 = scn.nextInt();
        System.out.printf("Seus números são: %s e %S.", n1, n2);
    }

    public static void Atividade2() {
        Scanner scn = new Scanner(System.in);
        System.out.println("ATIVIDADE 2: ESCREVA UM PROGRAMA PARA LER UM NÚMERO INTEIRO E EXIBIR SEU ANTECESSOR E SEU SUCESSOR!");
        System.out.println("Digite um número: ");
        int nn1 = scn.nextInt();
        System.out.printf("O Antecessor de: " + nn1 + " é " + (nn1 - 1) + " e o sucessor é: " + (nn1 + 1) + ".%n");
    }

    public static void Atividade3() {
        Scanner scn = new Scanner(System.in);
        System.out.println("ATIVIDADE 3: ESCREVA UM PROGRAMA QUE LEIA DOIS NÚMEROS E FAÇA A SOMA");
        System.out.println("Digite um número: ");
        int s1 = scn.nextInt();
        System.out.println("Digite o segundo número: ");
        int s2 = scn.nextInt();
        System.out.printf("A soma desses números é:" + (s1 + s2) + ".%n");
    }

    public static void Atividade4() {
        Scanner scn = new Scanner(System.in);
        System.out.println("ATIVIDADE 4: ESCREVA UM PROGRAMA QUE MOSTRE A DIFERENÇA DE DOIS NÚMEROS");
        System.out.println("Digite um número: ");
        int d1 = scn.nextInt();
        System.out.print("Digite o segundo número: ");
        int d2 = scn.nextInt();
        System.out.printf("A diferença desses dois número é: " + (d1 - d2) + ".%n");
    }

    public static void Atividade5() {
        Scanner scn = new Scanner(System.in);
        System.out.println("ATIVIDADE 5: ESCREVA UM PROGRAMA QUE MOSTRE A MULTIPLICAÇÃO DE DOIS NÚMEROS");
        System.out.println("Digite um número: ");
        int m1 = scn.nextInt();
        System.out.println("Digite outro número: ");
        int m2 = scn.nextInt();
        System.out.printf("A Multiplicação desses números é: " + (m1 * m2) + ".%n");
    }

    public static void Atividade6() {
        Scanner scn = new Scanner(System.in);
        System.out.println(
                "ATIVIDADE 6: ESCREVA UM PROGRAMA PARA LER DOIS NÚMEROS INTEIROS E EXIBIR O QUOCIENTE E O RESTO DELES");
        System.out.println("Digite um número: ");
        int q1 = scn.nextInt();
        System.out.println("Digite outro número: ");
        int q2 = scn.nextInt();
        System.out.printf("O quociente é: " + (q1 / q2) + " e o resto é: " + (q1 % q2) + ".%n");
    }

    public static void Atividade7() {
        Scanner scn = new Scanner(System.in);
        System.out.println(
                "Todo restaurante, embora por lei não possa obrigar o cliente a pagar, cobra 10% para o garçom. Fazer um algoritmo que leia o valor gasto com as despesas realizadas em um restaurante e imprima o valor da gorjeta e o valor total da despesa (despesa + gorjeta).");
        System.out.println("Informe o gasto: ");
        double gasto = scn.nextDouble();
        double gorjeta = (gasto / 100 * 10);
        System.out.printf("o valor da gorjeta é: " + gorjeta + " e o valor da despesa é: " + (gasto + gorjeta));
    }

    public static void Atividade8() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Para vários tributos a base de cálculo é o salário mínimo. Fazer um algoritmo que leia o valor do salário mínimo e o valor do salário de uma pessoa. Calcular e exibir quantos salários mínimos essa pessoa ganha");
        System.out.println("Me informe seu salario: ");
        double salario = scn.nextDouble();
        double minimo = 1300;
        double quantidade = (salario / minimo);
        System.out.printf("A Quantidade de salarios minimos é: %.2f", quantidade);
    }

    public static void Atividade9() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Média Aritmetica de 7, 8 e 9");
        int media = (7 + 8 + 9);
        int valor = media / 3;
        System.out.printf("A media aritmetica é: %s", valor);
    }

    public static void Atividade10() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Criar um aplicativo que entre com 4 números reais e exiba a média aritmética entre eles, com a mensagem média antes do resultado");
        System.out.println("Digite um numero: ");
        int nmr1 = scn.nextInt();
        System.out.println("Digite outro numero: ");
        int nmr2 = scn.nextInt();
        System.out.println("Digite outro numero: ");
        int nmr3 = scn.nextInt();
        System.out.println("Digite outro numero: ");
        int nmr4 = scn.nextInt();
        double soma = (nmr1 + nmr2 + nmr3 + nmr4);
        System.out.printf("A média é: " + (soma / 4));
    }
}
