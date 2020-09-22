package dk.kea;

@FunctionalInterface
public interface OneArgument<T> {
    Integer test(T t);
}
