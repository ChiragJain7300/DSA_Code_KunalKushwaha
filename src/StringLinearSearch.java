public class StringLinearSearch {
    public static void main(String[] args) {
        String s = "My name is Chirag Jain";
        char ch = 'c';
        boolean isCharPresent = isCharPresent(s,ch);
        System.out.println(isCharPresent);
    }

    static boolean isCharPresent(String s, char ch) {
        for (int i = 0; i < s.length(); i++) {
            if(s.toLowerCase().charAt(i) == ch)
                return true;
        }
        return false;
    }
}
