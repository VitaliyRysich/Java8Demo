package guide.Functional_Interfaces;

@FunctionalInterface
interface Converter<F, T> {
    T convert(F from);
}
