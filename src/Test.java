import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
    public static void main(String args[]) throws Exception {
        String pat =
                "^(([01]?\\d\\d?)||(2[0-4]\\d)||(25[0-5]))." +
                        "([01]?\\d\\d?||2[0-4]\\d||25[0-5])." +
                        "([01]?\\d\\d?||2[0-4]\\d||25[0-5])." +
                        "([01]?\\d\\d?||2[0-4]\\d||25[0-5])$";
        String str = "192.168.1.250";
        String str5 = "192.168.1.250";
        String str4 = "192.168.1.250";
        String str3 = "192.168.1.250";
        String str1 = "192.200.1.250";

        Pattern pattern = Pattern.compile(pat);
        Matcher matcher = pattern.matcher("12.");
        System.out.println(matcher.matches());
    }
}
