package msk.nbki.myapp.domain;

public class History {
    private String name;
    private double BMI;
    private String date;
    private String time;

    public History(String name, double BMI, String date, String time) {
        this.name = name;
        this.BMI = BMI;
        this.date = date;
        this.time = time;
    }

    public String getName() {
        return name;
    }
    public double getBMI() {
        return BMI;
    }
    public String getDate() {
        return date;
    }
    public String getTime() {
        return time;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setBMI(double BMI) {
        this.BMI = BMI;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public void setTime(String time) {
        this.time = time;
    }
}
