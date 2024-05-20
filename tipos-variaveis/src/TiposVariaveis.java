public class TiposVariaveis {
    public static void main(String[] args) throws Exception {

        String meuNome = "joao";//String representa texto
        double salarioMinimo = 2500; //valor inteiro

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        numeroCurto = (short) numeroNormal; // Correção: Removida a redeclaração de numeroCurto

        int numero = 5;
        System.out.print(numero); // Saída: 5

        final double VALOR_DE_PI = 3.14;//constante
    }
}