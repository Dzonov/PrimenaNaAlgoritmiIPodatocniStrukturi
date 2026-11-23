//package K1;
//import java.util.NoSuchElementException;
//import java.util.Scanner;
//
//
//class ArrayStack<E> implements Stack<E> {
//    private E[] elems; //elems[0...depth-1] se negovite elementi.
//    private int depth; //depth e dlabochinata na stekot
//
//    @SuppressWarnings("unchecked")
//    public ArrayStack(int maxDepth) {
//        // Konstrukcija na nov, prazen stek.
//        elems = (E[]) new Object[maxDepth];
//        depth = 0;
//    }
//
//    public boolean isEmpty() {
//        // Vrakja true ako i samo ako stekot e prazen.
//        return (depth == 0);
//    }
//
//    public E peek() {
//        // Go vrakja elementot na vrvot od stekot.
//        if (depth == 0)
//            throw new NoSuchElementException();
//        return elems[depth - 1];
//    }
//
//    public void clear() {
//        // Go prazni stekot.
//        for (int i = 0; i < depth; i++) elems[i] = null;
//        depth = 0;
//    }
//
//    public void push(E x) {
//        // Go dodava x na vrvot na stekot.
//        elems[depth++] = x;
//    }
//
//    public int size() {
//        // Ja vrakja dolzinata na stack-ot.
//        return depth;
//    }
//
//    public E pop() {
//        // Go otstranuva i vrakja elementot shto e na vrvot na stekot.
//        if (depth == 0)
//            throw new NoSuchElementException();
//        E topmost = elems[--depth];
//        elems[depth] = null;
//        return topmost;
//    }
//}
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
// class LinkedStack<E> implements Stack<E> {
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
//public class StackPostfix {
//    public static int postfix(String [] izraz){
//        LinkedStack<Integer> stek = new LinkedStack<>();
//        for(int i=0;i<izraz.length;i++){
//            if(izraz[i].equals("+")){
//                int vtor= stek.pop();
//                int prv= stek.pop();
//                stek.push(prv+vtor);
//            }else if(izraz[i].equals("-")){
//                int vtor= stek.pop();
//                int prv= stek.pop();
//                stek.push(prv-vtor);
//            }else if(izraz[i].equals("*")){
//                int vtor= stek.pop();
//                int prv= stek.pop();
//                stek.push(prv*vtor);
//            }else if(izraz[i].equals("/")){
//                int vtor= stek.pop();
//                int prv= stek.pop();
//                stek.push(prv/vtor);
//            }else{
//                stek.push(Integer.parseInt(izraz[i]));
//            }
//        }
//        return stek.pop();
//    }
//    public static void main(String[]args) {
//        Scanner scanner = new Scanner(System.in);
//        LinkedStack<String> stek = new LinkedStack<>();
//        String expression = scanner.nextLine();
//        String[] parts = expression.split("\\s+");
//        System.out.println(postfix(parts));
//    }
//}
