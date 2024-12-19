import java.util.Scanner;
public class Shopping_Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        while(t>0){
        int n = sc.nextInt();
        int m = sc.nextInt();
        Shoping(n,m);
        t--;
        }
    }
    public static void Shoping(int n, int m){
        int a=0;
        int h=0;
        int phone = 1;
        while(true){
            a=a+phone;
            if(a>n){
                System.out.println("Harshit");
                break;
            }
            phone++;
            h=h+phone;
            if(h>m){
                System.out.println("Aayush");
                break;
            }
            phone++;
            

        }
        

    }
}
