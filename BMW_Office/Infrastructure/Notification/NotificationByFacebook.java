package BMW_Office.Infrastructure.Notification;

public class NotificationByFacebook implements INotify{

    @Override
    public void Notify() {
        System.out.println("This is notification by Facebook");
    }
}
