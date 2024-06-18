package аctors;

// imports

import interfaces.Communication;
import locations.*;

import java.util.Objects;


public class Mister extends Character implements Communication {
    // Переменная location
    Locations location;

    // Имя
    public Mister(String name) {
        super(name);
    }

    // Выбор локации
    public void setLocation(Locations location) {
        this.location = location;
    }

    // Метод перемещения в выбранную локацию c кем-то
    public void moveToLocationWith(Character character) {
        System.out.print("went to " + this.location + " with " + "Mr." + character + ". ");
    }

    // Метод перемещения в выбранную локацию
    public void moveToLocationAlone() {
        System.out.print("went to " + this.location + ". ");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Mister mister = (Mister) o;
        return Objects.equals(location, mister.location);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), location);
    }
}
