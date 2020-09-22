package dk.kea;

public class Main{

    public static void main(String[] args) {
        ZeroArgument zeroArgument = () -> "Hello World";
        System.out.println("ZeroArguments: " + zeroArgument.test());
        OneArgument<Integer> oneArgument = (t) -> t * t;
        System.out.println("OneArguments: " + oneArgument.test(2));
        TwoArguments<Integer,Integer> twoArgument = (t,f) -> t > f;
        System.out.println("TwoArguments: " + twoArgument.test(2,4));
    }
}
