package msk.nbki.myapp.pages;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import msk.nbki.myapp.domain.Human;
import org.apache.tapestry5.annotations.InjectComponent;
import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.corelib.components.Form;
import org.apache.tapestry5.corelib.components.TextField;

import java.util.ArrayList;
import java.util.Date;

public class Forms1 {
    @Property
    ArrayList<Human> humans = new ArrayList<Human>();

    @Property
    Human human;

    @Property
    @NotNull
    @Size(max = 10)
    private String name;

    @Property
    @NotNull
    private double weight;

    @Property
    @NotNull
    private double height;

    @Property
    @NotNull
    private String gender;


    @InjectComponent("names")
    private Form form;

    @InjectComponent("name")
    private TextField nameField;
    @InjectComponent("weight")
    private TextField weightField;
    @InjectComponent("height")
    private TextField heightField;

    void onValidateFromNames() {
        if (name == null)
            form.recordError(nameField, "You've not entered the name");
        if(weight == 0)
            form.recordError(weightField, "You've not entered a weight");
        if(height == 0)
            form.recordError(heightField, "You've not entered a height");

    }

    synchronized Object onSuccess() {
        Human human = new Human(name, weight, height, gender, new Date());
        humans.add(0, human);
        return this;
    }
}
