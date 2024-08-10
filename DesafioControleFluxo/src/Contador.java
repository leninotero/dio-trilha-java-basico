import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int param1, param2;

        try{
            System.out.print("Insira um numero: ");
            param1 = entrada.nextInt();
            System.out.print("Insira outro numero: ");
            param2 = entrada.nextInt();

            contar(param1, param2);

        }catch(ParametrosInvalidosException e){
            System.out.println("O segundo parametro deve ser maior que o primeiro");
        }
    }

    static void contar(int paramUm, int paramDois) throws ParametrosInvalidosException{
        int contador = paramDois - paramUm;

        ParametrosInvalidosException.validarEntradas(paramUm, paramDois);

        for (int i = 0; i < contador; i++){
            System.out.println("Imprimindo o numero: " + (i+1));
        }

    }
}
