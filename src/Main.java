import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {

    public static void printSeparation() {
        System.out.println(" ================== ");
    }

    public static void main(String[] args) {

        System.out.println("   *** Задача № 1 ***   ");
        System.out.println(" Реализация через анонимный класс ");

        Predicate<Integer> plusNumbers = new Predicate<>() {
            @Override
            public boolean test(Integer integer) {
                return integer >= 0;
            }
        };
        System.out.println(plusNumbers.test(1));
        System.out.println(plusNumbers.test(-25));

        printSeparation();

        System.out.println(" Реализация через лямбду-выражение ");

        Predicate<Integer> plusNumbers1 = integer -> (integer >= 0.0);
        System.out.println(plusNumbers1.test(50));
        System.out.println(plusNumbers1.test(-9));


        System.out.println("   *** Задача № 2 ***   ");
        System.out.println(" Реализация через анонимный класс ");

        Consumer<String> welcomeName = new Consumer<>() {
            @Override
            public void accept(String name) {
                System.out.println( " Добро пожаловать," + name + "!");

            }
        };
        welcomeName.accept("Нина Владимировна");
        welcomeName.accept("Аркадий");


        printSeparation();

        System.out.println(" Реализация через лямбду-выражение ");

        Consumer<String> welcomeName1 = name -> System.out.println(" Добро пожаловать," + name + "!" );
        welcomeName1.accept("Пушкин Александр Сергеевич");
        welcomeName1.accept ( "Матвейка007");


        System.out.println("   *** Задача № 3 ***   ");
        System.out.println(" Реализация через анонимный класс ");

        Function<Double, Long> number = new Function<>() {
            @Override
            public Long apply(Double quantity) {
                return Math.round(quantity);
            }
        };
        System.out.println( number.apply(3.141592653));
        System.out.println( number.apply(5.8));
        System.out.println( number.apply(0.897));


        printSeparation();

        System.out.println(" Реализация через лямбду-выражение ");

        Function<Double, Long> number1 = quantity -> Math.round(quantity);
        System.out.println( number1.apply(1051.525));
        System.out.println( number1.apply(8957.012547));


        System.out.println("   *** Задача № 4 ***   ");
        System.out.println(" Реализация через анонимный класс ");

        Supplier<Integer> randomNumber = new Supplier<>() {
            @Override
            public Integer get() {
                return (int)(Math.random() * 100);
            }
        };
        System.out.println(randomNumber.get());


        printSeparation();

        System.out.println(" Реализация через лямбду-выражение ");
        Supplier<Integer> randomNumber1 = () -> (int) (Math.random() * 100);
        System.out.println(randomNumber1.get());


        }















    }
