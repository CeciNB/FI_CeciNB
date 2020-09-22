package dk.kea;

@FunctionalInterface
public interface TwoArguments<T,F> {
   boolean test(T t, F f);
}
