public class TypeCastingExample {

    public static void main(String[] args) {
        double doubleValue = 9.75;
        int intFromDouble = (int) doubleValue;
        System.out.println("Original double value: " + doubleValue);
        System.out.println("After casting to int: " + intFromDouble);
        int intValue = 15;
        double doubleFromInt = intValue;
        System.out.println("Original int value: " + intValue);
        System.out.println("After casting to double: " + doubleFromInt);
    }
}
