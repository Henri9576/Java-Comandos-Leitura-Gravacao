package Aula4EComandosLeituraGravacao;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        int idade = leitor.nextInt();
        float cotacaoDolar = leitor.nextFloat();
        double cotacaoEuro = leitor.nextDouble();
        String nome = leitor.nextLine(); //lê uma frase
        String codigoRua = leitor.next(); //lê uma palavra
        
        System.out.println("Texto que será exibido na outra linha.");
        System.out.print("Texto que será exibido na mesma linha.");
    }
}
