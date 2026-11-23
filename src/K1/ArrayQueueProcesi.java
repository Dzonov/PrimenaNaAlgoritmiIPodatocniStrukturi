//package K1;
//import java.io.*;
//import java.util.*;
//import java.util.Queue;
//import java.util.NoSuchElementException;
///*
//Дадени се N процеси, каде секој процес е претставен со име и време потребно за негово извршување.
// Процесите се обработуваат според принципот на редица, по редоследот на нивното внесување.
//  Процесорот во секој круг обработува еден процес најмногу T временски единици.
//   Доколку процесот не е завршен, преостанатото време се намалува за T, а процесот
//   се додава на крајот од редицата. Доколку процесот е завршен, неговото име се печати.
//
//Ваша задача е да го определите редоследот по кој завршуваат процесите.
//
//Влез: Прво се внесува бројотна процеси N и временски единици Т кои се обработуваат во една итерација.
//
//3 2
//Process-A 3
//Process-B 1
//Process-C 4
//Излез: Редниот број на целосно завршен процес и името на процесот
//
//1. Process-B
//2. Process-A
//3. Process-C
//*/
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
//class Proces{
//    String ime;
//    int vreme;
//    public Proces(String ime, int vreme){
//        this.ime=ime;
//        this.vreme=vreme;
//    }
//}
//public class ArrayQueueProcesi {
//    public static void main(String[] args){
//        Scanner scanner= new Scanner(System.in);
//        int n = scanner.nextInt();
//        int t = scanner.nextInt();
//        ArrayQueue<Proces> procesi = new ArrayQueue<Proces>(n);
//        for(int i=0;i<n;i++){
//            String ime= scanner.next();
//            int vreme=scanner.nextInt();
//            Proces proces = new Proces(ime,vreme);
//            procesi.enqueue(proces);
//        }
//        int i=1;
//        while(!procesi.isEmpty()){
//            Proces proces = procesi.dequeue();
//            if(proces.vreme-t>0){
//                procesi.enqueue(proces);
//                proces.vreme-=t;
//            }else{
//                System.out.println(i + ". " + proces.ime);
//                i++;
//            }
//        }
//    }
//}