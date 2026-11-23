//package K1;
//import java.util.Scanner;
////Дадени се две сортирани двојно поврзани листи, при што, првата листа е сортирана во растечки редослед,
////        а втората е сортирана во опаѓачки редослед. Да се конструира нова двојно поврзана
////        листа којашто ќе ги содржи сите елементи од двете листи и тоа во опаѓачки редослед.
////        При решавањето на задачата не смее да се користи сортирање на листи.
////
////
////        Влез: Во првиот ред дадени се два броја: M и N, коишто ги означуваат должините на листите, соодветно.
////        Во вториот ред се дадени М броеви - елементите на првата листа. Во третиот ред дадени се N броеви - елементите на втората листа.
////
////
////        Излез: Броевите од финалната листа. Во првиот ред се печатат по редослед од прв до последен, а во вториот обратно, од последен до прв.
////
////
////        Забелешка: Даден е основниот код од задачата со имплементиран влез и излез како и структурата која треба да се користи.
////        Дадена е и класата  DvojnaLista, во која  на точно означеното место ќе трeба да се имплементират бараните услови.
////        Вашиот код треба да биде напишан само таму, без измени во останатиот дел од кодот.
//class DLLNode<E> {
//    protected E element;
//    protected DLLNode<E> pred, succ;
//    public DLLNode(E elem, DLLNode<E> pred, DLLNode<E> succ) {
//        this.element = elem;
//        this.pred = pred;
//        this.succ = succ;
//    }
//
//    @Override
//    public String toString() {
//        return element.toString();
//    }
//}
//class DLL<E> {
//    private DLLNode<E> first, last;
//
//    public DLL() {
//        // Construct an empty SLL
//        this.first = null;
//        this.last = null;
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
//        } else
//            return null;
//    }
//
//    public E delete(DLLNode<E> node) {
//        if (node == first) {
//            return deleteFirst();
//        }
//        if (node == last) {
//            return deleteLast();
//        }
//        node.pred.succ = node.succ;
//        node.succ.pred = node.pred;
//        return node.element;
//
//    }
//
//    public DLLNode<E> find(E o) {
//        if (first != null) {
//            DLLNode<E> tmp = first;
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
//    public void deleteList() {
//        first = null;
//        last = null;
//    }
//
//    public int getSize() {
//        int listSize = 0;
//        DLLNode<E> tmp = first;
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
//            DLLNode<E> tmp = first;
//            ret += tmp.toString();
//            while (tmp.succ != null) {
//                tmp = tmp.succ;
//                ret += "<->" + tmp.toString();
//            }
//        } else
//            ret = "Prazna lista!!!";
//        return ret;
//    }
//
//    public String toStringR() {
//        String ret = new String();
//        if (last != null) {
//            DLLNode<E> tmp = last;
//            ret += tmp.toString();
//            while (tmp.pred != null) {
//                tmp = tmp.pred;
//                ret += "<->" + tmp.toString();
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
//    public void mirror() {
//
//        DLLNode<E> tmp = null;
//        DLLNode<E> current = first;
//        last = first;
//        while(current!=null) {
//            tmp = current.pred;
//            current.pred = current.succ;
//            current.succ = tmp;
//            current = current.pred;
//        }
//
//        if(tmp!=null && tmp.pred!=null) {
//            first=tmp.pred;
//        }
//    }
//}
//
//
//public class DLLDveListiDaSePretvoratVoEdnaOpagjacka {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        DLL<Integer> rastecka = new DLL<>();
//        DLL<Integer> opagacka = new DLL<>();
//        int n = scanner.nextInt();
//        int m = scanner.nextInt();
//        for(int i=0;i<n;i++){
//            rastecka.insertLast(scanner.nextInt());
//        }
//        for(int i=0;i<m;i++){
//            opagacka.insertLast(scanner.nextInt());
//        }
//        DLLNode<Integer> najgolemOdRastecka= rastecka.getLast();
//        DLLNode<Integer> najgolemOdOpagacka= opagacka.getFirst();
//
//        DLL<Integer> lista = new DLL<>();
//
//        while (najgolemOdOpagacka!=null && najgolemOdRastecka!=null){
//            if(najgolemOdOpagacka.element>=najgolemOdRastecka.element){
//                lista.insertLast(najgolemOdOpagacka.element);
//                najgolemOdOpagacka=najgolemOdOpagacka.succ;
//            }else {
//                lista.insertLast(najgolemOdRastecka.element);
//                najgolemOdRastecka = najgolemOdRastecka.pred;
//            }
//        }
//        DLLNode<Integer> najmalOdRastecka= rastecka.getFirst();
//        DLLNode<Integer> najmalOdOpagacka= opagacka.getLast();
//        if(najmalOdOpagacka.element>najmalOdRastecka.element){
//            lista.insertLast(najmalOdRastecka.element);
//        }else{
//            lista.insertLast(najmalOdOpagacka.element);
//        }
//        System.out.println(lista);
//    }
//}
