import java.util.Scanner;
import java.util.Random;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int scelta;
    int[] array = new int[100];
    int numero = 0;

    do {
      System.out.println();
      System.out.println("1 - caricamento tastiera");
      System.out.println("2 - caricamento random");
      System.out.println("3 - visualizzazione");
      System.out.println("4 - inserimento in posizione");
      System.out.println("5 - cancellazione di un elemento cercato");
      System.out.println("0 - esci");

      System.out.println("Inserisci un numero da 1 a 5: ");
      scelta = in.nextInt();

      switch (scelta) {
        case 1:
          System.out.println("Inserisci un numero: ");
          numero = in.nextInt();
          System.out.println();
          for (int i = 0; i < numero; i++) {
            System.out.println("Inserisci il " + (i + 1) + "° numero: ");
            array[i] = in.nextInt();
          }
          System.out.println();
          break;

        case 2:
          Random random = new Random();
          int numeroRandom = random.nextInt(100) + 1;
          System.out.println("Il numero casuale generato è: " + numeroRandom);
          System.out.println();
          for (int i = 0; i < numeroRandom; i++) {
            array[i] = random.nextInt();
            System.out.println(array[i]);
          }
          System.out.println();
          break;

        case 3:
          for (int i = 0; i < numero; i++) {
            System.out.print(array[i] + " ");
          }
          System.out.println();
          break;

        case 4:
          System.out.println("In che posizione vuoi aggiungere l'elemento? ");
          int posizione = in.nextInt();
          System.out.println("Inserisci l'elemento da aggiungere:");
          array[posizione] = in.nextInt();

        case 5:
          System.out.println("Inserisci il numero da cancellare: ");
          int cancellaNumero = in.nextInt();
          for (int i = 0; i < numero; i++) {
            if (array[i] == cancellaNumero) {
              for (int j = i; j < numero - 1; j++) {
                array[j] = array[j + 1];
              }
              numero--;
              System.out.println("Elemento eliminato");
            }
          }
          System.out.println("Elemento non trovato");
          break;

        case 0:
          System.out.println("uscita dal programma");
          break;
      }
    } while (scelta != 0);

  }
}