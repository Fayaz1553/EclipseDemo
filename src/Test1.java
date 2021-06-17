
class Test1 
{  
    public static void main(String args[]) 
    { 
       int a = 3; 
       int b = 2; 
       double d= Math.pow(a,b);
       int c=(int)d;
       System.out.println(c);
        //System.out.println(Math.pow(a, b)); //output of power will be a double always
  
        a = 3; 
        b = 4; 
        System.out.println(Math.pow(a, b)); 
  
        a = 2; 
        b = 6; 
        System.out.println(Math.pow(a, b)); 
    } 
} 