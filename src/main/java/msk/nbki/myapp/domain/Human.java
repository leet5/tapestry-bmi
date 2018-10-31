package msk.nbki.myapp.domain;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Human {
    private String name;
    private double weight;
    private double height;
    private String gender;
    private Date date;
    private String formatDate;
    private String formatTime;
    private double BMI;

    public Human() {
    }

    public Human(String name, double weight, double height, String gender, Date date) {
        this.name = name;
        this.weight = weight;
        this.height = height;
        this.gender = gender;
        this.date = date;

        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat tf = new SimpleDateFormat("HH:mm:ss");

        formatDate = df.format(date);
        formatTime = tf.format(date);

        BMI = weight / (Math.pow(height / 100, 2));
    }

    public String getName() {
        return name;
    }
    public double getWeight() {
        return weight;
    }
    public double getHeight() {
        return height;
    }
    public String getGender() {
        return gender;
    }
    public Date getDate() {
        return date;
    }
    public String getFormatDate() {
        return formatDate;
    }
    public String getFormatTime() {
        return formatTime;
    }
    public double getBMI() {
        return BMI;
    }
}
