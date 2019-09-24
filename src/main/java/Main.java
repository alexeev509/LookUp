import beans.InjectionPrototypeInSinglton;
import beans.NewBeanEveryTime;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new AnnotationConfigApplicationContext("beans");
        InjectionPrototypeInSinglton bean1 = applicationContext.getBean(InjectionPrototypeInSinglton.class);
        InjectionPrototypeInSinglton bean2 = applicationContext.getBean(InjectionPrototypeInSinglton.class);

        System.out.println(bean1==bean2);

        System.out.println(bean1.getPrototypeBean()==bean1.getPrototypeBean());

        System.out.println(bean1.getClass());

        Method[] methods = bean2.getClass().getMethods();


        System.out.println("----------methods in new proxy class-----------");
        for (int i = 0; i < methods.length; i++) {
            System.out.println(methods[i].getName());
        }
    }
}
