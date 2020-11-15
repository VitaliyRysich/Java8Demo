package guide.Method_and_Constructor_References;

interface PersonFactory<P extends Person> {
    P create(String firstName, String lastName);
}