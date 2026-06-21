import java.util.ArrayList;

/**
 * Container class that uses composition.
 *
 * @author Christian Andris
 */
public class Alertsystem {

    private NotificationMedium medium;
    private ArrayList<String> messageLog;

    /**
     * Constructor.
     *
     * @param medium Initial notification medium
     */
    public Alertsystem(NotificationMedium medium) {
        this.medium = medium;
        this.messageLog = new ArrayList<>();
    }

    /**
     * Changes the notification service.
     *
     * @param medium New notification medium
     */
    public void setMedium(NotificationMedium medium) {
        this.medium = medium;
    }

    /**
     * Sends a notification and stores it in the log.
     *
     * @param message Message to send
     */
    public void notifyUser(String message) {
        medium.send(message);
        messageLog.add(message);
    }

    /**
     * Displays all logged messages.
     */
    public void displayLog() {
        System.out.println("\nMessage Log:");
        for (String message : messageLog) {
            System.out.println(message);
        }
    }
}
