import java.util.Date;
import java.text.SimpleDateFormat;
public class AlfredQuotes {

    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String name) {
        return String.format("Hello %s, Good to see you.", name);
    }

    public String guestGreeting(String firstName, String lastName){
        // Create date instance
        Date date = new Date();
        String pattern = "HH";
        SimpleDateFormat hoursDate = new SimpleDateFormat(pattern);
        String hours = hoursDate.format(date);

        int actualHours = Integer.parseInt(hours);
        // if morning,
        if(actualHours < 12){
            return "Good morning, " + firstName + " " + lastName;
        }
        // if evening        
        if(actualHours >= 18){
            return "Good evening, " + firstName + " " + lastName;
        }
        // if afternoon,
        return "Good afternoon, " + firstName + " " + lastName;
    }
    
    public String dateAnnouncement() {
        Date currentDate = new Date();
        return "It is currently " + currentDate;
    }
    
    public String respondBeforeAlexis(String conversation) {

        if(conversation.indexOf("Alexis") >= 0){
            return "Right away Sir. Alexis cannot handle that input.";
        }
        else if(conversation.indexOf("Alfred") >= 0){
            return "Certainly, sir. I can oblige";
        }
        return "Right'o then. I can see I am not required";
    }

    public String moodResponse(String mood){
        if(mood.indexOf("happy") >= 0){
            return "Glast to hear it.";
        }
        if(mood.indexOf("sad") >= 0){
            return "Playing The Notebook";
        }
        if(mood.indexOf("angry") >= 0){
            return "Better hit the weights";
        }
        return "Yes sir";
    }
}