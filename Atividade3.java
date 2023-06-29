import java.util.Scanner;

public class Atividade3 {
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("ATIVIDADE 3: ESCREVA UM PROGRAMA QUE LEIA DOIS NÚMEROS E FAÇA A SOMA");
        System.out.println("Digite um número: ");
        int s1 = scn.nextInt();
        System.out.println("Digite o segundo número: ");
        int s2 = scn.nextInt();
        System.out.printf("A soma desses números é:"+ (s1 + s2)+".%n");
        scn.close();
    }
}
