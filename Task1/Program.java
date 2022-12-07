package Task1;

// 1.Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
public class Program {

    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            int triangularNumber = 0;
            int sum = 0;
            for (int j = 1; j <= i; j++) {
                triangularNumber = triangularNumber + j;
                sum = sum + triangularNumber;
            }
            System.out.println(sum);

        }

    }

}
