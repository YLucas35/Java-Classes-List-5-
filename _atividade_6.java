package Java_Lista_5_Enquanto;

public class _atividade_6 {
    public static void main(String[] args) {
        int count, plus, oldplus;

        plus = 1;
        count = 1;

        while (count <= 10) {
            oldplus = plus;
            plus = plus + count;
            System.out.println(oldplus+"+"+count+"="+plus);
            count = count + 1;
        }
    }
}
