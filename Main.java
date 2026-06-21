/**
 * Driver class.
 *
 * @author Christian Andris
 */
public class Main {

    public static void main(String[] args) {

        NotificationMedium email = new EmailService();
        NotificationMedium sms = new SMSservice();

        Alertsystem alertSystem = new Alertsystem(email);

        alertSystem.notifyUser("System update available.");
        alertSystem.notifyUser("Security alert detected.");

        alertSystem.setMedium(sms);

        alertSystem.notifyUser("SMS test message.");
        alertSystem.notifyUser("Backup completed successfully.");

        alertSystem.displayLog();
    }
}
