package msk.nbki.myapp.pages;

import msk.nbki.myapp.domain.ShoppingBasket;
import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.annotations.SessionState;

public class SharingAcrossMultiplePages1 {

    @SessionState
    @Property
    private ShoppingBasket myBasket;


    Object onSuccess() {
        return SharingAcrossMultiplePages2.class;
    }

    Object onGoHome() {
        // Delete the SSO from the session
        myBasket = null;
        return this;
    }
}
