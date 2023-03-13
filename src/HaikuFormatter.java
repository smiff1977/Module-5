public class HaikuFormatter
{
    public static void main(String[] args)
    {
        String[][] strings =
        {
                { "An", "Old", "Silent", "Pond..."},
                { "A", "frog", "jumps", "into", "the", "pond,"},
                { "splash!", "Silence", "again."}
        };

        for (int i = 0; i < strings.length; i++)
        {
            for (int j = 0; j < strings[i].length; j++)
            {
                System.out.print(strings[i][j] + " ");
            }
            System.out.print("\n"); // new line
        }
    }
}