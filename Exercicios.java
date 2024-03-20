import java.util.Scanner;

public class Exercicios {
    public static void main(String[] args) {
       //programa que valida se um número é positivo ou negativo
        Scanner valorDigitado = new Scanner(System.in);
        /*System.out.println("Digite um número inteiro qualquer: ");
        int numero = valorDigitado.nextInt();

        if(numero < 0){
            System.out.println("É um numero negativo");
        } else if (numero == 0) {
            System.out.println("Numeor igual a zero");
        } else {
            System.out.println("É um numero positivo");
        }*/

        //Peça ao usuário para inserir dois números inteiros. Compare os números e imprima uma mensagem indicando se são iguais, diferentes, o primeiro é maior ou o segundo é maior.

        /*System.out.println("Digite o primeiro número: ");
        int numA = valorDigitado.nextInt();

        System.out.println("Digite o segundo número");
        int numB = valorDigitado.nextInt();

        if (numA == numB){
            System.out.println("Números iguais");
        } else {
            System.out.println("Números diferentes");
        }*/
        //Crie um menu que oferece duas opções ao usuário: "1. Calcular área do quadrado" e "2. Calcular área do círculo". Solicite a escolha do usuário e realize o cálculo da área com base na opção selecionada.
        /*System.out.println("Escolha uma opção:");
        System.out.println("1. Calcular área do quadrado");
        System.out.println("2. Calcular área do círculo");

        System.out.println("Opção: ");

        int escolha = valorDigitado.nextInt();
        switch (escolha){
            case 1:
                System.out.println("Digite o lado do quadrado: ");
                double lado = valorDigitado.nextDouble();
                double areaDoQuadrado = lado * lado;
                System.out.println("A área do quadrado é: " + areaDoQuadrado);
                break;
            case 2:
                System.out.println("Digite o raio do circulo: ");
                double raio = valorDigitado.nextDouble();
                double areaDoCirculo = Math.PI * raio * raio;
                System.out.println("A área do ciruclo é: " + areaDoCirculo);
                break;

        }*/
        //Crie um programa que solicite ao usuário um número e exiba a tabuada desse número de 1 a 10.
        /*System.out.println("Digite um número: ");
        int numero = valorDigitado.nextInt();


        for (int i = 0; i < 11; i++) {
            int resultado = numero * i;
            System.out.println(numero + " X " + i + " = "  + resultado);


        }*/
        //Crie um programa que solicite ao usuário a entrada de um número inteiro. Verifique se o número é par ou ímpar e exiba uma mensagem
        System.out.println("Digite um número: ");
        int numero = valorDigitado.nextInt();
        int fatorial = 1;
        /*if (numero % 2 == 0){
            System.out.println("Esse número é par.");
        } else {
            System.out.println("Esse número é impar");
        }*/
        //Crie um programa que solicite ao usuário um número e calcule o fatorial desse número.
        for (int i = numero; i >= 1; i--) {
            fatorial *= i;
            System.out.println("Fatorial parcial de " + i + " é: " + fatorial);
        }
        System.out.println("O fatorial de " + numero + " é: " + fatorial);
    }
}
