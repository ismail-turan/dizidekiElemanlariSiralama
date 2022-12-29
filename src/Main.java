import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Dizi Kaç elamnlı olacaktır :");
        int elemanSayisi=scanner.nextInt();
        int[] numbers=new int[elemanSayisi];
        for (int i=0;i<elemanSayisi;i++){
            System.out.print((i+1)+". elemanı giriniz :");
            numbers[i]=scanner.nextInt();
            System.out.println();
        }
        System.out.print("Dizinin elemanları :");
        for (int i:numbers){
            System.out.print(i+", ");
        }
        Arrays.sort(numbers);
        System.out.println();
        System.out.print("Dizinin elemanlarının küçükten büyüğe sıralı hali :");
        for (int i:numbers){
            System.out.print(i+", ");
        }
    }
}