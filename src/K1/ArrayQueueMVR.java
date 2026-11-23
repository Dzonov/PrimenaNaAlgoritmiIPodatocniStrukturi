//package K1;
//import java.util.NoSuchElementException;
//import java.util.Scanner;
///*
//Луѓето доаѓаат наутро во МВР за да извадат еден или повеќе документи.
//
//Документите може да бидат:
//1. Лична карта
//2. Пасош
//3. Возачка дозвола
//
//Кога се отвора шалтерот прво се услужуваат луѓето кои чекаат за лична карта,
//па потоа оние за пасош и на крај оние за возачка дозвола.
//Секој човек кога ќе дојде си застанува во редицата за соодветната исправа
//која ја вади (т.е. или во редицата за лични карти или во редицата за
//пасоши или во редицата за возачки дозволи). Доколку еден човек има
//повеќе документи за вадење прво вади лична карта, па пасош и на крај
//возачка. Така ако еден човек треба да вади и лична карта и возачка
//дозвола прво застанува во редицата за лични карти и откако ќе заврши
//таму оди на крајот на редицата за возачки дозволи.
//
//Влез: Првиот ред означува колку луѓе вкупно дошле во МВР. Потоа за секој човек
//се внесуваат четири реда, во првиот е името и презимето на човекот, а во останатите
//три реда се кажува кој документ соодветно (лична карта, пасош и возачка) треба да се
//земе, притоа 1 значи дека треба да се земе тој документ, 0 значи дека не треба да се земе.
//
//На пример:
//
//Aleksandar Aleksandrovski
//1
//0
//1
//означува дека Александар Александровски ќе вади и лична карта и возачка дозвола, но нема да вади пасош.
//Излез: Ги печати имињата на луѓето по редоследот по кој завршуваат со вадење на документи.
// */
//interface Queue<E> {
//    // Elementi na redicata se objekti od proizvolen tip.
//    // Metodi za pristap:
//    public boolean isEmpty();
//    // Vrakja true ako i samo ako redicata e prazena.
//
//    public int size();
//    // Ja vrakja dolzinata na redicata.
//
//    public E peek();
//    // Go vrakja elementot na vrvot t.e. pocetokot od redicata.
//
//    // Metodi za transformacija:
//
//    public void clear();
//    // Ja prazni redicata.
//
//    public void enqueue(E x);
//    // Go dodava x na kraj od redicata.
//
//    public E dequeue();
//    // Go otstranuva i vrakja pochetniot element na redicata.
//}
///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//
///**
// * @author Aleksandar
// */
//// Java Program to check if a queue
//// of first n natural number can
//// be sorted using a stack
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
//class Covek{
//    String ime;
//    int licna;
//    int pasos;
//    int vozacka;
//    Covek(String ime, int licna, int pasos, int vozacka){
//        this.ime=ime;
//        this.licna=licna;
//        this.pasos=pasos;
//        this.vozacka=vozacka;
//    }
//}
//public class ArrayQueueMVR {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        ArrayQueue<Covek> redicaZaLicna = new ArrayQueue<>(n);
//        ArrayQueue<Covek> redicaZaPasos = new ArrayQueue<>(n);
//        ArrayQueue<Covek> redicaZaVozacka = new ArrayQueue<>(n);
//        for(int i=0;i<n;i++){
//            String ime = scanner.next();
//            int licna = scanner.nextInt();
//            int pasos = scanner.nextInt();
//            int vozacka = scanner.nextInt();
//            Covek covek = new Covek(ime,licna,pasos,vozacka);
//            if(covek.licna==1){
//                redicaZaLicna.enqueue(covek);
//            }else if(covek.pasos==1){
//                redicaZaPasos.enqueue(covek);
//            }else if(covek.vozacka==1){
//                redicaZaVozacka.enqueue(covek);
//            }
//        }
//        while(!redicaZaLicna.isEmpty()){
//            Covek covek = redicaZaLicna.dequeue();
//            if(covek.pasos==1){
//                redicaZaPasos.enqueue(covek);
//            }else if(covek.vozacka==1){
//                redicaZaVozacka.enqueue(covek);
//            }else {
//                System.out.println(covek.ime);
//            }
//        }
//        while(!redicaZaPasos.isEmpty()){
//            Covek covek = redicaZaPasos.dequeue();
//            if(covek.vozacka==1){
//                redicaZaVozacka.enqueue(covek);
//            }else {
//                System.out.println(covek.ime);
//            }
//        }
//        while(!redicaZaVozacka.isEmpty()){
//            Covek covek = redicaZaVozacka.dequeue();
//            System.out.println(covek.ime);
//        }
//    }
//}