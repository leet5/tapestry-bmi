package msk.nbki.myapp.pages;

import msk.nbki.myapp.domain.Gender;
import msk.nbki.myapp.services.HumansHistory;
import org.apache.tapestry5.annotations.InjectComponent;
import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.corelib.components.Form;
import org.apache.tapestry5.corelib.components.Select;
import org.apache.tapestry5.corelib.components.TextField;
import org.apache.tapestry5.ioc.annotations.Inject;

public class Forms1 {
    @Inject
    @Property
    private HumansHistory humansHistory;

    /*Main props*/
    @Property
    private String name;

    @Property
    private Double weight;

    @Property
    private Double height;

    @Property
    private Gender gender;

    /*Form validation check components*/
    @InjectComponent("names")
    private Form form;

    @InjectComponent("name")
    private TextField nameField;

    @InjectComponent("weight")
    private TextField weightField;

    @InjectComponent("height")
    private TextField heightField;

    @InjectComponent("gender")
    private Select genderSelect;

    synchronized Object onSuccess() {
        humansHistory.addHistory(name, weight, height);
        return this;
    }

    void onValidateFromNames() {
        if (name == null) {
            form.recordError(nameField,
                "You've not entered the name");
        }
        if (weight == null) {
            form.recordError(weightField,
                "You've not entered a weight");
        }
        if (height == null) {
            form.recordError(heightField,
                "You've not entered a height");
        }
        if (gender == null) {
            form.recordError(genderSelect,
                "You have not chosen a gender");
        }
    }
}
