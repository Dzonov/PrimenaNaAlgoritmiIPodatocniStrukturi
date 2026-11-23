//package K1;
/*
Библиотека е посетена од студентите со цел да изнајмат еден или повеќе типови на книги.
 Дадена книга може да припаѓа на една од трите категории: Наука, Научна фантастика или Историја.
  Кога библиотеката ќе започне со работа се услужуваат студенти од сите три типа паралелно,
   но исто така сите три шалтера не одат со иста брзина па услужувањето е со следниот алгоритам
   (два студента што ги бараат книга од тип Наука, па секвелнцијално еден студент што бара книга
   од тип Научна фантастика, па секвенцијално два студенат што бараат книга од тип Историја).

Доколку студент чека ред за книги од различен тип, тој чека ред првин во редицата за книга од тип
Наука, потоа во редицата за книга од тип Научна фантастика и на крај во редицата за книга од тип Историја
(во зависност ако ги бара овие книги за позајмување).

Влез: Во првата линија е даден број на студенти кои имаат дојдено во библиотеката да позајмат книга.
 Потоа 4 редици се внесуваат за секој студент, каде првата линија е име на студент, а во
  останатите 3 редици се внесува дали студентот ќе позајми книга од даден тип (Наука, Научна
   фантастика и Историја соодветно), каде 1 значи дека има за цел да позајми книга од тој тип,
   0 значи дека нема да позајми книга од тој тип.

Пример:

Иван Ивановски

1

1

0

значи дека студентот Иван Ивановски има за цел да позајми книга од тип Наука и тип Научна фантастика,
 но не има за цел да позајми книга од тип Историја.

Излез: Испечати го редоследот на студентите по редослед како завршуваат со позајмување на сите книги.
*/
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
//class Student{
//    String ime;
//    int tip1nauka;
//    int tip2naukaifantastika;
//    int tip3istorija;
//    public Student(String ime,int tip1nauka, int tip2naukaifantastika, int tip3istorija){
//        this.ime=ime;
//        this.tip1nauka=tip1nauka;
//        this.tip2naukaifantastika=tip2naukaifantastika;
//        this.tip3istorija=tip3istorija;
//    }
//}
//public class ArrayQueueBiblioteka2 {
//    public static void main(String[] args){
//        Scanner scanner = new Scanner(System.in);
//        int n = Integer.parseInt(scanner.nextLine());
//        ArrayQueue<Student> studentiStoCekaatZaNauka = new ArrayQueue<Student>(n);
//        ArrayQueue<Student> studentiStoCekaatZaNaucnaFantastika = new ArrayQueue<Student>(n);
//        ArrayQueue<Student> studentiStoCekaatZaIstorija = new ArrayQueue<Student>(n);
//        for(int i = 0; i < n; i++){
//            String ime = scanner.nextLine();
//            int tip1nauka = Integer.parseInt(scanner.nextLine());
//            int tip2naukaifantastika = Integer.parseInt(scanner.nextLine());
//            int tip3istorija = Integer.parseInt(scanner.nextLine());
//            Student student = new Student(ime, tip1nauka, tip2naukaifantastika, tip3istorija);
//            if(student.tip1prilozuvanjeDokumenti == 1){
//                studentiStoCekaatZaNauka.enqueue(student);
//            } else if(student.tip2zemanjeIndex == 1){
//                studentiStoCekaatZaNaucnaFantastika.enqueue(student);
//            } else if(student.tip3zemanjeDokumentiOdSredno == 1){
//                studentiStoCekaatZaIstorija.enqueue(student);
//            }
//        }
//        while (!studentiStoCekaatZaNauka.isEmpty() || !studentiStoCekaatZaNaucnaFantastika.isEmpty() || !studentiStoCekaatZaIstorija.isEmpty()) {
//            int serviranNauka = 0;
//            while ( serviranNauka < 2&& !studentiStoCekaatZaNauka.isEmpty()) {
//                Student s = studentiStoCekaatZaNauka.dequeue();
//                serviranNauka++;
//                if (s.tip2zemanjeIndex == 1) {
//                    studentiStoCekaatZaNaucnaFantastika.enqueue(s);
//                } else if (s.tip3zemanjeDokumentiOdSredno == 1) {
//                    studentiStoCekaatZaIstorija.enqueue(s);
//                } else {
//                    System.out.println(s.ime);
//                }
//            }
//            if (!studentiStoCekaatZaNaucnaFantastika.isEmpty()) {
//                Student s = studentiStoCekaatZaNaucnaFantastika.dequeue();
//                if (s.tip3zemanjeDokumentiOdSredno == 1) {
//                    studentiStoCekaatZaIstorija.enqueue(s);
//                } else {
//                    System.out.println(s.ime);
//                }
//            }
//            int serviranIstorija = 0;
//            while (serviranIstorija < 2 && !studentiStoCekaatZaIstorija.isEmpty()) {
//                Student s = studentiStoCekaatZaIstorija.dequeue();
//                serviranIstorija++;
//                System.out.println(s.ime);
//            }
//        }
//    }
//}