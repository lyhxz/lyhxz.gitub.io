import java.util.Scanner;
public class TWO {
    public static void main(String[] rags) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请规定一个圆半径：");
        double R = sc.nextInt();
        double S = 3.14 * R * R;
        double L =  2 * 3.14 * R;
        System.out.println("面积为" + R +   "\n周长为" + L);
    }

}








