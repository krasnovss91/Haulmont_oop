package com.company.entuty;

public class Student extends Person {

    private Long recordBook;

    private Integer course;

    public Long getRecordBook() {
        return recordBook;
    }

    public void setRecordBook(Long recordBook) {
        this.recordBook = recordBook;
    }

    public Integer getCourse() {
        return course;
    }

    public void setCourse(Integer course) {
        this.course = course;
    }

    public Student(String login, String password, String firstName, String lastName, String middleName, String email, Boolean active, Long recordBook, Integer course) {
        super(login, password, firstName, lastName, middleName, email, active);
        this.recordBook = recordBook;
        this.course = course;
    }


}
