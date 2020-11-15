package guide.Default_Methods_for_Interfaces;

public interface Formula {
    double calculate(int a);

    default public double sqrt(int a) {
        return Math.sqrt(a);
    }
}
