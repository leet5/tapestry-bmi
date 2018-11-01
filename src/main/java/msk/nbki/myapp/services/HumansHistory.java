package msk.nbki.myapp.services;

import msk.nbki.myapp.domain.History;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class HumansHistory {

    private SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
    private SimpleDateFormat tf = new SimpleDateFormat("HH:mm:ss");

    private ArrayList<History> histories = new ArrayList<>();

    public HumansHistory() {}

    public synchronized void addHistory(String name, Double weight,
                                        Double height) {
        Date date = new Date();
        History history = new History(
                name,
           weight / (Math.pow(height / 100, 2)),
                df.format(date),
                tf.format(date));
        histories.add(0, history);
    }

    public synchronized ArrayList<History> getList() {
        return histories;
    }
}
