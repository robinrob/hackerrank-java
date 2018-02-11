import java.io.IOException;
import java.util.*;
import java.security.*;


public class Solution7 {
    public static void main(String[] args) {

        DoNotTerminate.forbidExit();

        try {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            in.close();
            System.out.println("Good job");
            String s = String.valueOf(n);
        } catch (Exception e) {
            System.out.println("Wrong answer");
        }
    }
}