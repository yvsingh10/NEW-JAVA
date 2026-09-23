class SortArray
{
    public static void main(String[] args)
    {
        int[] a = {5, 2, 8, 1, 3};
        int temp;

        // Ascending Order
        for(int i = 0; i < a.length - 1; i++)
        {
            for(int j = 0; j < a.length - 1 - i; j++)
            {
                if(a[j] > a[j + 1])
                {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }

        System.out.println("Ascending Order:");
        for(int i = 0; i < a.length; i++)
        {
            System.out.print(a[i] + " ");
        }

        // Descending Order
        for(int i = 0; i < a.length - 1; i++)
        {
            for(int j = 0; j < a.length - 1 - i; j++)
            {
                if(a[j] < a[j + 1])
                {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }

        System.out.println("\nDescending Order:");
        for(int i = 0; i < a.length; i++)
        {
            System.out.print(a[i] + " ");
        }
    }
}
