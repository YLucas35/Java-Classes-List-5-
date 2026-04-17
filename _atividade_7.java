package Java_Lista_5_Enquanto;

import java.util.Scanner;

public class _atividade_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count, oldplus, plus, limit;

        plus = 1;
        count = 1;

        System.out.println("Digite um número para ser o limite da sua soma de números (começando do número 1).");
        limit = sc.nextInt();

        while (count <= limit) {
            oldplus = plus;
            plus = plus + count;
            System.out.println(oldplus+"+"+count+"="+plus);
            count = count + 1;
        }
        sc.close();
    }
}
