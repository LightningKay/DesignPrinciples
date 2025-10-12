package BehvioralPatterns;


class EmailNotification{
    public void send(String to, String message) {
        System.out.println("Checking rate limits for: " + to);
        System.out.println("Validating email recipient: " + to);
        String formatted = message.trim();
        System.out.println("Logging before send: " + formatted + " to " + to);

        // Compose Email
        String composedMessage = "<html><body><p>" + formatted + "</p></body></html>";

        // Send Email
        System.out.println("Sending EMAIL to " + to + " with content:\n" + composedMessage);

        // Analytics
        System.out.println("Analytics updated for: " + to);
    }
}

class SMSNotification{
    public void send(String to, String message) {
        System.out.println("Checking rate limits for: " + to);
        System.out.println("Validating phone number: " + to);
        String formatted = message.trim();
        System.out.println("Logging before send: " + formatted + " to " + to);

        // Compose SMS
        String composedMessage = "[SMS] " + formatted;

        // Send SMS
        System.out.println("Sending SMS to " + to + " with message: " + composedMessage);

        // Analytics (custom)
        System.out.println("Custom SMS analytics for: " + to);
    }
}
public class WithoutTemplatePattern {
    public static void main(String[] args) {
        EmailNotification email = new EmailNotification();
        SMSNotification sms = new SMSNotification();
        email.send("Karthik", "Oracle");
        sms.send("Karthik", "Oracle");
    }
}
