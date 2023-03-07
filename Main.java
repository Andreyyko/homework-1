public class Main {

    public static void main(String[] args) {

        byte byteValue1 = 32;
        byte byteValue2 = 26;
        System.out.println("Bytes:");
        System.out.println("Addition: " + byteValue1 + byteValue2);
        System.out.println("Subtraction: " + (byteValue1 - byteValue2));
        System.out.println("Multiplication: " + byteValue1 * byteValue2);
        System.out.println("Division: " + byteValue1 / byteValue2);

        short shortValue1 = 679;
        short shortValue2 = 320;
        System.out.println("\n" + "Shorts:");
        System.out.println("Addition: " + shortValue1 + shortValue2);
        System.out.println("Subtraction: " + (shortValue1 - shortValue2));
        System.out.println("Multiplication: " + shortValue1 * shortValue2);
        System.out.println("Division: " + shortValue1 / shortValue2);

        long longValue1 = 415_251_412_139L;
        long longValue2 = 115_741_341_249L;
        System.out.println("\n" + "Longs:");
        System.out.println("Addition: " + longValue1 + longValue2);
        System.out.println("Subtraction: " + (longValue1 - longValue2));
        System.out.println("Multiplication: " + longValue1 * longValue2);
        System.out.println("Division: " + longValue1 / longValue2);

        double doubleValue1 = 132.11631326;
        double doubleValue2 = 122.12312410;
        System.out.println("\n" + "Doubles:");
        System.out.println("Addition: " + doubleValue1 + doubleValue2);
        System.out.println("Subtraction: " + (doubleValue1 - doubleValue2));
        System.out.println("Multiplication: " + doubleValue1 * doubleValue2);
        System.out.println("Division: " + doubleValue1 / doubleValue2);

        float floatValue1 = 12.23f;
        float floatValue2 = 10.98f;
        System.out.println("\n" + "Floats:");
        System.out.println("Addition: " + floatValue1 + floatValue2);
        System.out.println("Subtraction: " + (floatValue1 - floatValue2));
        System.out.println("Multiplication: " + floatValue1 * floatValue2);
        System.out.println("Division: " + floatValue1 / floatValue2);
    }
}