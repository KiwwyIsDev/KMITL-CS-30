import java.util.ArrayList;

class Lab1Coder {
    private String name;
    int experience;
    private ArrayList<String> languages;

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    void setExperience(int exp) {
        this.experience = exp;
    }

    int getExperience() {
        return experience;
    }

    void setLanguages(String... lang) {
        for (String a : lang) {
            // System.out.println(a);
            this.languages.add(a);
        }
    }

    ArrayList<String> getLanguages() {
        return this.languages;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (String s : getLanguages()) {
            sb.append(s + " ");
        }
        return String.format("%s(%d) knows %s", getName(), getExperience(), sb);
    }

    Lab1Coder() {
    }

    Lab1Coder(String n, int exp) {
        this.name = n;
        this.experience = exp;
        this.languages = new ArrayList<String>();
    }

    Lab1Coder(String n) {
        this.name = n;
        this.experience = 0;
        this.languages = new ArrayList<String>();

    }

    ArrayList<String> findCommonLanguages(Lab1Coder other) {
        ArrayList<String> same = new ArrayList<>();
        for (String myLang : this.languages) {
            for (String otherLang : other.languages) {
                if (myLang.equals(otherLang)) {
                    same.add(myLang);
                }
            }
        }
        if (same.isEmpty()) {
            same.add("none");
        }
        return same;
    }

}