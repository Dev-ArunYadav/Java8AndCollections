package lambda;

@FunctionalInterface
public interface FunctionalInterfaces {
    public void doSomething();

    public static void main(String[] args) {
        FunctionalInterfaces lambdaInterfaceImpl = () -> System.out.println("Hello World");
        lambdaInterfaceImpl.doSomething();
    }
}
