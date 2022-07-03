package ITMO.Java.lecture_2;

import java.util.Calendar;

public class Judgement {
    //Параметры класса
    private String caseNumber; // номер дела
    private Calendar issueDate; // дата вынесения
    private String petitioner; // истец
    private String defendant; // ответчик
    private String judge; // судья
    private String resolution; // резолютивная часть

    // Перегруженные конструкторы
    public Judgement() {
    }

    public Judgement(String CaseNumber, Calendar IssueDate,
                     String Petitioner, String Defendant,
                     String Judge, String Resolution) {
        this.caseNumber = CaseNumber;
        this.issueDate = IssueDate;
        this.petitioner = Petitioner;
        this.defendant = Defendant;
        this.judge = Judge;
        this.resolution = Resolution;
    }

    public Judgement(String CaseNumber, Calendar IssueDate,
                     String Petitioner, String Defendant,
                     String Judge) {
        this.caseNumber = CaseNumber;
        this.issueDate = IssueDate;
        this.petitioner = Petitioner;
        this.defendant = Defendant;
        this.judge = Judge;
    }

    public Judgement(String CaseNumber, Calendar IssueDate,
                     String Petitioner, String Defendant) {
        this.caseNumber = CaseNumber;
        this.issueDate = IssueDate;
        this.petitioner = Petitioner;
        this.defendant = Defendant;
    }

    public Judgement(String CaseNumber, Calendar IssueDate) {
        this.caseNumber = CaseNumber;
        this.issueDate = IssueDate;
    }

    //Сеттеры для параметров класса
    public void setCaseNumber(String CaseNumber) {
        this.caseNumber = CaseNumber;
    }

    public void setIssueDate(Calendar IssueDate) {
        this.issueDate = IssueDate;
    }

    public void setPetitioner(String Petitioner) {
        this.petitioner = Petitioner;
    }

    public void setDefendant(String Defendant) {
        this.defendant = Defendant;
    }

    public void setJudge(String Judge) {
        this.judge = Judge;
    }

    public void setResolution(String Resolution) {
        this.resolution = Resolution;
    }

    //Переопределение метода 'toString'
    @Override
    public String toString() {
        return "caseNumber - '" + this.caseNumber + '\'' +
                ", issueDate - '" + this.issueDate + '\'' +
                ", petitioner - '" + this.petitioner + '\'' +
                ", defendant - '" + this.defendant + '\'' +
                ", judge - '" + this.judge + '\'' +
                ", resolution - '" + this.resolution + '\'';
    }
}
