package ITMO.Java.lecture_3;

public class Tree {
    //Переменные экземпляра
    private int age;
    private Boolean liveStatus;
    private String name;

    //Конструкторы объекта
    public Tree(int AGE, String NAME) {
        this.age = AGE;
        this.name = NAME;
    }

    public Tree(int AGE, Boolean LIVE_STATUS, String NAME) {
        this.age = AGE;
        this.liveStatus = LIVE_STATUS;
        this.name = NAME;
    }

    public Tree() {
        System.out.println("Пустой конструктор без параметров сработал.");
    }

    //Сеттеры для переменных экземпляра
    public void setAge(int AGE) {
        this.age = AGE;
    }

    public void setLiveStatus(Boolean LIVE_STATUS) {
        this.liveStatus = LIVE_STATUS;
    }

    public void setName(String NAME) {
        this.name = NAME;
    }
}
