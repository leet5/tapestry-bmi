package msk.nbki.myapp.services;

import org.apache.tapestry5.ioc.ServiceBinder;

public class AppModule {
    public static void bind(ServiceBinder binder) {
        binder.bind(HumansHistory.class);
    }
}
