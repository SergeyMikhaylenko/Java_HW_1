// 2.Вывести все простые числа от 1 до 1000

package Task2;

public class Program {
    public static void main(String[] args) {

        boolean b = true;
        for (int P = 2; P <= 7; P++) {
            for (int i = 2; i < P; i++) {
                if (P % i == 0) {
                    b = false;
                    break;
                }
            }
            if (b)
                System.out.println(P);
            else
                b = true;
        }
    }
}
