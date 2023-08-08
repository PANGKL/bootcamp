public class Demo {
    public static void main(String[] args) {
        // Enum
        // 1. Finite number of members
        // Example 1: (Direction: LEFT, RIGHT, UP, DOWN)
        // Example 2: (Weekday: Monday, Tuesday...)
        // Example 3: (Double Entry: Debit, Credit)

        // Growth of enum elements(Change %`)



        System.out.println(Direction.EAST);
        System.out.println(Direction.EAST.name());
        System.out.println(Direction.NORTH);

        Direction east = Direction.EAST;
        Direction test = Direction.EAST;
        System.out.println("HIHIHIHIHI" + east.equals(test));
        System.out.println(east == Direction.NORTH); // false (can always use ==)
        System.out.println(east != Direction.NORTH); // true
        // == and != are checking the object reference



        // values() -> loop
        for (Direction i : Direction.values()) { // Direction.values() -> stactic method
            System.out.println(i.getChinese());
        }

        System.out.println(Direction.SOUTH.ordinal()); // 1
        System.out.println(Direction.EAST.ordinal()); // 0

        System.out.println(east.getDegree()); // 90
        System.out.println(east.getDirection()); // E

        System.out.println("-------------------------------------------------");

        System.out.println(Currency.CNY.getDecription());
        System.out.println(Currency.getCurrency(2));
        System.out.println(Currency.getCurrency(3));



    }
}
