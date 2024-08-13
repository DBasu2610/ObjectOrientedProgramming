package Interfaces;

public class MyCar {
    private Engine engine;
    private MediaPlayer media;

    public MyCar(Engine engine, MediaPlayer media) {
        this.engine = engine;
        this.media = media;
    }

    public MyCar() {
        media = new CDPlayer();
        engine = new PowerEngine(); // the reference variable is of Engine so it would access all properties of
                                    // Engine but the object created is of class PowerEngine so the version of the
                                    // methods implemented will depend on their versions in PowerEngine class
    }

    public void start() {
        engine.start();
    }

    public void stop() {
        engine.stop();
    }

    public void startMedia() {
        media.start();
    }

    public void stopMedia() {
        media.stop();
    }



}
