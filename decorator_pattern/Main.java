package decorator_pattern;

public class Main {

    public static void main(String args[]){
        Notification notification = new BasicNotification();

        notification = new SMSNotification(notification);
        System.out.println(notification.notifyUser());
    }  
    
}
