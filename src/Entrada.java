import java.util.Scanner;

public class Entrada {
    public static Scanner entrada = new Scanner(System.in);

    public static String lerTexto(String mensagem){
        System.out.print(mensagem);
        return entrada.nextLine();
    }

    public static int lerInteiros(String mensagem){
        System.out.print(mensagem);

        while (!entrada.hasNextInt()){
            System.out.println("Entrada invalida, digite um numero inteiro!");
            entrada.next();
        }

        int valor = entrada.nextInt();
        entrada.nextLine();
        return valor;
    }

    public static double lerDecimais(String mensagem){
        System.out.print(mensagem);

        while (!entrada.hasNextDouble()){
            System.out.println("Digite um numero decimal valido!");
            entrada.next();
        }

        double valor = entrada.nextDouble();
        entrada.nextLine();
        return valor;
    }







}
