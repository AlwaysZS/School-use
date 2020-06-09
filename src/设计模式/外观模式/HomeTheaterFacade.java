package 设计模式.外观模式;

public class HomeTheaterFacade {
    //定义各子系统对象
    private TheaterLight therterLight;
    private Popcorn popcorn;
    private Stereo stereo;
    private Projector projector;
    private Screen screen;
    private DVDPlayer dvdPlayer;

    public HomeTheaterFacade() {
        this.therterLight = therterLight.getInstance();
        this.popcorn = popcorn.getInstance();
        this.stereo = stereo.getInstance();
        this.projector = projector.getInstance();
        this.screen = screen.getInstance();
        this.dvdPlayer = dvdPlayer.getInstance();
    }

    //操作分成四步
    public void ready(){
        popcorn.on();
        popcorn.pop();
        screen.down();
        projector.on();
        stereo.on();
        dvdPlayer.on();
        therterLight.down();
    }

    public void play(){
        dvdPlayer.play();
    }

    public void pause(){
        dvdPlayer.pause();
    }

    public void end(){
        popcorn.off();
        therterLight.up();
        screen.up();
        projector.off();
        stereo.off();
        dvdPlayer.off();
    }
}
