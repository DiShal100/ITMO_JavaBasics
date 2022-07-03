package ITMO.Java.lecture_3;

public class Car {
    //Переменные экземпляра
    private String color;
    private String carName;
    private float weight;

    //Конструкторы класса
    public Car(String COLOR) {
        this.color = COLOR;
    }

    public Car(String COLOR, float WEIGHT) {
        this.color = COLOR;
        this.weight = WEIGHT;
    }

    public Car() {
    }

    //Сеттеры для переменных экземпляра
    public void setColor(String COLOR) {
        this.color = COLOR;
    }

    public void setCarName(String Car_Name) {
        this.carName = Car_Name;
    }

    public void setWeight(float WEIGHT) {
        this.weight = WEIGHT;
    }

    //Метод вывода в консоль переменных экземпляра
    public String printParam() {
        return "Цвет - " + this.color + ", " + "Название - " + this.carName + ", " + "Вес - " + this.weight;
    }
}
