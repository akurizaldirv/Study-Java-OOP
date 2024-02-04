import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        try {
            BigDecimal a = new BigDecimal(25);
            BigDecimal b = new BigDecimal(7);

            a = a.divide(b, 9);
            System.out.println(a);
        } catch (Exception e) {
            System.out.println(e.getClass());
        }

    }
}
