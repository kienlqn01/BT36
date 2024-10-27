import java.util.Scanner;

@FunctionalInterface
interface SumCalculator<T> {
    T calculate(T a, T b);
}

public class Main {
    public static void main(String[] args) {
        // Tạo biểu thức lambda cho SumCalculator với kiểu Double
        SumCalculator<Double> sumCalculator = (a, b) -> a + b;

        // Tạo đối tượng Scanner để nhập vào 2 số thực 64-bit
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số thực 64-bit a: ");
        double a = scanner.nextDouble();

        System.out.print("Nhập số thực 64-bit b: ");
        double b = scanner.nextDouble();

        // Tính và in ra tổng của a và b
        double result = sumCalculator.calculate(a, b);
        System.out.println("Tổng của " + a + " và " + b + " là: " + result);

        scanner.close();
    }
}
