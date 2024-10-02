import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("키(cm)를 입력하세요: ");
        double height = scanner.nextDouble();

        System.out.print("몸무게(kg)를 입력하세요: ");
        double weight = scanner.nextDouble();

        double bmi = weight / Math.pow(height / 100, 2);

        if (bmi < 18.5) {
            System.out.println("저체중");
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            System.out.println("정상");
        } else if (bmi >= 25 && bmi <= 29.9) {
            System.out.println("과체중");
        } else {
            System.out.println("비만");
        }
    }
}