package org.example;

/**
 * Lambda example
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Operation sum=(int x, int y) -> x+y;
        Operation subtraction=(int x, int y) -> x-y;
        Operation raised=(int x, int y)->{
            int a=x;
            for (int i = 0; i < y; i++) {
                a=a*x;
            }
            return a;
        };
        System.out.println("300+200="+DoOperation(300,200,sum));
        System.out.println("300+200="+DoOperation(300,200,subtraction));
        System.out.println("3^5="+DoOperation(3,5,raised));
    }
    static int DoOperation(int x, int y, Operation op){
        return op.operation(x,y);
    }
    interface Operation{
        int operation(int x, int y);
    }
}
