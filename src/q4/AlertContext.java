package q4;

public class AlertContext {
    private AlertStrategy alertStrategy;

    public void setAlertStrategy(AlertStrategy alertStrategy) {
        this.alertStrategy =  alertStrategy;
    }
    public String sendAlert(String message) {

        return this.alertStrategy.sendAlert(message);
    }
}
