import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Week2PartA {

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
            charClass = "";
            if (c >= 'A' && c <= 'Z') {
                charClass = "uppercase";
            } else if (c >= 'a' && c <= 'z') {
                charClass = "lowercase";
            } else if (c >= '0' && c <= '9') {
                charClass = "numeric";
            }

            if (charClass.length() != 0) {
                System.out.println("\"" + c + "\"" + " : " + charClass);
            }
        }
    }
}