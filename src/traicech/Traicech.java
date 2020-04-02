
package traicech;
import java.util.Scanner;
import java.lang.String;

public class Traicech 
{
    static void proviamoilparse(String kekkeroni, int variabilina)
    {
        String stringa = kekkeroni;
        int ics = variabilina;
        
        
        
        try
        {
        Integer.parseInt(stringa, ics);
        }
        catch(Exception NumberFormatException)
        {
            System.out.println("sei un coglione.");
        }      
    }
    

    public static void main(String[] args) 
    {
        String kekkeroni = new String();
        Scanner emagay = new Scanner(System.in);
        int variabilina = 0;
        System.out.print("inserisci un numero da parsare, oppure qualsiasi altro carattere ascii..");
        kekkeroni = emagay.nextLine();
        while(variabilina ==0 || variabilina ==1)
        {
            System.out.print("ora inserisci un numero su cui eseguire il parse: ");
            variabilina = emagay.nextInt();
        }
        proviamoilparse(kekkeroni, variabilina);
        
        
    }
    
}
