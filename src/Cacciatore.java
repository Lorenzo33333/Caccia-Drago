public class Cacciatore extends Thread{
        public void colpisciDrago(Thread drago){
            System.out.println("Il cacciatore scaglia una freccia contro il drago! ");
            drago.interrupt();
        }
}
