//package K1;
//import java.util.Scanner;
///*
//Наредени луѓе со број на барања, им се извршува едно барање и се враќаат назад во редот.
//Печати редослед на завршување на луѓето.
//
//Input
//5
//Nenad 3
//Slave 1
//Martin 2
//Ana 1
//Igor 2
//
//Output
//Slave
//Ana
//Martin
//Igor
//Nenad
//*/
//
//import java.util.NoSuchElementException;
//
//class ArrayQueue<E> {
//    // Redicata e pretstavena na sledniot nacin:
//    // length go sodrzi brojot na elementi.
//    // Ako length > 0, togash elementite na redicata se zachuvani vo elems[front...rear-1]
//    // Ako rear > front, togash vo  elems[front...maxlength-1] i elems[0...rear-1]
//    E[] elems;
//    int length, front, rear;
//
//    // Konstruktor ...
//
//    @SuppressWarnings("unchecked")
//    public ArrayQueue(int maxlength) {
//        elems = (E[]) new Object[maxlength];
//        clear();
//    }
//
//    public boolean isEmpty() {
//        // Vrakja true ako i samo ako redicata e prazena.
//        return (length == 0);
//    }
//
//    public int size() {
//        // Ja vrakja dolzinata na redicata.
//        return length;
//    }
//
//    public E peek() {
//        // Go vrakja elementot na vrvot t.e. pocetokot od redicata.
//        if (length > 0)
//            return elems[front];
//        else
//            throw new NoSuchElementException();
//    }
//
//    public void clear() {
//        // Ja prazni redicata.
//        length = 0;
//        front = rear = 0;  // arbitrary
//    }
//
//    public void enqueue(E x) {
//        // Go dodava x na kraj od redicata.
//        if (length == elems.length)
//            throw new NoSuchElementException();
//        elems[rear++] = x;
//        if (rear == elems.length) rear = 0;
//        length++;
//    }
//
//    public E dequeue() {
//        // Go otstranuva i vrakja pochetniot element na redicata.
//        if (length > 0) {
//            E frontmost = elems[front];
//            elems[front++] = null;
//            if (front == elems.length) front = 0;
//            length--;
//            return frontmost;
//        } else
//            throw new NoSuchElementException();
//    }
//}
//
//
//class SLLNode<E> {
//    protected E element;
//    protected SLLNode<E> succ;
//
//    public SLLNode(E elem, SLLNode<E> succ) {
//        this.element = elem;
//        this.succ = succ;
//    }
//
//    @Override
//    public String toString() {
//        return element.toString();
//    }
//}
//class Covek{
//    String ime;
//    int brBaranja;
//    Covek(String ime, int brBaranja){
//        this.ime=ime;
//        this.brBaranja=brBaranja;
//    }
//}
//public class ArrayQueueBaranja {
//    public static void main(String[]args){
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        ArrayQueue<Covek> coveci = new ArrayQueue<Covek>(n);
//        for(int i=0;i<n;i++){
//            String ime=scanner.next();
//            int brBaranja=scanner.nextInt();
//            Covek covek = new Covek(ime,brBaranja);
//            coveci.enqueue(covek);
//        }
//        while(!coveci.isEmpty()){
//            Covek covek= coveci.peek();
//            if(covek.brBaranja-1>0){
//                covek.brBaranja-=1;
//                Covek zaNaKraj=coveci.dequeue();
//                coveci.enqueue(zaNaKraj);
//            }else{
//                covek.brBaranja-=1;
//                coveci.dequeue();
//                System.out.println(covek.ime);
//            }
//        }
//    }
//}
