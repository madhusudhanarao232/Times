package Jsp;
public class CommonPrefix {
    
    public static String findCommonPrefix(String[] s) {
        if (s == null || s.length == 0) {
            return "";
        }

        // Find the shortest string in the array
        String shortest = s[0];
        for (String str : s) {
            if (str.length() < shortest.length()) {
                shortest = str;
            }
        }

        StringBuilder commonPrefix = new StringBuilder();
        for (int i = 0; i < shortest.length(); i++) {
            char currentChar = shortest.charAt(i);
            for (String str : s) {
                if (str.charAt(i) != currentChar) {
                    return commonPrefix.toString();
                }
            }
            commonPrefix.append(currentChar);
        }

        return commonPrefix.toString();
    }
    public static void main(String[] args) {
        String[] s = {"Applebot","Approcat","Apple", "Appium", "Application"};
        String commonPrefix = findCommonPrefix(s);
        System.out.println("Common Prefix: " + commonPrefix);
    }
}
