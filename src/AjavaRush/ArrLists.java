package AjavaRush;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class MainClass
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] list = new String[5];
        int i = 0;
        for (; i < list.length; i++)
        {
            list[i] = reader.readLine();
            System.out.println("Вы ввели - "+list[i]);
        }

        for (String a:list){
            System.out.print(a + ", ");
        }

    }
}