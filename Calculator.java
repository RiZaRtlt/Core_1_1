import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class Calculator {
    static Supplier<Calculator> instance = Calculator::new;

    BinaryOperator<Integer> plus = (x, y) -> x + y;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiply = (x, y) -> x * y;
    BinaryOperator<Integer> devide = (x, y) -> x / y;

    UnaryOperator<Integer> pow = x -> x * x;
    //необходимо заключить в операторные скобки и написать return потому что внутри сложная логика
    UnaryOperator<Integer> abs = x -> {return (x > 0 ? x : x * -1);};

    Predicate<Integer> isPositive = x -> x>0;

    Consumer<Integer> println = System.out::println;
}
