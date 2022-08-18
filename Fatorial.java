import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.print("Digite um numero: ");
        n = sc.nextInt();


        System.out.println("O fatorial de " + n + ": " + fatorialComRecursao(n));
    }

    private static int fatorialComRecursao(int valor){

        if(valor == 0) {
            return 0;

        } else if (valor > 1) {
            return valor * fatorialComRecursao(valor - 1);

        } else {
            return (1);
        }
    }







}
