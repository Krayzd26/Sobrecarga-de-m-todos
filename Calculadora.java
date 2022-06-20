public class Calculadora {

    public int somar(int... valores){
        int soma = 0;
        for(int i = 0; i < valores.length; i++){
            soma += valores[i];
        }
        return soma;
    }

    public int somar(int a, int b){
        return a + b;
    }
}
