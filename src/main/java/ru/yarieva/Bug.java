package ru.yarieva;

public class Bug {
    private String name;
    private int size;
    private String color;

    //конструктор
    public Bug(String name, int size, String color) {
        this.name = name;
        this.size = size;
        this.color = color;
    }

    public static void sitDown() {
        System.out.println("Сидеть");
    }

    public String getName() {
        return name;
    }

    // описание геттеров и сеттеров
    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
