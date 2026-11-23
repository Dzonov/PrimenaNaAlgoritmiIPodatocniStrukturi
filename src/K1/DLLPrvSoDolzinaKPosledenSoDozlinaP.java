//package K1;
//import java.util.Scanner;
///*
//Дадена е двојно поврзана листа од стрингтови.
//Потребно е да се најдат првиот стринг со должина P и последниот стринг со должина K
//и на нив да им се заменат местата.
//На влез прв е даден број N, големината на листата,
//па броевите P и K, па потоа се дадени елементите во листата.
//На излез прво се печатат бараните стрингтови, нивните позиции,
//а на крај се печати целата листа по промената.
//Пример:
//Влез:
//8 1 4
//Ba a baba abba banana al blablabla a
//Излез:
//а 1
//abba 3
//Ba<->abba<->baba<->a<->banana<->al<->blablabla<->a
//*/
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
//
//    public boolean palindrom(){
//
//        DLLNode<E> levo= this.getFirst();
//        DLLNode<E> desno= this.getLast();
//
//        while(levo!=desno && desno.succ!=levo){
//
//            if(!levo.element.equals(desno.element)){  //ako se razlicni
//                return false;  //vrati false, ne e palindrom
//            }
//
//            levo=levo.succ;
//            desno=desno.pred;
//
//        }
//
//        return true;
//
//    }
//
//    public void mirror1(){
//
//        DLLNode<E> previous=null;
//        DLLNode<E> current=this.first;
//        DLLNode<E> next=current.succ;
//        last=first;
//
//        while(current!=null){
//            current.succ=previous; //prevrtuvanje na node
//            current.pred=next;
//
//            //tri cekori za pridvizuvanje kon napred
//            previous=current;
//            current=next;
//
//            if(next!=null){
//                next=next.succ;
//            } else {
//                first=previous;
//
//            }
//
//        }
//    }
//}
//public class DLLPrvSoDolzinaKPosledenSoDozlinaP {
//    public static void main() {
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int p = scanner.nextInt();
//        int k = scanner.nextInt();
//        DLL<String> lista = new DLL<String>();
//        for(int i=0;i<n;i++){
//            String zbor = scanner.next();
//            lista.insertLast(zbor);
//        }
//        DLLNode<String> prv = lista.getFirst();
//        int brojacPrv=0;
//        for(int i=0;i<n;i++){
//            if(prv.element.length()==p){
//                break;
//            }
//            brojacPrv++;
//            prv=prv.succ;
//        }
//        DLLNode<String> posleden = lista.getLast();
//        int brojacPosleden=n-1;
//        for(int i=n;i>0;i--){
//            if(posleden.element.length()==k){
//                break;
//            }
//            brojacPosleden--;
//            posleden=posleden.pred;
//        }
//        System.out.println(lista);
//        System.out.println(prv + " " + brojacPrv);
//        System.out.println(posleden + " " + brojacPosleden);
//        String temp = prv.element;
//        prv.element=posleden.element;
//        posleden.element=temp;
//        System.out.println(lista);
//    }
//}
