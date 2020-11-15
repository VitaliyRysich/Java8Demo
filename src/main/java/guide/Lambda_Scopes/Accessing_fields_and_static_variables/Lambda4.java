package guide.Lambda_Scopes.Accessing_fields_and_static_variables;

import guide.Functional_Interfaces.Converter;

class Lambda4 {
    static int outerStaticNum;
    int outerNum;

    //In contrast to local variables, we have both read and write access to instance fields and static variables from within lambda expressions.
    // This behaviour is well known from anonymous objects.

    void testScopes() {
        Converter<Integer, String> stringConverter1 = (from) -> {
            outerNum = 23;
            return String.valueOf(from);
        };

        Converter<Integer, String> stringConverter2 = (from) -> {
            outerStaticNum = 72;
            return String.valueOf(from);
        };
    }
}
