/**
 * SMS notification service.
 *
 * @author Christian Andris
 */
public class SMSservice implements NotificationMedium {

    @Override
    public void send(String message) {
        System.out.println("SMS: " + message);
    }
}
