import java.util.ArrayList;
import java.util.Scanner;

class Primeiro   
{
    public static void main (String[] args) 
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("É preciso fazer todas as exercícios para aprender");
    }
}

class Segunda
{   
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("ATIVIDADE 2: ESCREVA UM PROGRAMA PARA LER DOIS NÚMERO INTEIROS E EXIBI-LOS");
        System.out.println("Digite um número: ");
        int n1 = scn.nextInt();
        System.out.println("Digite outro número: ");
        int n2 = scn.nextInt();
        System.out.printf("Seus números são: %s e %S.%n", n1, n2);

    }
}

class Terceira
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("ATIVIDADE 3: ESCREVA UM PROGRAMA PARA LER UM NÚMERO INTEIRO E EXIBIR SEU ANTECESSOR E SEU SUCESSOR!");
        System.out.println("Digite um número: ");
        int nn1 = scn.nextInt();
        System.out.printf("O Antecessor de: "+nn1+" é "+ (nn1 - 1) +" e o sucessor é: "+ (nn1 + 1)+".%n");
    }
}

class Quarta
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("ATIVIDADE 4: ESCREVA UM PROGRAMA QUE LEIA DOIS NÚMEROS E FAÇA A SOMA");
        System.out.println("Digite um número: ");
        int s1 = scn.nextInt();
        System.out.println("Digite o segundo número: ");
        int s2 = scn.nextInt();
        System.out.printf("A soma desses números é:"+ (s1 + s2)+".%n");
    }
}

class Quinta
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("ATIVIDADE 5: ESCREVA UM PROGRAMA QUE MOSTRE A DIFERENÇA DE DOIS NÚMEROS");
        System.out.println("Digite um número: ");
        int d1 = scn.nextInt();
        System.out.print("Digite o segundo número: ");
        int d2 = scn.nextInt();
        System.out.printf("A diferença desses dois número é: "+ (d1 - d2)+".%n");
    }
}

class Sexta
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("ATIVIDADE 6: ESCREVA UM PROGRAMA QUE MOSTRE A MULTIPLICAÇÃO DE DOIS NÚMEROS");
        System.out.println("Digite um número: ");
        int m1 = scn.nextInt();
        System.out.println("Digite outro número: ");
        int m2 = scn.nextInt();
        System.out.printf("A Multiplicação desses números é: "+ (m1 * m2) + ".%n");
    }
}

class Setima
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("ATIVIDADE 7: ESCREVA UM PROGRAMA PARA LER DOIS NÚMEROS INTEIROS E EXIBIR O QUOCIENTE E O RESTO DELES");
        System.out.println("Digite um número: ");
        int q1 = scn.nextInt();
        System.out.println("Digite outro número: ");
        int q2 = scn.nextInt();
        System.out.printf("O quociente é: " + (q1 / q2) + " e o resto é: " + (q1 % q2) + ".%n");
    }
}

class Oitava
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Todo restaurante, embora por lei não possa obrigar o cliente a pagar, cobra 10% para o garçom. Fazer um algoritmo que leia o valor gasto com as despesas realizadas em um restaurante e imprima o valor da gorjeta e o valor total da despesa (despesa + gorjeta).");
        System.out.println("Informe o gasto: ");
        double gasto = scn.nextDouble();
        double gorjeta = (gasto / 100 * 10);
        System.out.printf("o valor da gorjeta é: " + gorjeta + " e o valor da despesa é: " + (gasto + gorjeta));
        
    }
} 

class Nona
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Para vários tributos a base de cálculo é o salário mínimo. Fazer um algoritmo que leia o valor do salário mínimo e o valor do salário de uma pessoa. Calcular e exibir quantos salários mínimos essa pessoa ganha");
        System.out.println("Me informe seu salario: ");
        double salario = scn.nextDouble();
        double minimo = 1300;
        double quantidade = (salario / minimo);
        System.out.printf("A Quantidade de salarios minimos é: %.2f", quantidade);
    }
}

//Media Aritmetica
class Decima
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Média Aritmetica de 7, 8 e 9");
        System.out.println("ponha alguns numeros: ");
        int media = (7+8+9);
        int valor = media / 3;
        System.out.printf("A media aritmetica é: %s", valor);
    }
}

class DecimaPrimeira
{
    public static void main(String[] args)
    {
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
        System.out.printf("A média é: "+(soma/4));
    }
}

class DecimaSegunda
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Criar um algoritmo que entre com 4 números reais e exiba a média ponderada, sabendo-se que os pesos são respectivamente: 1, 2, 3 e 4");
        System.out.println("Digite um numero: ");
        int nmro1 = scn.nextInt();
        System.out.println("Digite outro numero: ");
        int nmro2 = scn.nextInt();
        System.out.println("Digite outro numero: ");
        int nmro3 = scn.nextInt();
        float calc = (nmro1 * 1 + nmro2 * 2 + nmro3 * 3);
        float div = (calc) / (nmro1 + nmro2 + nmro3);
        //System.out.println(calc);
        //double div =
        System.out.printf("A média é: %s", div);
    }
}

class DecimaTerceira
{
    public static void main(String[] args)
    {
        
    }
}