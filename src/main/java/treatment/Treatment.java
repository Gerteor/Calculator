package treatment;

import exception.PatternArgumentException;

import java.math.BigDecimal;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Treatment {
    private static BigDecimal a;
    private BigDecimal value;

    public Treatment(BigDecimal value) {
        this.value = value;
    }

    public BigDecimal getValue() {
        return value;
    }

    public Treatment(Treatment treatment) {
        this(treatment.getValue());
    }

    public Treatment(String strNum) {
        this(getValidValue(strNum));
    }

    private static BigDecimal getValidValue(String strNum) {
        strNum = strNum.replaceAll("\\s+", "");

        Pattern checkValid = Pattern.compile("[+,\\-,*,/]");
        Matcher cv = checkValid.matcher(strNum);
        String[] checkMin = strNum.split("");
        if (!cv.find()) {
            throw new PatternArgumentException(strNum);
        }else{

        String[] s = strNum.split("[+,\\-,*,/]");

        if (!checkMin[0].equals("-")) {
            Pattern multiply = Pattern.compile("\\d");
            Matcher f = multiply.matcher(s[0]);
            if (!f.find()) {
                throw new PatternArgumentException(strNum);
            }
            return getResponce(Double.parseDouble(s[0]), Double.parseDouble(s[1]), strNum);
        }
        return getResponce(Double.parseDouble(s[1]), Double.parseDouble(s[2]), strNum);
    }}

    private static BigDecimal getResponce(double first, double second, String strNum) {

        Pattern multiply = Pattern.compile("\\*");
        Matcher m1 = multiply.matcher(strNum);
        if (m1.find()) {
            a = BigDecimal.valueOf(first * second);
            System.out.println(a);
        }
        Pattern divide = Pattern.compile("\\/");
        Matcher m2 = divide.matcher(strNum);
        if (m2.find()) {
            a = BigDecimal.valueOf(first / (second * 1.0));
            System.out.println(a);
        }
        Pattern fold = Pattern.compile("\\+");
        Matcher m3 = fold.matcher(strNum);
        if (m3.find()) {
            a = BigDecimal.valueOf(first + second);
            System.out.println(a);
        }
        Pattern minus = Pattern.compile("\\-");
        Matcher m4 = minus.matcher(strNum);
        if (m4.find()) {
            String[] s = strNum.split("");
            String checkMinVal = s[0];
            if (!checkMinVal.equals("-")) {
                a = BigDecimal.valueOf(first - second);
                System.out.println(a);
            } else {
                a = BigDecimal.valueOf(-first - second);
                System.out.println(a);
            }

        }
        return a;
    }

    @Override
    public String toString() {
        return String.valueOf(a);
    }
}
