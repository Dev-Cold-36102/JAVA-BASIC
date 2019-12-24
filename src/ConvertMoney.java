import java.util.Scanner;
public class ConvertMoney {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("please enter the USD:");
        double money=scanner.nextDouble();
        System.out.println("convert to VND:"+money*23000);
    }
}
