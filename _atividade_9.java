package Java_Lista_5_Enquanto;

public class _atividade_9 {
    public static void main(String[] args) {
        int count, plus, result;

        plus = 0;
        count = 2;

        while (count <= 48) {
            plus = plus + count;
            result = plus + count;
            if (plus == 0) {
                System.out.println("Iniciando a soma com o primeiro par: "+count);
            }
            else {
                System.out.println(plus+"+"+count+"="+result);
            }
            plus = result;
            count = count + 2 ;
        }
    }
}
