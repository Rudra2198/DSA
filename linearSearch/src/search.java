public class search {

    public static void main(String[] args) {
        String name = "Rudra";
        char target = 'a';
        System.out.println(searchInStrings(name,target));

    }

    static boolean searchInStrings(String str,char target) {

        if (str.length() == 0) {
            return false;
        }

        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i)) {
                return true;
            }
        }
        return false;
    }
}
