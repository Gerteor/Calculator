package treatment;

import org.junit.Test;

import static org.junit.Assert.*;

public class TreatmentTest {

    @Test
    public void testPlus() {
        Treatment treatment = new Treatment("3+3");
        treatment.toString();
        String a = treatment.toString();
        assertEquals("6.0", a);

    }

    @Test
    public void testMinus() {
        Treatment treatment = new Treatment("3-4");
        treatment.toString();
        String a = treatment.toString();
        assertEquals("-1.0", a);

    }

    @Test
    public void testDivide() {
        Treatment treatment = new Treatment("21/7");
        treatment.toString();
        String a = treatment.toString();
        assertEquals("3.0", a);

    }

    @Test
    public void testMultiply() {
        Treatment treatment = new Treatment("3*3");
        treatment.toString();
        String a = treatment.toString();
        assertEquals("9.0", a);

    }

    @Test
    public void testMinusMinVal() {
        Treatment treatment = new Treatment("-3-4");
        treatment.toString();
        String a = treatment.toString();
        assertEquals("-7.0", a);

    }
}