/**
 * Interface for notification services.
 *
 * @author Christian Andris
 */
public interface NotificationMedium {

    /**
     * Sends a notification message.
     *
     * @param message Message to send
     */
    void send(String message);
}
