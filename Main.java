public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1,0);
        // ошибка деления на 0 потому как b = 0 изменим в строчке выше второй аргумент на 0
        int c = calc.devide.apply(a, b);

        calc.println.accept(c);

        //добавим для теста ещё несколько функций
        boolean v = calc.isPositive.test(1);
        System.out.println(v);

        calc.println.accept(calc.abs.apply(6));
        calc.println.accept(calc.pow.apply(2));
    }
}
