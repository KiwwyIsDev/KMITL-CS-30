public class Singer {
    private String name;
    private SingStyle style; // preferred enum

    public Singer(String n, SingStyle s) {
        name = n;
        style = s;
    }

    public String getName() {
        return name;
    }

    public SingStyle getStyle() {
        return style;
    }

    public String getStyleString() {
        return style.toString();
    }

    public void sing() {
        System.out.println(name);
    }

    @Override
    public String toString() {
        return "Singer (" + name + "-" + style + ")";
    }

    public int compareByName(Singer s) {
        return name.compareTo(s.getName());
    }
    public int compareByStyle(Singer s) {
        return style.compareTo(s.style);
    }
}