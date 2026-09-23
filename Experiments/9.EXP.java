class Pattern
{
    public static void main(String[] args)
    {
        int i, j;

        // Star Pattern
        System.out.println("Star Pattern:");

        for(i = 1; i <= 4; i++)
        {
            for(j = 1; j <= i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Number Pattern
        System.out.println("\nNumber Pattern:");

        for(i = 1; i <= 4; i++)
        {
            for(j = 1; j <= i; j++)
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
