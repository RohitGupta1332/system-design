package decorator_pattern;

public class EmailNotification extends NotificationDecorator{

    public EmailNotification(Notification notification){
        super(notification);
    }

    @Override
    public String notifyUser(){
        return notification.notifyUser() + " using Email";
    }
}
