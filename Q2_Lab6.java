import java.io.*;
class Minus
{
    void sub(int a, int b)
    {
        int c=a-b;
        System.out.println("The answer is:" + c);
    }
    void sub(float a, float b)
    {
        float c = a-b;
        System.out.println("The answer is:" + c);
    }
    
}
class Main{
    public static void main(String[] arr)throws IOException
    {
        Minus m = new Minus();
        m.sub(10,78);
        m.sub(35.4f, 23.7f);
    }
}
