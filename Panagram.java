# panagram
import java.io.*;
import java.util.*;
public class Panagram
{
  
  public static void main(String args[])throws IOException
  {
    int count=0;  
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the string");
    String str=br.readLine();
    for(int i=0;i<str.length();i++)
    {
      
      if((str.charAt(i)>='A' && str.charAt(i)<='Z') ||( str.charAt(i)>='a' && str.charAt(i)<='z'))
      {
        count ++;
          } 
          }
          if(count++==26)
          {
            
            System.out.println("The string is panagram");
            }
            else
            {
              System.out.println("The string is not a panagram");
              }
              }
              }


        


    
