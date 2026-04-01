package beans;

import java.io.Serializable;

public class Person implements Serializable {

    private String name;

    // Constructor
    public Person() {}

    // Getter
    public String getName() {
        return name;
    }

    // Setter
    public void setName(String name) {
        this.name = name;
    }
}