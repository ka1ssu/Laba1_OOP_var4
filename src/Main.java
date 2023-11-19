// 4. В каждом слове текста k-ю букву заменить заданным символом.
// Если k больше длины слова, корректировку не выполнять.

public class Main
{
    public static void main(String[] args)
    {
        int j = 1;
        int k = 3;
        String str = "Наступила зима, ударили морозы, выпал пушистый снег.";
        String strDone = "";
        char[] text = str.toCharArray();
        for (int i = 0; i < text.length; i++)
        {
            if (text[i] == ' ')
            {
                j = 0;
            } else if (j == k)
            {
                text[i] = '@';
            }
            j++;
            char c = text[i];
            strDone = strDone + c;
        }
        System.out.println(strDone);
    }
}