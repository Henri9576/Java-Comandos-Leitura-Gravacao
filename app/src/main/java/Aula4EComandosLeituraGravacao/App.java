package Aula4EComandosLeituraGravacao;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        int idade = leitor.nextInt();
        float cotacaoDolar = leitor.nextFloat();
        double cotacaoEuro = leitor.nextDouble();
        String nome = leitor.nextLine(); //l� uma frase
        String codigoRua = leitor.next(); //l� uma palavra
        
        System.out.println("Texto que ser� exibido na outra linha.");
        System.out.print("Texto que ser� exibido na mesma linha.");
    }
}
