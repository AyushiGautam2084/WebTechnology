import java.io.*;
class Counting  
{  
    private static int c;  
    public Counting()   
    {  
        c++;  
    }  
    public static void main(String args[])   
    {  
    //creating objects  
        Counting ob1 = new Counting();  
        Counting ob2 = new Counting();  
        Counting ob3 = new Counting();  
        Counting ob4 = new Counting();  
        Counting ob5 = new Counting();  
        //prints number of objects  
        System.out.print("Total Number of Objects: " + Counting.c);  
    }  
}  
