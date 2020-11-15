package guide.Lambda_Scopes.Accessing_local_variables;

import guide.Functional_Interfaces.Converter;

public class Main {
    public static void main(String[] args) {

        //We can read final local variables from the outer scope of lambda expressions:
        final int num = 1;
        Converter<Integer, String> stringConverter =
                (from) -> String.valueOf(from + num);

        stringConverter.convert(2);     // 3


        //But different to anonymous objects the variable num does not have to be declared final. This code is also valid:
        int num2 = 1;
        Converter<Integer, String> stringConverter2 =
                (from) -> String.valueOf(from + num2);

        stringConverter.convert(2);     // 3

        //However num must be implicitly final for the code to compile. The following code does not compile:
        int num3 = 1;
        Converter<Integer, String> stringConverter3 =
                (from) -> String.valueOf(from + num3);
//        num3 = 3;     Writing to num from within the lambda expression is also prohibited.
    }
}
