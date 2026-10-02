public class MobileSubscriber implements Subscriber{

    @Override 
    public void update(String videoTitle){
        System.out.println("Mobile update: subscribed to " + videoTitle);
    }
    
}
