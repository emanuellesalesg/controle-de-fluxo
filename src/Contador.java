
import java.util.Scanner;

public class Contador {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Primeiro parâmetro:");
        int parametroUm = scanner.nextInt();

        System.out.println("Segundo parâmetro:");
        int parametroDois = scanner.nextInt();

        try {
            verificarNumeros(parametroUm, parametroDois);
            int limite = parametroDois - parametroUm;
            contador(limite);

        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        }
    }

    static void verificarNumeros(int numero1, int numero2) throws ParametrosInvalidosException{
        if(numero2 <= numero1){
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }
    }

    static void contador(int numero){
        System.out.println("Iniciando contagem: ");
        for (int i = 1; i <= (numero); i++) {
            System.out.println(i);
        }
    }
}
