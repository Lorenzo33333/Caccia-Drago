import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserisci il numero di battiti d'ali del drago: ");
        int battiti = scanner.nextInt();
        Drago dragoRunnable = new Drago(battiti);
        Thread threadDrago = new Thread(dragoRunnable);
        threadDrago.start();
        Cacciatore cacciatore = new Cacciatore();
        for (int i = 1; i <= battiti; i++){
            System.out.println("Sto osservando il drago (battito " + i + ")");
            if (i == 3){
                cacciatore.colpisciDrago(threadDrago);
            }
            try{
                Thread.sleep(800);
            }catch (InterruptedException e){
                System.out.println("Il main è stato interrotto");
            }
        }
        scanner.close();
    }
}
