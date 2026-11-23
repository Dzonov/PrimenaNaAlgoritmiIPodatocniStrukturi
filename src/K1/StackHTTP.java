//package K1;
//import java.util.Scanner;
///*
//текст организиран во повеќе делови. Да се одреди дали текстот е валиден ако секој дел мора
//да почнува со ознака #Heading1, #Heading2, ..., #Heading6 или #Body, и мора да завршува со
//Heading1#, Heading2#, ..., Body# (забелешка: затворачките ознаки соодветствуваат на почетните).
//Почетната и соодветната ознака за истиот дел мора да бидат исти. Ознаките може да бидат вгнездени
//и меѓу нив може да има содржина. Ознаките за почеток на наслов (#HeadingN) мора да бидат подредени
//од најмал број до најголем (не може #Heading1 да се појави по (незатворен) #Heading2), во рамки на
//#Body. Во текстот може да има цитати кои почнуваат со #Quote и се затвораат со Quote# и можат да
//бидат во рамки на било кој Heading или Body. Да се врати true ако дадениот текст е валиден,
//а false ако не е.
//*/
//
//import java.util.NoSuchElementException;
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
//
//
//
//public class StackHTTP {
//    public static void main(String[] args) {
//        Scanner scanner=new Scanner(System.in);
//        LinkedStack<String> stack=new LinkedStack<>();
//        String line=scanner.nextLine();
//        boolean isValid = true;
//
//        while(!line.equals("KRAJ")){
//            char posledna=line.charAt(line.length()-1);
//            char prv=line.charAt(0);
//
//            if(prv == '#'){
//                if(stack.isEmpty()){
//                    if(line.equals("#Quote")) {
//                        isValid = false;
//                    } else {
//                        stack.push(line);
//                    }
//                } else {
//                    String tmp = stack.peek();
//                    if(tmp.startsWith("#Heading")) {
//                        char p = tmp.charAt(tmp.length()-1);
//                        if(posledna>p) {
//                            stack.push(line);
//                        } else {
//                            isValid = false;
//                        }
//                    } else {
//                        isValid = false;
//                    }
//                }
//            }else if(posledna == '#'){
//                String temp= stack.peek().substring(1);
//                if(temp.equals(line.substring(0, line.length()-1))) {
//                    stack.pop();
//                }else{
//                    isValid=false;
//                }
//            }
//            line=scanner.nextLine();
//        }
//        if(isValid && stack.isEmpty()){
//            System.out.println("true");
//        }else{
//            System.out.println("false");
//        }
//        scanner.close();
//    }
//}