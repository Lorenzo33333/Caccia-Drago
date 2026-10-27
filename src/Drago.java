public class Drago implements Runnable {
    private final int nBattiti;

    public Drago(int nBattiti) {
        this.nBattiti = nBattiti;
    }

    @Override
    public void run(){
        System.out.println("Il drago spicca il volo!");
        for (int i = 1; i <= nBattiti; i++){
            if (Thread.currentThread().isInterrupted()){
                System.out.println("Il drago è stato colpito!");
                return;
            }
            System.out.println("Il drago sbatte le ali: " + i + "/" + nBattiti);
            try{
                Thread.sleep(1500);
            }catch (InterruptedException e){
                System.out.println("Il drago è morto!");
                return;
            }
        }

        System.out.println("Il drago ha completato il suo volo ed è atterrato in salvo");
    }
}
