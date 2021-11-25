package BMW_Office.Infrastructure.Notification;

public class NotificationDecorator implements INotify{

    private INotify iNotify;

    NotificationDecorator (INotify iNotify) {
        this.iNotify = iNotify;
    }

    @Override
    public void Notify() {
        iNotify.Notify();
    }
}
