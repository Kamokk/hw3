package ru.yarieva;

public class Main {
    public static void main(String[] args) {
        //Создаем родительский объект насекомое
        Bug bug= new Bug("Насекомое", 5, "Зеленый");
        String nameBug= bug.getName();
        int sizeBug=bug.getSize();
        String colorBug=bug.getColor();
        System.out.println("Создаем родительский объект насекомое");
        System.out.println("наименование- "+nameBug+" Размер " +sizeBug+" Окрас "+colorBug);
        System.out.println("Умеет делать");
        Bug.sitDown();
        System.out.println();

        //Создаем дочерний объект бабочка
        Butterfly butterfly=new Butterfly("Бабочка", 10, "Оранжевый");
        String nameButterfly= butterfly.getName();
        int sizeButterfly=butterfly.getSize();
        String colorButterfly=butterfly.getColor();
        System.out.println("Создаем дочерний объект бабочка");
        System.out.println("наименование- "+nameButterfly+" Размер " +sizeButterfly+" Окрас "+colorButterfly);
        System.out.println("Умеет делать");
        Butterfly.sitDown();
        Butterfly.fly();
        Butterfly.collectPollen();
        System.out.println();

        //Создаем дочерний объект Кузнечик
        Grig grig=new Grig("Кузнечик", 4, "Салатовый");
        String nameGrig= grig.getName();
        int sizeGrig=grig.getSize();
        String colorGrig=grig.getColor();
        System.out.println("Создаем дочерний объект кузнечик");
        System.out.println("наименование- "+nameGrig+" Размер " +sizeGrig+" Окрас "+colorGrig);
        System.out.println("Умеет делать");
        Grig.sitDown();
        Grig.jump();
        Grig.chirping();

    }


}
