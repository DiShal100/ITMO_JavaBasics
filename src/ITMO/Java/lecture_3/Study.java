package ITMO.Java.lecture_3;

public class Study {
    private String course;

    //Конструктор по умолчанию
    public Study() {
        this.course = "Здесь должно быть название курса";
    }

    //Конструктор  одним параметром
    public Study(String text) {
        this.course = text;
    }

    //TO DO
    public String printCourse() {
        return this.course;
    }
}
