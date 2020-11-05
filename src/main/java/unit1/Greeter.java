package unit1;

public class Greeter {

    public void greet(Greeting greeting){
        greeting.perform();
    }

    public static void main(String[] args) {
        Greeter greeter = new Greeter();
        Greeting helloWorldGreeting = new HelloWorldGreeting();
        greeter.greet(helloWorldGreeting);

        greeter.greet(() -> System.out.println("Lambda as argument"));//Lambda as argument

        Greeting lambdaGreeting = () -> System.out.println("Lambda Greeting");
        lambdaGreeting.perform();

        MyAdd addFunction = (x, y) -> x + y;
        int z = addFunction.add(2,3);
        System.out.println("z: " + z);


        Greeting innerClassGreeting = new Greeting() {
            @Override
            public void perform() {
                System.out.println("Hello from inner");
            }
        };

        innerClassGreeting.perform();

        MyLambda s = () -> System.out.println("s");
        s.foo();

    }
}

interface MyLambda {
    void foo();
}

interface MyAdd {
    int add(int x, int y);
}

