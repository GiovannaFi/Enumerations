public class Main {
    public static void main(String[] args) {
        enum Month {JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER}

        for (Month i : Month.values()) {
            if (i.toString().endsWith("Y")) System.out.println(i + ", ends with y");
            else System.out.println(i + ", doesn't end with y");
        }

    }
}

