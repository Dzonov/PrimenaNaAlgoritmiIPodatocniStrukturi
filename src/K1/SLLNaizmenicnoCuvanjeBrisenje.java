//package K1;
//import java.util.Scanner;
///*
//SLL
//se vnesuvaat br elementi
//pa potoa
//se vnesuva m i n
//pa naizmenicno se cuvaat n elementi, pa m se brisat i taka do krug se dodeka jazol!=null
//brElementi=10
//1 2 3 4 5 6 7 8 9 10
//m=2 n=2
//1 2 se cuvaat, pa 3 i 4 se brisat, pa 5 i 6 se cuvaat pa 7 i 8 se brisat pa 9 i 10 se cuvaat
//znaci na kraj ke bide 1 2 5 6 9 10
//*/
// class SLLNode<E> {
//    protected E element;
//    protected SLLNode<E> succ;
//
//    public SLLNode(E elem, SLLNode<E> succ) {
//        this.element = elem;
//        this.succ = succ;
//    }
//}
//
//
// class SLL<E> {
//    private SLLNode<E> first;
//
//    public SLL() {
//        // Construct an empty SLL
//        this.first = null;
//    }
//
//    public void deleteList() {
//        first = null;
//    }
//
//    public int size() {
//        int listSize = 0;
//        SLLNode<E> tmp = first;
//        while(tmp != null) {
//            listSize++;
//            tmp = tmp.succ;
//        }
//        return listSize;
//    }
//
//    @Override
//    public String toString() {
//        String ret = new String();
//        if (first != null) {
//            SLLNode<E> tmp = first;
//            ret += tmp.element;
//            while (tmp.succ != null) {
//                tmp = tmp.succ;
//                ret += "->" + tmp.element;
//            }
//        } else
//            ret = "Prazna lista!!!";
//        return ret;
//    }
//
//    public void insertFirst(E o) {
//        SLLNode<E> ins = new SLLNode<E>(o, null);
//        ins.succ = first;
//        //SLLNode<E> ins = new SLLNode<E>(o, first);
//        first = ins;
//    }
//
//    public void insertAfter(E o, SLLNode<E> node) {
//        if (node != null) {
//            SLLNode<E> ins = new SLLNode<E>(o, node.succ);
//            node.succ = ins;
//        } else {
//            System.out.println("Dadenot jazol e null");
//        }
//    }
//    public void insertBefore(E o, SLLNode<E> before) {
//
//        if (first != null) {
//            SLLNode<E> tmp = first;
//            if(first==before){
//                this.insertFirst(o);
//                return;
//            }
//            //ako first!=before
//            while (tmp.succ != before && tmp.succ!=null)
//                tmp = tmp.succ;
//            if (tmp.succ == before) {
//                tmp.succ = new SLLNode<E>(o, before);;
//            } else {
//                System.out.println("Elementot ne postoi vo listata");
//            }
//        } else {
//            System.out.println("Listata e prazna");
//        }
//    }
//
//    public void insertLast(E o) {
//        if (first != null) {
//            SLLNode<E> tmp = first;
//            while (tmp.succ != null)
//                tmp = tmp.succ;
//            tmp.succ = new SLLNode<E>(o, null);
//        } else {
//            insertFirst(o);
//        }
//    }
//
//    public E deleteFirst() {
//        if (first != null) {
//            SLLNode<E> tmp = first;
//            first = first.succ;
//            return tmp.element;
//        } else {
//            System.out.println("Listata e prazna");
//            return null;
//        }
//    }
//
//    public E delete(SLLNode<E> node) {
//        if (first != null) {
//            SLLNode<E> tmp = first;
//            if(first == node) {
//                return this.deleteFirst();
//            }
//            while (tmp.succ != node && tmp.succ.succ != null)
//                tmp = tmp.succ;
//            if (tmp.succ == node) {
//                tmp.succ = tmp.succ.succ;
//                return node.element;
//            } else {
//                System.out.println("Elementot ne postoi vo listata");
//                return null;
//            }
//        } else {
//            System.out.println("Listata e prazna");
//            return null;
//        }
//
//    }
//
//    public SLLNode<E> getFirst() {
//        return first;
//    }
//
//    public SLLNode<E> find(E o) {
//        if (first != null) {
//            SLLNode<E> tmp = first;
//            while (!tmp.element.equals(o) && tmp.succ != null)
//                tmp = tmp.succ;
//            if (tmp.element.equals(o)) {
//                return tmp;
//            } else {
//                System.out.println("Elementot ne postoi vo listata");
//            }
//        } else {
//            System.out.println("Listata e prazna");
//        }
//        return null;
//    }
//
//    public void merge (SLL<E> in){
//        if (first != null) {
//            SLLNode<E> tmp = first;
//            while(tmp.succ != null)
//                tmp = tmp.succ;
//            tmp.succ = in.getFirst();
//        }
//        else{
//            first = in.getFirst();
//        }
//    }
//
//    public void mirror() {
//        if (first != null) {
//            //m=nextsucc, p=tmp,q=next
//            SLLNode<E> tmp = first;
//            SLLNode<E> newsucc = null;
//            SLLNode<E> next;
//
//            while(tmp != null){
//                next = tmp.succ;
//                tmp.succ = newsucc;
//                newsucc = tmp;
//                tmp = next;
//            }
//            first = newsucc;
//        }
//    }
//}
//
//public class SLLNaizmenicnoCuvanjeBrisenje {
//    public static void prvoCuvanjePaBrisenje(SLL<Integer> lista, int m, int n){
//        int countM = 0, countN = 0;
//        SLLNode<Integer> prv = lista.getFirst();
//        while (prv != null) {
//            if (countM < m) {
//                countM++;
//                countN = 0;
//            } else {
//                countN++;
//                lista.delete(prv);
//            }
//            if (n == countN) {
//                countM = 0;
//            }
//            prv = prv.succ;
//        }
//    }
//    public static void prvoBrisenjePaCuvanje(SLL<Integer> lista, int m, int n){
//        int countM = 0, countN = 0;
//        SLLNode<Integer> prv = lista.getFirst();
//        while(prv!=null){
//            if(countM<m){
//                lista.delete(prv);
//                countM++;
//                countN=0;
//            }else{
//                countN++;
//            }
//            if(n==countN){
//                countM=0;
//            }
//            prv=prv.succ;
//        }
//    }
//    /*
//    1 2 3 4 5 6
//    2 2
//    cauntM = 0 , caunt n=0
//    ako kauntm(0)<2
//        kauntm++ (1)
//        kauntn=0;
//    else
//    kauntn++ (0)
//    vo voa slucaj ne brisime
//    ako n(2) == count n(1)
//    count m=0
//    -----------------------------------
//    cauntM = 1 , caunt n=0
//    ako kauntm(1)<2
//        kauntm++ (2)
//        kauntn=0;
//    else
//    kauntn++ (0)
//    vo voa slucaj ne brisime
//    ako n(2) == count n(1)
//    count m=0
//    -----------------------------------
//    cauntM = 2 , caunt n=0
//    ako kauntm(2)<2
//        kauntm++ (2)
//        kauntn=0;
//    else
//    kauntn++ (1)
//    go brisime 3
//    ako n(2) == count n(1)
//    count m=0
//    -----------------------------------
//      cauntM = 2 , caunt n=0
//    ako kauntm(2)<2
//        kauntm++ (2)
//        kauntn=0;
//    else
//    kauntn++ (2)
//    go brisime 4
//    ako n(2) == count n(2)
//    count m=0
//    */
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int brElementi = scanner.nextInt();
//        SLL<Integer> lista = new SLL<Integer>();
//        for (int i = 0; i < brElementi; i++) {
//            lista.insertLast(scanner.nextInt());
//        }
//        int m = scanner.nextInt();
//        int n = scanner.nextInt();
//        System.out.println("Prvobitna sostojba:");
//        System.out.println(lista);
//        prvoCuvanjePaBrisenje(lista, m, n);
//        System.out.println("Cuvanje pa brisanje:");
//        System.out.println(lista);
////        System.out.println("Brisanje pa cuvanje:");
////        prvoBrisenjePaCuvanje(lista, m, n);
////        System.out.println(lista);
//    }
//}
