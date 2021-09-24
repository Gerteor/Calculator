//Console calculator
import treatment.Treatment;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Start {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        String strNum = "-3-3";
        String[] s = strNum.split("");
        String a = s[0];
        System.out.println(a);
        System.out.println(-3-3);

        Pattern multiply = Pattern.compile("\\d^[-]");
        Matcher f = multiply.matcher(s[0]);

        if (a.equals("-")){
            System.out.println("HIII!");
        }


        System.out.println("If you want close write 'exit'");
        while (true) {
            try {
                String equation = scanner.nextLine();
                if (equation.equals("exit")) {
                    System.out.println("thx and bb");
                    break;
                }
                Treatment treatment = new Treatment(equation);
                treatment.toString();
            } catch (Exception e){
                System.err.println(e);
            }

        }

    }


}
