import java.util.Random;

public class NumerosAleatorios {
    public static void main(String[] args) throws Exception {
        Random random = new Random();

        int[] sortearNumeros = new int[20];

        for(int i = 0; i < sortearNumeros.length; i ++){
            int numero = random.nextInt(100);
            sortearNumeros[i] = numero;
        }
        System.out.println("Numeros Aleatórios: ");

        for (int numero : sortearNumeros) {
            System.out.print(numero + " ");

        }
        System.out.println("Sucesores dos Numeros Aleatórios: ");

        for (int numero : sortearNumeros) {
            System.out.print((numero + 1) + " ");

        }
        System.out.println("Antecessores dos Numeros Aleatórios: ");

        for (int numero : sortearNumeros) {
            System.out.print((numero - 1) + " ");

        }
    }
}
