//package K1;
//
//import java.util.Scanner;
//
///*
//Листа од броеви
//image_132e9a.jpg
//
//Дадена е двострано поврzana листа од цели броеви, како и уште еден цел број M.
// Да се провери дали сегментот од листата помеѓу првото и последното појавување на бројот M формира палиндром.
//
//Пример влез:
//
//7
//
//1 2 3 4 3 2 6
//
//2
//
//Пример излез:
//
//Palindrom!
//
//(сегментот е 2 3 4 3 2 што е палиндром)
//
//Пример влез:
//
//3
//
//1 2 3
//
//3
//
//Пример излез:
//
//Palindrom!
//
//(сегментот е 3, што само по себе е палиндром)
//*/
//class DLLNode<E> {
//    protected E element;
//    protected DLLNode<E> pred, succ;
//
//    public DLLNode(E elem, DLLNode<E> pred, DLLNode<E> succ) {
//        this.element = elem;
//        this.pred = pred;
//        this.succ = succ;
//    }
//
//    @Override
//    public String toString() {
//        return "<-" + element.toString() + "->";
//    }
//}
//
//class DLL<E> {
//    private DLLNode<E> first, last;
//
//    public DLL() {
//        // Construct an empty SLL
//        this.first = null;
//        this.last = null;
//    }
//
//    public void deleteList() {
//        first = null;
//        last = null;
//    }
//
//    public int length() {
//        int ret;
//        if (first != null) {
//            DLLNode<E> tmp = first;
//            ret = 1;
//            while (tmp.succ != null) {
//                tmp = tmp.succ;
//                ret++;
//            }
//            return ret;
//        } else
//            return 0;
//
//    }
//
//    public void insertFirst(E o) {
//        DLLNode<E> ins = new DLLNode<E>(o, null, first);
//        if (first == null)
//            last = ins;
//        else
//            first.pred = ins;
//        first = ins;
//    }
//
//    public void insertLast(E o) {
//        if (first == null)
//            insertFirst(o);
//        else {
//            DLLNode<E> ins = new DLLNode<E>(o, last, null);
//            last.succ = ins;
//            last = ins;
//        }
//    }
//
//    public void insertAfter(E o, DLLNode<E> after) {
//        if (after == last) {
//            insertLast(o);
//            return;
//        }
//        DLLNode<E> ins = new DLLNode<E>(o, after, after.succ);
//        after.succ.pred = ins;
//        after.succ = ins;
//    }
//
//    public void insertBefore(E o, DLLNode<E> before) {
//        if (before == first) {
//            insertFirst(o);
//            return;
//        }
//        DLLNode<E> ins = new DLLNode<E>(o, before.pred, before);
//        before.pred.succ = ins;
//        before.pred = ins;
//    }
//
//    public E deleteFirst() {
//        if (first != null) {
//            DLLNode<E> tmp = first;
//            first = first.succ;
//            if (first != null) first.pred = null;
//            if (first == null)
//                last = null;
//            return tmp.element;
//        } else
//            return null;
//    }
//
//    public E deleteLast() {
//        if (first != null) {
//            if (first.succ == null)
//                return deleteFirst();
//            else {
//                DLLNode<E> tmp = last;
//                last = last.pred;
//                last.succ = null;
//                return tmp.element;
//            }
//        }
//        // else throw Exception
//        return null;
//    }
//
//    @Override
//    public String toString() {
//        String ret = new String();
//        if (first != null) {
//            DLLNode<E> tmp = first;
//            ret += tmp + "<->";
//            while (tmp.succ != null) {
//                tmp = tmp.succ;
//                ret += tmp + "<->";
//            }
//        } else
//            ret = "Prazna lista!!!";
//        return ret;
//    }
//
//    public DLLNode<E> getFirst() {
//        return first;
//    }
//
//    public DLLNode<E> getLast() {
//
//        return last;
//    }
//
//}
//
//public class DLLDaliEPalindromIzmegjuPrvoIPoslednoPojavuvanjeNaM {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        DLL<Integer> lista = new DLL<>();
//        for (int i = 0; i < n; i++) {
//            lista.insertLast(scanner.nextInt());
//        }
//        int m = scanner.nextInt();
//        boolean isValid = true;
//        DLLNode<Integer> prv = lista.getFirst();
//        DLLNode<Integer> posleden = lista.getLast();
//        while (prv != null) {
//            if (prv.element.equals(m)) {
//                break;
//            }
//            prv = prv.succ;
//        }
//        while (posleden != null) {
//            if (posleden.element.equals(m)) {
//                break;
//            }
//            posleden = posleden.pred;
//        }
//        if (prv == null && posleden == null) {
//            System.out.println("M ne e pronajden");
//            return;
//        }
//        if (prv == posleden) {
//            isValid = true;
//        }else{
//            while(prv!=posleden){
//                if(!(prv.element.equals(posleden.element))){
//                    isValid=false;
//                    break;
//                }
//                prv=prv.succ;
//                posleden=posleden.pred;
//            }
//        }
//        if(isValid){
//            System.out.println("Palindrom");
//        }else{
//            System.out.println("Ne e palindrom");
//        }
//    }
//}