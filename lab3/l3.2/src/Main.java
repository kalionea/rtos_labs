public class Main {

    public static void main(String[] args) {
        Double d1 = Double.valueOf(10.25);
        Double d2 = Double.valueOf("10.75");


        String stringVal = "15.55";
        double doubleFromStr = Double.parseDouble(stringVal);


        byte byteValue = d1.byteValue();
        short shortValue = d1.shortValue();
        int intValue = d1.intValue();
        long longValue = d1.longValue();
        float floatValue = d1.floatValue();


        System.out.println(d2);


        String d = Double.toString(3.14);
        System.out.println(d);


        String s = "MeoW";
        String t = "";
        double k = 0;
        for (int i = 0; i < s.length(); ++i) {
            char ch = s.charAt(i);
            int n = (int) ch;
            t += "" + String.valueOf(n);
        }
        System.out.println(s);
        System.out.println(t);
        double doubleFromStr1 = Double.parseDouble(t);
        System.out.println(doubleFromStr1);


    }
}