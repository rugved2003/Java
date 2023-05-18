public class testcontinue{
    public static void main(String args[])
    {
    int sum=0;
    int number = 0;

    while (number < 20){
        number ++;
        
        if(number== 10 || number == 11) continue;
        System.out.println(number);
        sum +=number;
    }
    System.out.println("the numbrer is" + number);
    System.out.println("the sum is"+sum);
    }
}