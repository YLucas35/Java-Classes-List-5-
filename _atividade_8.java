package Java_Lista_5_Enquanto;

import java.util.Scanner;

public class _atividade_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double points, plus, result;
        int count;

        count = 1;
        plus = 0;

        while (count <= 5) {
            System.out.println("Digite a nota da sua atividade "+count);
            points = sc.nextDouble();

            plus = plus + points;
            count = count + 1;
        }

        result = plus / 5;

        System.out.println("A média aritmética da sua notas é: "+result);

        sc.close();
    }
}
