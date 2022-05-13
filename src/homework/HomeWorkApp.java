package homework;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }


    public static void printThreeWords() {

        System.out.println("Orange\n " +
                " Banana\n" +
                " Apple\n");

    }

    public static void checkSumSign() {
        int a = 1;
        int b = -7;
        if (a + b >= 0) {
            System.out.println("сумма положительна");
        }
        if (a + b <= 0) {
            System.out.println("сумма отрицательная");
        }


    }


    public static void printColor() {
        int value = 100;
        if (value <= 0) {
            System.out.println("Красный");
        }
        if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        }
        if (value > 100) {
            System.out.println("Зеленый");
        }
    }


    private static void compareNumbers() {
        int a = 1, b = 3;
        if ( a >= b) {
            System.out.println("a >= b");
        }
        else  {
            System.out.println("a < b");
        }

    }

  //  int a = value == 82 ? 100500 : 0;
  //  System.out.println(value <= 0 ? "red" : value <= 100 ? "yellow" : "Green")  тернарный оператор

}