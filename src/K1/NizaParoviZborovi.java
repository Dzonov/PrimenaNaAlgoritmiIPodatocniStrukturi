//package K1;
//import java.util.Scanner;
//public class NizaParoviZborovi {
//    public static void main(String[]args) {
//        Scanner scanner = new Scanner(System.in);
//        int n =  scanner.nextInt();
//        String [] zborovi = new String[n];
//        for(int i=0;i<n;i++){
//            zborovi[i]=scanner.next();
//        }
//        int parovi=0;
//        for(int i=0;i<n;i++){
//            for(int j=i+1;j<n;j++){
//                if(zborovi[i].charAt(0)==zborovi[j].charAt(0)){
//                    parovi++;
//                }
//            }
//        }
//        System.out.println(parovi);
//    }
//}