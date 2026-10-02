package command_pattern;

public class Main {
    public static void main(String[] args){
        MusicPlayer player = new MusicPlayer();

        Command play = new PlayCommand(player);
        Command pause = new PauseCommand(player);
        Command stop = new StopCommand(player);
        
        Remote remote = new Remote();

        remote.setCommand(play);
        remote.pressButton();

        remote.setCommand(stop);
        remote.pressButton();

    }
    
}
