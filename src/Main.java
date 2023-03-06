import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int bankinh=7;
        int duongkinh=14;
        float chuvi,dientich,dientich1;
        Scanner scanner= new Scanner(System.in);
        chuvi=duongkinh*3.14f;
        System.out.println("kết quả của chu vi là:"+chuvi);
        dientich=(bankinh*bankinh)*3.14f;
        System.out.println("kết quả của diện tích là:"+dientich);
        dientich1=3.14f*((duongkinh/2)*(duongkinh/2));
        System.out.println("diện tích dường tròn là:"+dientich1);


    }
}