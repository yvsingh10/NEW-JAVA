
class StringOperations
{
    public static void main(String[] args)
    {
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = "World";

        // String Comparison
        System.out.println("String Comparison:");
        System.out.println("s1 equals s2: " + s1.equals(s2));
        System.out.println("s1 equals s3: " + s1.equals(s3));

        // String Concatenation
        String result = s1.concat(" ").concat(s3);
        System.out.println("\nString Concatenation:");
        System.out.println(result);

        // Substring
        String sub = result.substring(0, 5);
        System.out.println("\nSubstring:");
        System.out.println(sub);
    }
}
