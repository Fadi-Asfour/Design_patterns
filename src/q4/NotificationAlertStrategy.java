package q4;

public class NotificationAlertStrategy implements AlertStrategy {
    @Override
    public String sendAlert(String message) {
        return message +" will send using notification";
    }
}
