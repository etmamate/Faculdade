import java.util.Scanner;

public class Atividade4 {
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("ATIVIDADE 4: ESCREVA UM PROGRAMA QUE MOSTRE A DIFERENÇA DE DOIS NÚMEROS");
        System.out.println("Digite um número: ");
        int d1 = scn.nextInt();
        System.out.print("Digite o segundo número: ");
        int d2 = scn.nextInt();
        System.out.printf("A diferença desses dois número é: "+ (d1 - d2)+".%n");
        scn.close();
    }
}
