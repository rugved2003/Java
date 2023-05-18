  class L2Q3 {
    public static void main(String args[])
    {
        // declaring character
        char a = 'R';

        // Integer data type is generally used for numeric values
        int i = 22;
  
        // use byte and short if memory is a constraint
        byte b = 5;
        // this will give error as number is
        // larger than byte range
        // byte b1 = 7888888955;
  
        short s = 77;
  
        // this will give error as number is
        // larger than short range, short s1 = 87878787878;
        
  
        // by default fraction value is double in java
        double d = 2.355453532;
  
        // for float use 'f' as suffix
        float f = 4.7333434f;
  
        System.out.println("char: " + a);
        System.out.println("integer: " + i);
        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
    }
}