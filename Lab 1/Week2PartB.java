import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Week2PartB {

    public static void main(String[] args) {
        String userInput = "";
        String charClass = "";
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            userInput = reader.readLine();
        } catch (IOException ex) {
            System.err.print("Input error!");
            ex.printStackTrace();
            System.exit(1);
        }

        for (int i = 0; i < userInput.length(); ++i) {
            char c = userInput.charAt(i);

            if (c >= 'A' && c <= 'Z') {
                charClass = "uppercase";
            } else if (c >= 'a' && c <= 'z') {
                charClass = "lowercase";
            } else if (c >= '0' && c <= '9') {
                charClass = "numeric";
            } else if ((c >= 9 && c <= 13) || (c == 32)) {
                charClass = "whitespace";
            } else if ((c >= 33 && c <= 47) || (c >= 58 && c <= 64) || (c >= 91 && c <= 96) || (c >= 123 && c <= 126)){
                charClass = "punctuation";
            } else if (c > 127) {
                charClass = "extended character";
            } else {
                charClass = "unprintable";
            }
            System.out.println("\"" + c + "\"" + " : " + charClass);
            
        }
    }
}