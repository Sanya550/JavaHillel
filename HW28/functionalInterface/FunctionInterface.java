package HW28.functionalInterface;

@FunctionalInterface
public interface FunctionInterface<T, R> {

    R apply(T t);

}