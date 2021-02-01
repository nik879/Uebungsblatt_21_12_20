package Beispiel_1;

public class DemoEventKalender {
    public static void main(String[] args) {
        Event Elvis = new Event("Elvis","Dublin",50);
        Event shared = new Event("Elvis", "Maradonna", 120);
        Event sting = new Event("Sting", "Dublin", 600);
        EventKalender ek = new EventKalender();
        ek.add(shared);
        ek.add(Elvis);
        ek.add(sting);
//        ek.getBytitle("Elvis").toString();
        System.out.println(ek.getBytitle("Elvis")); //liefert erstes Event in Liste
        System.out.println(ek.getByort("Dublin"));
        System.out.println(ek.getByeintrittspreis(60,600));
        System.out.println(ek.getMostExpensiveByort("Dublin"));
        System.out.println(ek.getAvgPreisbyort("Dublin"));
    }
}
