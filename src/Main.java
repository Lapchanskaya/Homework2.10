import java.util.function.Predicate;

public class Main {

    public static void printSeparation() {
        System.out.println(" ================== ");
    }

    public static void main(String[] args) {

        System.out.println("   *** Задача № 1 ***   ");
        System.out.println("    Реализация через анонимный класс    ");

        Predicate<Integer> plusNumbers = new Predicate<>() {
            @Override
            public boolean test(Integer integer) {
                return integer >= 0;
            }
        };
        System.out.println(plusNumbers.test(1));
        System.out.println(plusNumbers.test(-25));

        printSeparation();

        System.out.println("    Реализация через лямбду-выражение    ");

        Predicate<Integer> plusNumbers1 = integer -> (integer >= 0.0);
        System.out.println(plusNumbers1.test(50));
        System.out.println(plusNumbers1.test(-9));





    }
}