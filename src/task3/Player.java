package task3;

public class Player implements Playable, Recodable{
    @Override
    public void play() {
        System.out.println("PLAY:ON");
    }

    @Override
    public void pause() {
        System.out.println("Playing and recording are paused");
    }

    @Override
    public void stop() {
        System.out.println("Playing and Recording are stopped");
    }

    @Override
    public void record() {
        System.out.println("REC:ON");
    }
}
