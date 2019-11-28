public class TypeInterfaceExample {
    public static void main(String[] args) {
        StringLengthLambda myLambda = (s) -> s.length();
        System.out.println(myLambda.getLength("Hello Lambda"));

    }


    interface StringLengthLambda {
        int getLength(String s);
    }

}
