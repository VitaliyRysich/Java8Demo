package guide.Functional_Interfaces;

@FunctionalInterface
public
interface Converter<F, T> {
    T convert(F from);
}
