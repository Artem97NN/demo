public class Main {
    public static void main(String[] args) {

    }

    public int calculate(String s) {
        int result = 0;
        String[] array = s.split(" ");
        if (array.length > 3 || array.length < 2) {
            throw new ArithmeticException("Строка не является математической операцией");
        } else {
            int one = Integer.parseInt(array[0]);
            int two = Integer.parseInt(array[2]);
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
}
