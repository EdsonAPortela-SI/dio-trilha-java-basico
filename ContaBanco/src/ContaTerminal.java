import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Por favor, digite o numero da Ag\u00EAncia! ");
        int numero = teclado.nextInt();

        teclado.nextLine();

        System.out.println("Por favor, Agora digite a sua Ag\u00EAncia! ");
        String agencia = teclado.nextLine();

        System.out.println("Por favor! Digite o seu nome: ");
        String nome = teclado.nextLine();

        System.out.println("Digite o valor que quer depositar: ");
        double saldo = teclado.nextDouble();

        System.out
                .println("Ol\u00E1  " + nome + ", obrigado por criar uma conta em nosso banco, sua ag\u00EAncia \u00E9 "
                        + agencia + ",  conta  " + numero + " e  saldo  " + saldo
                        + " j\u00E1 est\u00E1 dispon\u00EDvel para saque.");
    }
}
