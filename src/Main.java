import q4.AlertContext;
import q4.AlertStrategy;
import q4.NotificationAlertStrategy;
import q4.SoundAlertStrategy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private final static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    static AlertContext alertContext=new AlertContext();
    static AlertStrategy notification=new NotificationAlertStrategy();

    static AlertStrategy sound;


    public static void main(String[] args) throws IOException {
        System.out.println("Welcome!");
        alertContext.setAlertStrategy(notification);

        String input="";
        while (!(input.equals("q")))
        {
            Functions.welcomePrint();
            input=reader.readLine();
            switch (input)
            {
                case "d":
                {
                    System.out.println("press:\n n for notification\n s for sound ");
                    input=reader.readLine();

                    if(input.equals("n"))
                    {
                        alertContext.setAlertStrategy(notification);

                    }
                    else  if(input.equals("s"))
                    {
                        if(sound==null)
                        {
                            sound=new SoundAlertStrategy();
                        }
                        alertContext.setAlertStrategy(sound);

                    }
                    System.out.println(alertContext.sendAlert("Alerts"));
                }
            }

        }

    }
}