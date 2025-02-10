public class Enum {
    public enum Direction {
        GO, WENT, GONE;
    }

    public enum Direction2 {
        GO(0), WENT(-90), GONE(-180);

        private int angle;

        private Direction2(final int angle) {
            this.angle = angle;
        }

        public int getAngle() {
            return angle;
        }

    }

    public enum DirectionAbstract {
        GO {
            @Override
            public String method() {
                return "GOGO";
            }
        },

        WENT {
            @Override
            public String method() {
                return "I WENT";
            }
        };

        public abstract String method();

    }

    public static void main(String[] args) {
        demo1(); // call enum
        demo2(); // dump enum and print
        demo3(); // methods
        demo4(); // swtich case
        demo5(); // abstract enum
    }

    static void demo1() {
        System.out.println(Direction.GO);
        System.out.println(Direction.GO);
        System.out.println(Direction.GO);
        Direction go = Direction.GO;
        System.out.println(go);
        System.out.println(go.ordinal());
        System.out.println(Direction.GONE.ordinal());

    }

    static void demo2() {
        Direction[] directions = Direction.values(); // dump the values

        for (Direction d : directions) {
            System.out.println(d + " " + d.ordinal());
        }
    }

    static void demo3() {
        Direction2 go = Direction2.GO;
        System.out.println(go);
        System.out.println(go.getAngle());
        System.out.println(Direction2.GO.getAngle());

        // Direction2.GO = Direction2.WENT; // singleton instance

        Direction2 gone1 = Direction2.GONE;
        Direction2 gone2 = Direction2.GONE;
        System.out.println(gone1 == gone2);
    }

    static void demo4() {
        for (Direction2 d : Direction2.values()) {
            switch (d) {
                case GO:
                    System.out.println("go GO");
                    break;
                case WENT:
                    System.out.println("go WENT");
                    break;
                case GONE:
                    System.out.println("go GONE");
                    break;
            }
        }
    }

    static void demo5() {
        for (DirectionAbstract d : DirectionAbstract.values()) {
            System.out.println(d.method());
        }
    }
}