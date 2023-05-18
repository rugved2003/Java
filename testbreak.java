 public class testbreak{
    public static void main(String args[])
    {
    int sum=0;
    int number = 0;

    while (number < 25){
        number ++;
        sum += number;
        if(sum>= 150) break;
        System.out.println(number);
    }
    System.out.println("the numbrer is" + number);
    System.out.println("the sum is"+sum);
    }
}