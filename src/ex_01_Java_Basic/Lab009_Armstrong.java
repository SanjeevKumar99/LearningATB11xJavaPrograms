package ex_01_Java_Basic;

public class Lab009_Armstrong {
    public static void main(String[] args) {
        int num=345;
        int temp=num;
        int sum=0;
        int rem;

        while(num>0){
            rem= num%10;
            num=num/10;
            sum=sum+rem*rem*rem;
        }
        if(temp==sum){
            System.out.println(sum +" It is a Armstrong");
        }else{
            System.out.println(sum +" It is not a Armstrong");
        }
    }
}
