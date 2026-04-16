package Java_Lista_5_Enquanto;

import java.util.Scanner;

public class _atividade_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int limit, count;

        count = 0;

        System.out.println("Digite um número para ser o seu limite da contagem");
        limit = sc.nextInt();

        while (count<limit) {
            count = count + 5;
            System.out.println(count);
        }
        sc.close();
    }
}
