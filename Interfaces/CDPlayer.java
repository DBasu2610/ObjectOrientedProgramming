package Interfaces;

public class CDPlayer implements MediaPlayer {

    @Override
    public void start() {
        System.out.println("Run CD");
    }

    @Override
    public void stop() {
        System.out.println("Stop CD");
    }
    
}
