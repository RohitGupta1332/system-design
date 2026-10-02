public class Main {

    public static void main(String[] args){
        Channel channel = new Channel();

        Subscriber rohit = new EmailSubscriber();
        Subscriber Adi = new MobileSubscriber();

        channel.subscribe(Adi);
        channel.subscribe(rohit);
        
        channel.uploadVideo("low level system design");

    }
    
}
