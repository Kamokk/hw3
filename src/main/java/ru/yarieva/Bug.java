package ru.yarieva;

public class Bug {
 private String name;
 private int size;
  private String color;

    //конструктор
    public Bug(String name, int size, String color) {
        this.name=name;
        this.size=size;
        this.color=color;
    }
public static void sitDown() {
        System.out.println("Сидеть");
}
// описание геттеров и сеттеров
    public void setName (String name) {
        this.name=name;
    }
    public void setSize(int size) {
        this.size=size;
    }
    public void setColor(String color) {
        this.color=color;
    }
    public String getName() {
        return name;
    }
    public  int getSize() {
        return size;
    }
    public String getColor() {
        return color;
    }
}
