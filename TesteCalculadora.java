public class TesteCalculadora {

    public static void main(String[] args){

        Calculadora calc = new Calculadora();
        calc.somar(2, 3);
        calc.somar(2, 3, 1, 4, 5);
        calc.somar(1);
        calc.somar(1, 2, 1, 2, 1, 2, 1, 2);
        calc.somar();
        calc.somar(1, 2);
    }
}
