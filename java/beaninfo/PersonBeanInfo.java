package beaninfo;

import java.beans.*;

public class PersonBeanInfo extends SimpleBeanInfo {

    public PropertyDescriptor[] getPropertyDescriptors() {
        try {
            PropertyDescriptor pd =
                new PropertyDescriptor("name", Class.forName("beans.Person"));
            return new PropertyDescriptor[]{pd};
        } catch (Exception e) {
            return null;
        }
    }
}