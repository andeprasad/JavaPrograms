import java.util.HashMap;

public class HR_JavaAnagram {
    public static void main(String[] args) {
//        String s1 = "anagram";
//        String s2 = "margana";
        String s1 = "Hello";
        String s2 = "hello";
//        String s1 = "anagramm";
//        String s2 = "marganaa";
        System.out.println(isAnagram(s1, s2));
    }
    static boolean isAnagram(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();
        System.out.println(a);
        System.out.println(b);
        HashMap<Character, Integer> mapa = new HashMap<>();
        mapa.put(' ', 0);
        for (int i = 0; i < a.length(); i++) {
            if (!mapa.containsKey(a.charAt(i))) {
                mapa.put(a.charAt(i), 1);
            } else {
                Integer valueofi = mapa.get(a.charAt(i));
                int newvalue = 0;
                newvalue = valueofi + 1;
                mapa.put(a.charAt(i), newvalue);
//                System.out.println("The value is : " + valueofi + " and the newvalue is : " + newvalue + " and the chai is : " + a.charAt(i));
            }
        }
        System.out.println("The Map of String A is : " + mapa);

        HashMap<Character, Integer> mapb = new HashMap<>();
        mapb.put(' ', 0);
        for (int i = 0; i < b.length(); i++) {
            if (!mapb.containsKey(b.charAt(i))) {
                mapb.put(b.charAt(i), 1);
            } else {
                Integer valueofi = mapb.get(b.charAt(i));
                int newvalue = 0;
                newvalue = valueofi + 1;
                mapb.put(b.charAt(i), newvalue);
//                System.out.println("The value is : " + valueofi + " and the newvalue is : " + newvalue + " and the chai is : " + b.charAt(i));
            }
        }
        System.out.println("The Map of String B is : " + mapb);

        return mapa.equals(mapb);
    }
}
