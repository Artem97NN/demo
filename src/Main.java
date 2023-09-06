import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(calculate(requestString()));
    }

    public static int calculate(String s) {
        int result = 0;
        String[] array = s.split(" ");
        if (array.length > 3 || array.length < 2) {
            throw new ArithmeticException("Строка не является математической операцией");
        } else {
            int one = Integer.parseInt(array[0]);
            int two = Integer.parseInt(array[2]);
            if (one > 10 || one < 0 || two > 10 || two < 0) {
                throw new ArithmeticException("Числа не принадлежат необходимому диапазону");
            }
            String operation = array[1];
            switch (operation) {
                case "+":
                    result = one + two;
                    break;
                case "-":
                    result = one - two;
                    break;
                case "*":
                    result = one * two;
                    break;
                case "/":
                    result = one / two;
                    break;
            }
        }
        return result;
    }

    static String requestString() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите выражение: ");
        return scanner.nextLine();
    }
}
