package odmocnina;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Odmocnina {
    public static void main(String[] args)
            throws IOException
    {
       System.out.println("Program Odmocnina by Samuel Hušek");
       System.out.println("Zadejte číslo: ");
       BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
       String inputString = bufferRead.readLine();
       double name = Double.parseDouble(inputString);
       System.out.println("Výsledek: " + Math.sqrt(name));
    } 
}