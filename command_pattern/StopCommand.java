package command_pattern;

public class StopCommand implements Command {

    private MusicPlayer musicPlayer;

    public StopCommand(MusicPlayer musicPlayer){
        this.musicPlayer = musicPlayer;
    }

    public void execute(){
        musicPlayer.stop();
    }
    
}
