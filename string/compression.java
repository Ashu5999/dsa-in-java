public class compression {
    public static String compress(String str) {
        StringBuilder newStr = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            int count = 1;

            // count consecutive repeating characters
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }

            newStr.append(str.charAt(i)); // add the character
            if (count > 1) {
                newStr.append(count); // add the count if > 1
            }
        }

        return newStr.toString();
    }

    public static void main(String args[]) {
        String str = "aaabbbcc";
        System.out.println(compress(str)); // Output: a3b3c2
    }
}

