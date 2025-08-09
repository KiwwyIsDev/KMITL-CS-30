class Notification {
    public String title;
    public String message;

    public Notification(String title, String message) {
        this.title = title;
        this.message = message;
    }

    public void send() {
        System.out.println("[Generic] " + title + " - " + message);
    }
}

class EmailNotification extends Notification {
    String email;
    String subject;

    public EmailNotification(String email, String subject, String message) {
        super(subject, message);
        this.email = email;
        this.subject = subject;
    }

    @Override
    public void send() {
        System.out.println("[Email] to " + email + " | " + subject + " : " + message);
    }
}

class SmsNotification extends Notification {
    String phoneNumber;

    public SmsNotification(String phoneNumber, String message) {
        super("SMS", message);
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void send() {
        System.out.println("[SMS] to " + phoneNumber + " : " + message);
    }
}

class PushNotification extends Notification {
    String deviceId;

    public PushNotification(String deviceId, String message) {
        super("Push", message);
        this.deviceId = deviceId;
    }

    @Override
    public void send() {
        System.out.println("[Push] to device " + deviceId + " : " + message);
    }
}

public class Main {
    public static void main(String[] args) {
        Notification n1 = new Notification("Generic", "Hello!");
        Notification n2 = new EmailNotification("user@example.com", "Welcome", "Thanks for joining.");
        Notification n3 = new SmsNotification("+66900000000", "Your OTP is 123456");
        Notification n4 = new PushNotification("DEVICE-ABC", "You have a new message");

        n1.send();
        n2.send();
        n3.send();
        n4.send();
    }
}
