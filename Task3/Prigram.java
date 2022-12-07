// 3.Реализовать простой калькулятор

package Task3;
/**
 * Task3
 */
import java.util.Scanner;
public class Prigram {

    public static void main(String[] args) {
      double num1;
      double num2;
      char what;
      double use;
      try (Scanner iScanner = new Scanner(System.in)) {
          System.out.print("Что делаем ? (+, -, /, *)");
          what = iScanner.next().charAt(0);
          System.out.print("Введите первое число:");
          num1 = iScanner.nextDouble();
          System.out.print("Введите второе число:");
          num2 = iScanner.nextDouble();
      }

      switch(what) {
          case (char) '+': use = num1 + num2;
             break;
          case (char) '-': use = num1 - num2;
             break;
          case (char) '*': use = num1 * num2;
             break;
          case (char) '/': use = num1 / num2;
             break;
          default:  System.out.printf("Ошибка! Введите правильный оператор");
             return;
       }
       System.out.printf(num1 + " " + what + " " + num2 + " = " + use);
     
  }
}