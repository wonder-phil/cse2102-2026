public class NotificationService {
    public static void main(String[] args) {
    
    NotificationFactory notificationFactory = new NotificationFactory();
    
    Notification notification = notificationFactory.createNotification("SMS");
    notification.notifyUser();

    notification = notificationFactory.createNotification("EMAIL");
    notification.notifyUser();
    }
}
    