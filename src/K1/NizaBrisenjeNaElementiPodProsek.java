//package K1;
import java.util.Scanner;
/*
За дадена низа од N цели броеви, да се избришат елементите со вредност помала од просекот на сите елементи во низата.
На пример за низата 1, 2, 3, 4, 5 просекот е (1 + 2 + 3 + 4 + 5) / 5 = 15 / 5 = 3, што значи треба да се
избришат елементите 1 и 2, што значи низата после оваа трансформација ќе биде 3, 4, 5.
Влез: Првиот број од влезот е бројот на елементи во низата N, а потоа во следниот ред се
дадени самите елементи одделени со празно место.
Излез: Низата пред и после направената трансформација.
*/
//public class NizaBrisenjeNaElementiPodProsek {
//    public static void main(String[] args){
//        Scanner scanner = new Scanner(System.in);
//        int[] broevi = new int[100];
//        int n = scanner.nextInt();
//        for(int i=0;i<n;i++){
//            int broj= scanner.nextInt();
//            broevi[i]=broj;
//        }
//        System.out.print("{");
//        for(int i=0;i<n;i++){
//            if(i==n-1){
//                System.out.print(broevi[i]);
//            }else {
//                System.out.print(broevi[i] + ",");
//            }
//        }
//        System.out.print("}");
//        System.out.println();
//        double suma=0;
//        for(int i=0;i<n;i++){
//            suma+=broevi[i];
//        }
//        double prosek=suma/n;
//        for(int i=0;i<n;i++){
//            if(broevi[i]<prosek){
//                for(int j = i; j < n - 1; j++){
//                    broevi[j] = broevi[j+1];
//                }
//                n--;
//                i--;
//            }
//        }
//        System.out.print("{");
//        for(int i=0;i<n;i++){
//            if(i==n-1){
//                System.out.print(broevi[i]);
//            }else {
//                System.out.print(broevi[i] + ",");
//            }
//        }
//        System.out.print("}");
//    }
//}
