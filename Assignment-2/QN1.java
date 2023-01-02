import java.util.*;
public class QN1
{
    public static void main(String [] args)
    {
        int a=0;
        Scanner s= new Scanner(System.in);
        System.out.print("Enter the length of an array : ");
        a=s.nextInt();
        int b[] = new int[a];
        int c[] = new int[a];
        int temp = 0;
        System.out.println("Enter the elements of the array : ");
        for(int i =0;i<a;i++)
        {
            b[i]=s.nextInt();
        }
           
          
        System.out.println("The duplicates array element is : ");  
        
        for(int i = 0; i < a; i++) {  
            for(int j = i + 1; j < a; j++) {  
                if(b[i] == b[j])  
                    System.out.println(b[j]);  

            }
        }
       

    }
}