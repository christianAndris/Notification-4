/**
 * Email notification service.
 *
 * @author Christian Andris
 */
public class EmailService implements NotificationMedium {

    @Override
    public void send(String message) {
        System.out.println("EMAIL: " + message);
    }
}
