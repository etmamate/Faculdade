import java.util.Scanner;

public class Atividade {
    public static void main(String[] args) {

    }

    void Atv1() {
        Scanner scn = new Scanner(System.in);
        System.out.println("ATIVIDADE 1: ESCREVA UM PROGRAMA PARA LER DOIS NÚMERO INTEIROS E EXIBI-LOS");
        System.out.println("Digite um número: ");
        int n1 = scn.nextInt();
        System.out.println("Digite outro número: ");
        int n2 = scn.nextInt();
        System.out.printf("Seus números são: %s e %S.%n", n1, n2);
        scn.close();
    }
}
