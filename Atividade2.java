import java.util.Scanner;

public class Atividade2 {
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("ATIVIDADE 2: ESCREVA UM PROGRAMA PARA LER UM NÚMERO INTEIRO E EXIBIR SEU ANTECESSOR E SEU SUCESSOR!");
        System.out.println("Digite um número: ");
        int nn1 = scn.nextInt();
        System.out.printf("O Antecessor de: "+nn1+" é "+ (nn1 - 1) +" e o sucessor é: "+ (nn1 + 1)+".%n");
        scn.close();
    }
        
}
