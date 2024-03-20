    import java.util.Random;
    import java.util.Scanner;

    public class Contador {
        public static void main(String[] args) {
            int numeroAleatorio;
            numeroAleatorio = new Random().nextInt(100) + 1;
            System.out.println(numeroAleatorio);
            int tentativaMaxima = 5;
            int tentativaFeitas = 0;
            Scanner valorDigitado = new Scanner(System.in);

            System.out.println("Bem-vindo ao jogo de adivinhação! Tente adivinhar o número entre 0 e 100.");

            while (tentativaFeitas < tentativaMaxima){
                System.out.println("Tentativa " + (tentativaFeitas + 1) + ": Digite um número");
                int palpite = valorDigitado.nextInt();
                tentativaFeitas++;

                if (palpite == numeroAleatorio){
                    System.out.println("O número aleatório: " + numeroAleatorio + " foi achado em " + tentativaFeitas);
                    break;
                } else if (palpite < numeroAleatorio) {
                    System.out.println("O número sorteado é maior.");
                } else {
                    System.out.println("O número sorteado é menor.");
                }
            }
            if (tentativaFeitas == tentativaMaxima) {
                System.out.println("Suas tentativas acabaram! O número correto era: " + numeroAleatorio);
            }

        }
    }
