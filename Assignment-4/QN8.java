import java.util.*;
public class QN8   
{  
     public static void main(String[] args) { 
        Scanner ch = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String str = ch.nextLine(); 
        
        int[] freq = new int[str.length()];  
        char minChar = str.charAt(0), maxChar = str.charAt(0);  
        int i, j, min, max;          
          
        
        char string[] = str.toCharArray();  
          
       
        for(i = 0; i < string.length; i++) {  
            freq[i] = 1;  
            for(j = i+1; j < string.length; j++) {  
                if(string[i] == string[j] && string[i] != ' ' && string[i] != '0') {  
                    freq[i]++;  
                      
                    
                    string[j] = '0';  
                }  
            }  
        }  
          
        //Determine minimum and maximum occurring characters  
        min = max = freq[0];  
        for(i = 0; i <freq.length; i++) {  
              
             
           
            if(max < freq[i]) {  
                max = freq[i];  
                maxChar = string[i];  
            }  
        }  
          
      
        System.out.println("Maximum occurring character: " + maxChar);  
    }  
}  