/**
 * Topic: Design Patterns - Factory Pattern
 * Subtopics: Creational design pattern, loose coupling, object creation abstraction
 */
interface Notification {
    void notifyUser();
}

class SMSNotification implements Notification {
    public void notifyUser() {
        System.out.println("Sending an SMS notification...");
    }
}

class EmailNotification implements Notification {
    public void notifyUser() {
        System.out.println("Sending an Email notification...");
    }
}

class NotificationFactory {
    public static Notification createNotification(String channel) {
        if (channel == null || channel.isEmpty()) return null;
        if ("SMS".equalsIgnoreCase(channel)) return new SMSNotification();
        if ("EMAIL".equalsIgnoreCase(channel)) return new EmailNotification();
        throw new IllegalArgumentException("Unknown channel: " + channel);
    }
}

public class FactoryPatternDemo {
    public static void main(String[] args) {
        Notification notification = NotificationFactory.createNotification("SMS");
        notification.notifyUser();
    }
}
