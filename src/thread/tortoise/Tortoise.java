package thread.tortoise;

import javax.swing.*;

public class Tortoise implements Runnable{
    private static  final int MILESTONES = 5;
    private final Thread tortoise;
    public Tortoise(){
        this.tortoise=new Thread(this,"Tortoise");
    }

    public Thread getTortoise() {
        return tortoise;
    }

    @Override
    public void run() {
        for (int index = 0; index < MILESTONES; index++) {
            switch (index){
                case 0:
                    System.out.println("The Tortoise has started from start line! ");
                    break;
                case 1:
                    System.out.println("The Tortoise has reached cool river!");
                    break;
                case 2:
                    System.out.println("The Tortoise has reached the mountain hill!");
                    break;
                case 3:
                    System.out.println("The Tortoise has reached the big Oak tree!");
                    break;
                case 4:
                    System.out.println("The tortoise has reached the finish line!");
                    break;
            }
            try {
                Thread.sleep(3000L);
            }catch (InterruptedException e){
                System.err.println("The Tortoise has lost the paths! ");
            }

        }
        JOptionPane.showConfirmDialog(
                null,
                "The Tortoise has completed the path!",
                "Tortoise",
                JOptionPane.OK_CANCEL_OPTION
        );

    }
}
