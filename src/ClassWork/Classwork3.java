package ClassWork;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

// PascalCase (UpperCamelCase)
public class Classwork3 {

    //SNAKE_CASE
    public static final String SOME_CONSTANT_VALUE = "some";


    //camelCASE
    int someVariable = 66;

    public static void main(String[] args) {
        // scannerExample();
        //  randomExample();
        //  guessGame();
        // scannerReadFileExample();

        arrays2dExample();

    }

    private static void arrays2dExample() {
        int[][] arr = new int[3][3];
        arr[1][1] = 10;
        arr[2][2] = 99;
        print2dArray(arr);
        //     System.out.println(Arrays.deepToString(arr)); // через дееп ту стринг распечатывает в консоль ммассив

        int[][] arr2 = new int[3][];
        arr2[0] = new int[10];
        arr2[1] = new int[5];
        arr2[2] = new int[14];

        int[][] arr3 = {
                {1, 2, 3, 4},
                {1, 2, 3, 4},
                {1, 2, 3, 4},
                {1, 2, 3, 4},
        };
        print2dArray(arr3);

        int[][][][][][][][][][] superArr = new int[10][10][][][][][][][][];
    }


    public static void print2dArray(int[][] arr) {    // еще один способ напечатать 2мерный массив с помощью циклов и вложенных циклов/
        for (int y = 0; y < arr.length; y++) {  // идем сначала по верхнему уровню массива это Y первый уровень.
            for (int x = 0; x < arr[y].length; x++) {   // тут мы будем ореентироватся на длину Y вложеного массива
                System.out.print(arr[y][x] + " \t");  // делаем принт нашего массива + пробел
            }
            System.out.println(); // а когда вложенный массив пройдем мы перенесем сторчку

        }
    }


    private static void scannerReadFileExample() {
        try (Scanner sc = new Scanner(new FileInputStream("some.txt"))) {
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        } catch (IOException e) {
            e.printStackTrace();

        }
    }

    private static void guessGame() {
        Scanner scanner = new Scanner(System.in); // сканер для читания консоли
        System.out.print("введите диапозон значений через пробел >>> ");
        int low = scanner.nextInt();    // чтение
        int high = scanner.nextInt();   // диапозонов


        int[] arr = createArrayWithRandomValues(15, low, high + 1); // велечина 15 с границами от низкйи до высокий +1 включительно.

        System.out.print("угадайте число в этом массиве >>> ");
        int guess = scanner.nextInt(); //переменную гес мы получаем сканером методом некст ин
        int result = search(arr, guess); // получаем методом серч из нашего массива и искать мы будем гесс
        if (result < 0) {
            System.out.println(" не угадал ");
        } else {
            System.out.println("Угадал");
        }

        System.out.println(Arrays.toString(arr));
    }

    private static void scannerExample() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your word");
        scanner.useDelimiter("__"); // делиметер? что считает сканер разделителем
        String word = scanner.next();  //  считывает до пробела
        String word1 = scanner.nextLine();   // считывает до конца строки
        System.out.printf("your word is: %s\n", word);
        int a = scanner.nextInt();
        System.out.println(a);

        scanner.useLocale(Locale.CANADA);
        double d = scanner.nextDouble();
        System.out.println(d);
    }

    private static void randomExample() {
        int[] arr = createArrayWithRandomValues(3);
        System.out.println(Arrays.toString(arr));
        Random random = new Random();
        System.out.println(random.nextInt(100));
        int[] array = createArrayWithRandomValues(15, 100, 150);
        System.out.println(Arrays.toString(array));

        double randomDouble = random.nextDouble() * 100;
        System.out.println(randomDouble);

        System.out.println(random.nextInt(Integer.MAX_VALUE));
        System.out.println(Math.random());
    }

    public static int[] createArrayWithRandomValues() {
        Random random = new Random();
        int[] arr = new int[random.nextInt(Integer.MAX_VALUE)];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt();

        }

        return arr;

    }


    public static int[] createArrayWithRandomValues(int length) {
        int[] arr = new int[length];
        Random random = new Random();    // рондом случайнх чисел

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt();

        }

        return arr;

    }


    public static int[] createArrayWithRandomValues(int length, int lowBound, int highBound) {
        int range = lowBound - highBound;
        int[] arr = new int[length];
        Random random = new Random();  // рондом от низкой границы до высокой

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(range) + lowBound;

        }

        return arr;

    }


    public static int search(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return i;
            }

        }
        return -1;

    }

}
