public class EmailSubscriber implements Subscriber{

    @Override 
    public void update(String videoTitle){
        System.out.println("Email update: subscribed to " + videoTitle);
    }
    
}
