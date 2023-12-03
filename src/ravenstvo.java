public class ravenstvo {
    public static boolean ravenstvo(StringBuilder str1, StringBuilder str2) {
        if (str1.toString().equals(str2.toString())) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        StringBuilder str1 = new StringBuilder("Hello");
        StringBuilder str2 = new StringBuilder("Hello");
        StringBuilder str3 = new StringBuilder("World");

        boolean result1 = ravenstvo(str1, str2);
        boolean result2 = ravenstvo(str1, str3);

        System.out.println("str1 и str2 значения совпадают: " + result1);
        System.out.println("str1 и str3 значения совпадают: " + result2);
    }
}
