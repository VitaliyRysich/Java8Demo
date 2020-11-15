package guide.Functional_Interfaces;

public class Main {
    public static void main(String[] args) {
        Converter<String, Integer> converter = (from) ->  Integer.valueOf(from);
        int converted = converter.convert("123");
        System.out.println(converted);
    }
}
