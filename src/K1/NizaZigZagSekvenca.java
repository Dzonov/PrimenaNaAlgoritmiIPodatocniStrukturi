//package K1;
//import java.util.Scanner;
///*
//Секвенца од броеви се смета за цик цак секвенца ако броевите во секвенцата се наизменично
//позитивни и негативни т.е. за секој пар од последователни броеви важи дека едниот е позитивен,
//а другиот е негативен.
//
//На пример -1 2 -9 8 -4 е цик цак секвенца, но -1 9 7 -3 8 -3 не е, затоа што 9 и 7 се соседни
//броеви, но и двата се позитивни. Цик цак секвенцата може да почне или со позитивен или со негативен број.
//Секвенца од само еден ненулти број се смета како цик цак секвенца. За дадена низа од броеви да се напише
//алгоритам кој ќе ја врати должината на најдолгата подниза која претставува цик цак секвенца.
//
//На излез треба да се испечати должината на најдолгата подниза која
//е цик цак секвенца од оригиналната низа.
//
// */
//public class NizaZigZagSekvenca {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String line = scanner.nextLine();
//        String[] brojki = line.split(" ");
//        int[] niza = new int[brojki.length];
//        for (int i = 0; i < brojki.length; i++) {
//            niza[i] = Integer.parseInt(brojki[i]);
//        }
//        int counter = 1;
//        int maxCounter = 1;
//        for (int i = 1; i < brojki.length; i++) {
//            if((niza[i]>0 && niza[i-1]<0) || (niza[i]<0 && niza[i-1]>0)){
//                counter++;
//                if(counter>maxCounter){
//                    maxCounter=counter;
//                }
//            }else{
//                if (niza[i] != 0) {
//                    counter = 1;
//                } else {
//                    counter = 0;
//                }
//            }
//        }
//        System.out.println(maxCounter);
//    }
//}
//
