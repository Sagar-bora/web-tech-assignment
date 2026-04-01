package bound;

import java.beans.*;

public class BoundExample {

    private String value;
    private PropertyChangeSupport pcs =
        new PropertyChangeSupport(this);

    public void setValue(String newValue) {
        pcs.firePropertyChange("value", value, newValue);
        value = newValue;
    }
}