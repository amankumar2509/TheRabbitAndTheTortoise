package thread.tortoise;

public class Tortoise implements Runnable{
    private static  final int MILESTONES = 5;
    private final Thread tortise;
    public Tortoise(){
        this.tortise=new Thread(this,"Tortise");
    }

    public Thread getTortise() {
        return tortise;
    }

    @Override
    public void run() {

    }
}
