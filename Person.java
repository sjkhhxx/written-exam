package entity;

import java.util.Objects;

public class Person {
    private String name;
    private Integer serial;

    public Person() {
    }

    public Person(String name, Integer serial) {
        this.name = name;
        this.serial = serial;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSerial() {
        return serial;
    }

    public void setSerial(Integer serial) {
        this.serial = serial;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", serial=" + serial +
                '}';
    }
    /**
     * 当name相同，就认定两个对象相等
     *
     * @param o
     * @return
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Person that = (Person) o;
        return Objects.equals(serial, that.serial);
    }


    @Override
    public int hashCode() {
        return Objects.hash(serial);
    }
}
