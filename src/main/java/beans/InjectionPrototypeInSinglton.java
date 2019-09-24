package beans;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

@Component
public abstract class InjectionPrototypeInSinglton {
    @Lookup
    public abstract NewBeanEveryTime getPrototypeBean();

}
