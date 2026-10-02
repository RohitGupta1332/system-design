package command_pattern;

public class PauseCommand implements Command{

    private MusicPlayer musicPlayer;

    public PauseCommand(MusicPlayer musicPlayer){
        this.musicPlayer = musicPlayer;
    }

    public void execute(){
        musicPlayer.pause();
    }
    
}
