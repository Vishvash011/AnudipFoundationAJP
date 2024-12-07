package DayFour;

public class FindUniqueChar {
    public static String findUniqueCharacters(String str) {
        int[] charCount = new int[256]; // Array to store character counts
        StringBuilder uniqueChars = new StringBuilder();

        // Count occurrences of each character
        for (int i = 0; i < str.length(); i++) {
            charCount[str.charAt(i)]++;
        }

        // Identify and collect unique characters
        for (int i = 0; i < str.length(); i++) {
            if (charCount[str.charAt(i)] == 1) {
                uniqueChars.append(str.charAt(i));
            }
        }

        return uniqueChars.toString();
    }

    public static void main(String[] args) {
        String str = "java";
        String result = findUniqueCharacters(str);
        System.out.println("Output: " + result);
    }
}
