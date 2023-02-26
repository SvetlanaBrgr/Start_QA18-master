public class Main {

    public static void main(String[] args) {

        Calculator.printCalc();

        Calculator calc = new Calculator();
////        calc.calc(2,5,'*');
//        Calculator.a = 4;
//        Calculator.b = 5;

//        int a = 4;
//        int b = 8;
//        char action = '*';
//
//        calc.calc(a,b,action);
        calc.a = 4;
        calc.b = 2;
        calc.action = '/';

        calc.calc(6, 2, '+');

        Calculator calc1 = new Calculator();
        calc1.calc(8,8,'-');
    }
}