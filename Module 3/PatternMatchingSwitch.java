public class PatternMatchingSwitchDemo {
    public static void main(String[] args) {
        testPatternMatchingSwitch(42);
        testPatternMatchingSwitch("Hello");
        testPatternMatchingSwitch(3.14);
        testPatternMatchingSwitch(true);
        testPatternMatchingSwitch(null);
    }
    public static void testPatternMatchingSwitch(Object obj) {
        String result = switch (obj) {
            case Integer i -> "It's an Integer: " + i;
            case String s -> "It's a String: " + s;
            case Double d -> "It's a Double: " + d;
            case Boolean b -> "It's a Boolean: " + b;
            case null -> "It's null.";
            default -> "Unknown type: " + obj;
        };
        System.out.println(result);
    }
}
