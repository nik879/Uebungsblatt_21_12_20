package Beispiel_1;

import java.util.ArrayList;

public class EventKalender {

    private ArrayList<Event> events = new ArrayList<>();

    public void add(Event event) {
        events.add(event);
    }

    public Event getBytitle(String title) {
        for (Event e :
                events) {
            if (e.getTitle().equals(title)) {
                return e;
            }
        }
        return null;
    }

    public ArrayList<Event> getByort(String ort) {
        ArrayList<Event> ph = new ArrayList<>();
        for (Event e :
                events) {
            if (e.getOrt().equals(ort)) {
                ph.add(e);
            }
        }
        return ph;
    }

    public ArrayList<Event> getByeintrittspreis(double min, double max) {
        ArrayList<Event> ph = new ArrayList<>();
        for (Event e:
             events) {
            if (e.getEintrittspreis() <= max && e.getEintrittspreis() >= min) {
                ph.add(e);
            }
        }
        return ph;
    }

    public Event getMostExpensiveByort(String ort) {
        double max = 0.0;
        Event highestprice = null;
        for (Event e :
                events) {
            if (e.getOrt().equals(ort)) {
                if (e.getEintrittspreis() > max) {
                    max = e.getEintrittspreis();
                    highestprice=e;
                }

            }
        }
            return highestprice;
    }

    public double getAvgPreisbyort(String ort) {
        double avgprice=0;
        int anzahl=0;
        for (Event e :
                events) {
            if (e.getOrt().equals(ort)) {
                anzahl++;
                avgprice+=e.getEintrittspreis();
            }
        }
        return avgprice/anzahl;
    }


}
