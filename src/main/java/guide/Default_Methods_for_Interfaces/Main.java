package guide.Default_Methods_for_Interfaces;

public class Main {
    public static void main(String[] args) {

        Formula formula = new Formula() {
            @Override
            public double calculate(int a) {
                return sqrt(a * 100);
            }
        };

        System.out.println("calculate(16) = " + formula.calculate(16));
        System.out.println("sqrt(100) = " + formula.sqrt(100));
    }
}
