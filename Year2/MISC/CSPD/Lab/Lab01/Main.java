// Interface กำหนดพฤติกรรมที่ต้องมี
interface NotificationSender {
    void send(); // ทุกคลาสต้องมีวิธีส่ง
}

// Abstract class เก็บข้อมูลพื้นฐานร่วมกัน
abstract class Notification implements NotificationSender {
    protected String title;
    protected String message;

    public Notification(String title, String message) {
        this.title = title;
        this.message = message;
    }

    // อาจมีเมธอดทั่วไปที่ใช้ได้เลย (optional)
    public void preview() {
        System.out.println("Preview: " + title + " - " + message);
    }
}

// สืบทอดและ implement send()
class EmailNotification extends Notification {
    private String email;
    private String subject;

    public EmailNotification(String email, String subject, String message) {
        super(subject, message); // subject ใช้เป็น title
        this.email = email;
        this.subject = subject;
    }

    @Override
    public void send() {
        System.out.println("[Email] to " + email + " | " + subject + " : " + message);
    }
}

class SmsNotification extends Notification {
    private String phoneNumber;

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
    private String deviceId;

    public PushNotification(String deviceId, String message) {
        super("Push", message);
        this.deviceId = deviceId;
    }

    @Override
    public void send() {
        System.out.println("[Push] to device " + deviceId + " : " + message);
    }
}

// ทดสอบการทำงาน
public class Main {
    public static void main(String[] args) {
        NotificationSender n1 = new EmailNotification("user@example.com", "Welcome", "Thanks for joining.");
        NotificationSender n2 = new SmsNotification("+66900000000", "Your OTP is 123456");
        NotificationSender n3 = new PushNotification("DEVICE-ABC", "You have a new message");

        n1.send();
        n2.send();
        n3.send();
    }
}
