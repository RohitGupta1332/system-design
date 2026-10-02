package decorator_pattern;

public abstract class NotificationDecorator implements Notification{

    protected Notification notification;

    public NotificationDecorator(Notification notification){
        this.notification = notification;
    }
    
}
