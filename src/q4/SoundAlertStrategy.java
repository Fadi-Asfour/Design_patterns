package q4;

public class SoundAlertStrategy implements AlertStrategy{
    @Override
    public String sendAlert(String message) {
        return  message+" will send using sound";
    }
}
