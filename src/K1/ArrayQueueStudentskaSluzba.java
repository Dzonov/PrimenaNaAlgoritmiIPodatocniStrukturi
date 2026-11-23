//package K1;
/*
Студентска служба е посетена од студентите со цел да приложат/земат документи.
 Студентот може да приложи документи, да побара да си го земе индексот или пак да побара
  да си ги земе документите од средно. Кога студентската служба ќе започне со работа се услужуваат
   студенти од сите три типа паралелно, но исто така сите три шалтера не одат со иста брзина па услужувањето 
   е со следниот алгоритам (еден студент што приложува документи, па секвенцијално еден студент што сака да си
    го земе индексот, па секвенцијално еден студент што сака да си ги земе документите од средно).

Доколку студент чека ред за повеќе услуги кај студентската служба, тој чека ред првин
 во редицата за приложување на документи, потоа во редицата за земање на индекс и на крај
  во редицата за земање на документи од средно.

Влез: Во првата линија е даден број на студенти кои имаат дојдено за да бидат услужени од
 студентската служба. Потоа 4 редици се внесуваат за секој студент, каде првата линија е име на студент,
  а во останатите 3 редици се внесува дали има потреба од дадена услуга (приложување документи, земање на индекс,
   земање на документи од средно соодветно), каде 1 значи дека има потреба од услуга од тој тип, 0 значи дека нема
    потреба од услуга од тој тип.

Пример:

Иван Ивановски

1

1

0

значи дека студентот Иван Ивановски има за цел да приложи документи и да си го земе индексот.

Излез: Испечати го редоследот на студентите по редослед како завршуваат со сите услуги од студенстката служба.
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
//    int tip1prilozuvanjeDokumenti;
//    int tip2zemanjeIndex;
//    int tip3zemanjeDokumentiOdSredno;
//    public Student(String ime,int tip1prilozuvanjeDokumenti, int tip2zemanjeIndex, int tip3zemanjeDokumentiOdSredno){
//        this.ime=ime;
//        this.tip1prilozuvanjeDokumenti =tip1prilozuvanjeDokumenti;
//        this.tip2zemanjeIndex =tip2zemanjeIndex;
//        this.tip3zemanjeDokumentiOdSredno =tip3zemanjeDokumentiOdSredno;
//    }
//}
//public class ArrayQueueStudentskaSluzba {
//    public static void main(String[] args){
//        Scanner scanner = new Scanner(System.in);
//        int n = Integer.parseInt(scanner.nextLine());
//        ArrayQueue<Student> studentiStoCekaatZaPrilozuvanjeDokumenti = new ArrayQueue<Student>(n);
//        ArrayQueue<Student> studentiStoCekaatZaZemanjeIndex = new ArrayQueue<Student>(n);
//        ArrayQueue<Student> studentiStoCekaatZaZemanjeDokumentiOdSredno = new ArrayQueue<Student>(n);
//        for(int i = 0; i < n; i++){
//            String ime = scanner.nextLine();
//            int tip1prilozuvanjeDokumenti = Integer.parseInt(scanner.nextLine());
//            int tip2zemanjeIndex = Integer.parseInt(scanner.nextLine());
//            int tip3zemanjeDokumentiOdSredno = Integer.parseInt(scanner.nextLine());
//            Student student = new Student(ime, tip1prilozuvanjeDokumenti, tip2zemanjeIndex, tip3zemanjeDokumentiOdSredno);
//            if(student.tip1prilozuvanjeDokumenti == 1){
//                studentiStoCekaatZaPrilozuvanjeDokumenti.enqueue(student);
//            } else if(student.tip2zemanjeIndex == 1){
//                studentiStoCekaatZaZemanjeIndex.enqueue(student);
//            } else if(student.tip3zemanjeDokumentiOdSredno == 1){
//                studentiStoCekaatZaZemanjeDokumentiOdSredno.enqueue(student);
//            }
//        }
//        while (!studentiStoCekaatZaPrilozuvanjeDokumenti.isEmpty() || !studentiStoCekaatZaZemanjeIndex.isEmpty() || !studentiStoCekaatZaZemanjeDokumentiOdSredno.isEmpty()) {
//            if (!studentiStoCekaatZaPrilozuvanjeDokumenti.isEmpty()) {
//                Student s = studentiStoCekaatZaPrilozuvanjeDokumenti.dequeue();
//                if (s.tip2zemanjeIndex == 1) {
//                    studentiStoCekaatZaZemanjeIndex.enqueue(s);
//                } else if (s.tip3zemanjeDokumentiOdSredno == 1) {
//                    studentiStoCekaatZaZemanjeDokumentiOdSredno.enqueue(s);
//                } else {
//                    System.out.println(s.ime);
//                }
//            }
//            if (!studentiStoCekaatZaZemanjeIndex.isEmpty()) {
//                Student s = studentiStoCekaatZaZemanjeIndex.dequeue();
//                if (s.tip3zemanjeDokumentiOdSredno == 1) {
//                    studentiStoCekaatZaZemanjeDokumentiOdSredno.enqueue(s);
//                } else {
//                    System.out.println(s.ime);
//                }
//            }
//            if (!studentiStoCekaatZaZemanjeDokumentiOdSredno.isEmpty()) {
//                Student s = studentiStoCekaatZaZemanjeDokumentiOdSredno.dequeue();
//                System.out.println(s.ime);
//            }
//        }
//    }
//}