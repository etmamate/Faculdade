import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        //atividades
        Atividade atv1 = new Atividade();
        Scanner scn = new Scanner(System.in);
        int opcao;
        String breakline = "-".repeat(24);
        String menu = """
                1-ATIVIDADE 1: LER DOIS NÚMERO INTEIROS E EXIBI-LOS
                2-ATIVIDADE 2: LER UM NÚMERO INTEIRO E EXIBIR SEU ANTECESSOR E SEU SUCESSOR!
                3-ATIVIDADE 3: LEIA DOIS NÚMEROS E FAÇA A SOMA
                4-ATIVIDADE 4: MOSTRE A DIFERENÇA DE DOIS NÚMEROS
                5-
                6-
                7-
                8-
                9-
                10-
                11-
                """;
        do{
            System.out.println(breakline);
            System.out.println(menu);
            System.out.println(breakline);
            opcao = scn.nextInt();
            switch(opcao)
            {
                case 1:
            }


        
        }while(opcao!=0);

        
        
    }
}
