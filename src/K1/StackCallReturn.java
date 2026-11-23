//package K1;
///*
//Stack
//
//Најди ја фунцкијата што повикува највеќе фунцкии во неа.
//Секоја фунцкија има Call x - x е името на фунцкијата - и Return.
//
//Input
//12
//Call a
//    Call b
//        Call c
//        Return
//        Call d
//        Return
//        Call e
//        Return
//    Return
//Call f
//Return
//Return
//
//Output
//b 3
//
//Објаснување: во b се повикани c d и e
//*/
//
//import java.util.Scanner;
//import java.util.NoSuchElementException;
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
//
//interface Stack<E> {
//    // Elementi na stekot se objekti od proizvolen tip.
//    // Metodi za pristap:
//
//    public boolean isEmpty();
//    // Vrakja true ako i samo ako stekot e prazen.
//
//    public E peek();
//    // Go vrakja elementot na vrvot od stekot.
//
//    // Metodi za transformacija:
//    public void clear();
//    // Go prazni stekot.
//
//    public void push(E x);
//    // Go dodava x na vrvot na stekot.
//
//    public E pop();
//    // Go otstranuva i vrakja elementot shto e na vrvot na stekot.
//
//    public int size();
//    // Ja vrakja dolzinata na stekot.
//}
//
//class LinkedStack<E> implements Stack<E> {
//    // top e link do prviot jazol ednostrano-povrzanata lista koja sodrzi gi elementite na stekot .
//    private SLLNode<E> top;
//    int size;
//
//    public LinkedStack() {
//        // Konstrukcija na nov, prazen stek.
//        top = null;
//        size = 0;
//    }
//
//    public String toString() {
//        SLLNode<E> current = top;
//        StringBuilder s = new StringBuilder();
//        while (current != null) {
//            s.append(current.element);
//            s.append(" ");
//            current = current.succ;
//        }
//        return s.toString();
//    }
//
//    public boolean isEmpty() {
//        // Vrakja true ako i samo ako stekot e prazen.
//        return (top == null);
//    }
//
//    public void clear() {
//        // Go prazni stekot.
//        top = null;
//        size = 0;
//    }
//
//    public E peek() {
//        // Go vrakja elementot na vrvot od stekot.
//        if (top == null)
//            throw new NoSuchElementException();
//        return top.element;
//    }
//
//    public void push(E x) {
//        // Go dodava x na vrvot na stekot.
//        top = new SLLNode<E>(x, top);
//        size++;
//    }
//
//    public int size() {
//        // Ja vrakja dolzinata na stekot.
//        return size;
//    }
//
//    public E pop() {
//        // Go otstranuva i vrakja elementot shto e na vrvot na stekot.
//        if (top == null)
//            throw new NoSuchElementException();
//        E topElem = top.element;
//        size--;
//        top = top.succ;
//        return topElem;
//    }
//
//}
//
//public class StackCallReturn {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//
//        int n = input.nextInt();
//        LinkedStack<String> iminja = new LinkedStack<>();
//        LinkedStack<Integer> brojaci = new LinkedStack<>();
//
//        String maxIme = "";
//        int maxBroj = 0;
//        for (int i = 0; i < n; i++) {
//            String komanda = input.next();
//            if (komanda.equals("Call")) {
//                String ime = input.next();
//                if (!brojaci.isEmpty()) {
//                    int b = brojaci.pop();
//                    brojaci.push(b + 1);
//                }
//                iminja.push(ime);
//                brojaci.push(0);
//            } else {
//                String ime = iminja.pop();
//                int broj = brojaci.pop();
//
//                if (broj > maxBroj) {
//                    maxBroj = broj;
//                    maxIme = ime;
//                }
//            }
//        }
//        System.out.println(maxIme + " " + maxBroj);
//    }
//}