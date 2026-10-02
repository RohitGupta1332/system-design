import java.util.ArrayList;
import java.util.List;

public class Channel {

    private List<Subscriber> subscribers = new ArrayList<>();

    public void subscribe(Subscriber subscriber){
        this.subscribers.add(subscriber);
    }

    public void uploadVideo(String videoTitle){
        for(Subscriber subscriber : subscribers){
            subscriber.update(videoTitle);
        }
    }
    
}
