public class Calculator {

    int a;
    int b;
    char action;
    String res;

    public static void printCalc(){
        System.out.println("This is a calculator");
    }

//    public void calc(int a, int b, char action){
    public void calc(int a, int b, char action){

//        a = 9; b = 3;

        switch (this.action){
            case '+': res = String.valueOf(this.a + this.b); break;
            case '-': res = String.valueOf(this.a - this.b); break;
            case '*': res = String.valueOf(this.a * this.b); break;
            case '/': res = String.valueOf(a / this.b); break;
        }
        System.out.println(res);
    }



}
