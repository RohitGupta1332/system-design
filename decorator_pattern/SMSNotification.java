package decorator_pattern;

public class SMSNotification extends NotificationDecorator {

    public SMSNotification(Notification notification){
        super(notification);
    }

    @Override 
    public String notifyUser(){
        return notification.notifyUser() + " using SMS";
    }
    
}
