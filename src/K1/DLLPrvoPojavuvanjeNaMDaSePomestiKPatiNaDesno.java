//package K1;
//
//import java.util.Scanner;
//
///*
//Дадена е двострано поврзана листа од цели броеви.
// Дополнително, дадени се и уште еден цел број M и еден природен број k.
// Треба да се најде првото појавување на M во листата и тој број да се помести k места на десно.
//
//Влез: Во првиот ред од влезот е даден бројот на елементи во листата - N,
// па во следните следниот ред самите елементи одделени со празно место. На крај,
// во последните два реда дадени се целиот број M и природниот број k.
//
//Излез: На излез треба да се испечати листата пред и после промената.
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
//        return element.toString();
//    }
//}
//
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
//        while (tmp != null) {
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
//        while (current != null) {
//            tmp = current.pred;
//            current.pred = current.succ;
//            current.succ = tmp;
//            current = current.pred;
//        }
//
//        if (tmp != null && tmp.pred != null) {
//            first = tmp.pred;
//        }
//    }
//
//    public void rotiranjeKPatiNaDesno(int k) {
//        if (first == null || first == last || k == 0) {
//            return;
//        }
//        int size = getSize();
//        k = k % size;
//        if (k == 0) {
//            return;
//        }
//        last.succ = first;
//        first.pred = last;
//        DLLNode<E> current = first;
//        for (int i = 0; i < size - k - 1; i++) {
//            current = current.succ;
//        }
//        DLLNode<E> newFirst = current.succ;
//        current.succ = null;
//        newFirst.pred = null;
//        first = newFirst;
//        last = current;
//    }
//
//    public void rotiranjeKPatiNaLevo(int k) {
//        if (first == null || first == last || k == 0) {
//            return;
//        }
//        int size = getSize();
//        k = k % size;
//        if (k == 0) {
//            return;
//        }
//        last.succ = first;
//        first.pred = last;
//        DLLNode<E> newFirst = first;
//        for (int i = 0; i < k; i++) {
//            newFirst = newFirst.succ;
//        }
//        DLLNode<E> newLast = newFirst.pred;
//        newLast.succ = null;
//        newFirst.pred = null;
//        first = newFirst;
//        last = newLast;
//    }
//
//    public void pomestiMnaLevoKPati(E m, int k) {
//        DLLNode<E> target = find(m);
//        if (target == null || k == 0 || first == last) {
//            return;
//        }
//        int size = getSize();
//        k = k % size;
//        if (k == 0) return;
//        int index = 0;
//        DLLNode<E> curr = first;
//        while (curr != target) {
//            curr = curr.succ;
//            index++;
//        }
//        int newIndex = index - k;
//        if (newIndex < 0) {
//            newIndex = size + newIndex;
//        }
//        if (newIndex == index) {
//            return;
//        }
//        delete(target);
//        if (newIndex == 0) {
//            target.succ = first;
//            target.pred = null;
//            if (first != null) {
//                first.pred = target;
//            }
//            first = target;
//            if (last == null) {
//                last = target;
//            }
//        } else {
//            curr = first;
//            for (int i = 0; i < newIndex - 1; i++) {
//                curr = curr.succ;
//            }
//            target.succ = curr.succ;
//            target.pred = curr;
//            if (curr.succ != null) {
//                curr.succ.pred = target;
//            } else {
//                last = target;
//            }
//            curr.succ = target;
//        }
//    }
//
//    public void pomestiMnaDesnoKPati(E m, int k) {
//        DLLNode<E> target = find(m);
//        if (target == null || k == 0 || first == last) {
//            return;
//        }
//        int size = getSize();
//        k = k % size;
//        if (k == 0) return;
//        int index = 0;
//        DLLNode<E> curr = first;
//        while (curr != target) {
//            curr = curr.succ;
//            index++;
//        }
//        int newIndex = (index + k) % size;
//        if (newIndex == index) {
//            return;
//        }
//        delete(target);
//        if (newIndex == 0) {
//            target.succ = first;
//            target.pred = null;
//            if (first != null) {
//                first.pred = target;
//            }
//            first = target;
//            if (last == null) {
//                last = target;
//            }
//        } else {
//            curr = first;
//            for (int i = 0; i < newIndex - 1; i++) {
//                curr = curr.succ;
//            }
//            target.succ = curr.succ;
//            target.pred = curr;
//            if (curr.succ != null) {
//                curr.succ.pred = target;
//            } else {
//                last = target; // ако станал последен
//            }
//            curr.succ = target;
//        }
//    }
//}
//
//public class DLLPrvoPojavuvanjeNaMDaSePomestiKPatiNaDesno {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        DLL<Integer> lista = new DLL<Integer>();
//        int n = scanner.nextInt();
//        for (int i = 0; i < n; i++) {
//            int broj = scanner.nextInt();
//            lista.insertLast(broj);
//        }
//        int m = scanner.nextInt();
//        int k = scanner.nextInt();
//        System.out.println(lista);
//        DLLNode<Integer> posleden = lista.find(m);
//        if(posleden!=null){
//            for(int i=0;i<k;i++){
//                if(posleden==lista.getLast()){
//                    lista.deleteLast();
//                    lista.insertFirst(m);
//                    posleden = lista.getFirst();
//                }else{
//                    int temp = posleden.succ.element;
//                    posleden.succ.element=posleden.element;
//                    posleden.element=temp;
//                    posleden=posleden.succ;
//                }
//            }
//        }
//        System.out.println(lista);
//    }
//}
