//package K1;
//
//import java.util.Scanner;
///*
//// Дадена е двострано поврзана листа чии што јазли содржат по еден знак (буква). Листата треба да се подели на две резултантни листи, т.ш. во првата резултантна
//// листа ќе бидат бидат сместени самогласките од влезната листа, а во втората – согласките. Јазлите во резултантните листи се додаваат наизменично почнувајќи од почетокот и крајот на влезната листа (т.е. прво се разгледува првиот елемент од листата и се додава во соодветната резултантна листа, па последниот, па вториот итн...)
//// Во првиот ред од влезот се дадени буквите од кои се составени јазлите по редослед од влезната листа.
//// Во првиот ред од излезот треба да се испечатат јазлите по редослед од првата резултантна листа (т.е. самогласките),
//// во вториот ред од втората (т.е. согласките) .
//// Име на класа (за Java): PodeliSamoglaski
//// Делумно решение: Задачата се смета за делумно решена доколку се поминати 7 тест примери.
//// Забелешка: При реализација на задачите МОРА да се користат дадените структури, а не да користат помошни структури како низи или сл.
////
////         Input:
//// a b c d e f g h i j
//// Output:
//// a i e
//// j b c h d g f
//
////Јазлите во резултантните листи се додаваат наизменично почнувајќи од почетокот и крајот на влезната листа
//// (т.е. прво се разгледува првиот елемент од листата и се додава во соодветната резултантна листа, па последниот, па вториот итн...)
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
//    public int getSize() {
//        int listSize = 0;
//        DLLNode<E> tmp = first;
//        while (tmp != null) {
//            listSize++;
//            tmp = tmp.succ;
//        }
//        return listSize;
//    }
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
//public class DLLPodeliNaSamoglaskiISoglaski {
//
//    public static boolean samoglaska(char bukva){
//        if(bukva == 'a' ||bukva == 'e' ||bukva == 'i' ||bukva == 'o' ||bukva == 'u' ||bukva == 'A' ||bukva == 'E' ||bukva == 'I' ||bukva == 'O' ||bukva == 'U'){
//            return true;
//        }
//        return false;
//    }
//    public static void podeleniListi(DLL<String> lista) {
//        DLL<String> samoglaski = new DLL<String>();
//        DLL<String> soglaski = new DLL<String>();
//        DLLNode<String> prv  = lista.getFirst();
//        DLLNode<String> posleden = lista.getLast();
//        boolean flag=true;
//        for (int i = 0; i < lista.getSize(); i++) {
//            if(flag) {
//                if (samoglaska(prv.element.charAt(0))) {
//                    samoglaski.insertLast(prv.element);
//                } else {
//                    soglaski.insertLast(prv.element);
//                }
//                prv = prv.succ;
//                flag = false;
//            }else{
//                if (!samoglaska(posleden.element.charAt(0))) {
//                    soglaski.insertLast(posleden.element);
//                } else {
//                    samoglaski.insertLast(posleden.element);
//                }
//                flag = true;
//                posleden = posleden.pred;
//            }
//        }
//        System.out.println(samoglaski);
//        System.out.println(soglaski);
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        DLL<String> lista = new DLL<String>();
//        String line = sc.nextLine();
//        String[] bukvi = line.split(" ");
//        for (int i = 0; i < bukvi.length; i++) {
//            lista.insertLast(bukvi[i]);
//        }
//        podeleniListi(lista);
//    }
//}