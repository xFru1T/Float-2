import java.util.Scanner;
import java.math.BigDecimal;
import java.math.MathContext;
class Float {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Print float number for round up: ");
        float num = scanner.nextFloat();
        System.out.print("Print count number after the ',' : ");
        int count = scanner.nextInt();
        count += 1;
        BigDecimal b1 = new BigDecimal(num);
        MathContext a = new MathContext(count);
        BigDecimal b2 = b1.round(a);
        System.out.println("Final rounded number: " + b2);
        }
    }

