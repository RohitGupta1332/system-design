package decorator_pattern;

public class BasicNotification implements Notification{

    @Override 
    public String notifyUser(){
        return "A notification is sent.";
    }
    
}
