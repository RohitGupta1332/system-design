package command_pattern;

public class PlayCommand implements Command{
    private MusicPlayer musicPlayer;

    public PlayCommand(MusicPlayer musicPlayer){
        this.musicPlayer = musicPlayer;
    }

    public void execute(){
        musicPlayer.play();
    }
}
