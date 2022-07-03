package ITMO.Java.lecture_3;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Building {
    //Переменные экземпляра
    private String name;
    private int floorCount;
    private int builtYear;

    //Сеттеры для установки переменных экземпляра
    public void setParamBuilding(String NAME, int FLOOR_COUNT, int BUILT_YEAR) {
        this.name = NAME;
        this.floorCount = FLOOR_COUNT;
        this.builtYear = BUILT_YEAR;
    }

    public void setName(String NAME) {
        this.name = NAME;
    }

    public void setFloorCount(int FLOOR_COUNT) {
        this.floorCount = FLOOR_COUNT;
    }

    public void setBuiltYear(int BUILT_YEAR) {
        this.builtYear = BUILT_YEAR;
    }

    //Метод для вывода всех переменных экземпляра
    public String getParamBuilding() {
        return "Наименование здания - " + this.name + ", " +
                "Количество этажей - " + this.floorCount + ", " +
                "Год постройки здания - " + this.builtYear + ".";
    }

    //Метод для подсчёта количества лет с момента постройки
    public int getCountYear() {
        SimpleDateFormat formatter = new SimpleDateFormat("YYYY");
        Date date = new Date(System.currentTimeMillis());
        return Integer.parseInt(formatter.format(date)) - this.builtYear;
    }
}
