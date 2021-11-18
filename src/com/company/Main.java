package com.company;

import com.company.entuty.Person;
import com.company.entuty.Student;
import com.company.entuty.Teacher;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here

        List<Student> studentsFirstCourse = generateStudentsOneCourse();
        List<Student> studentsSecondCourse = generateStudentsTwoCourse();
        List<Teacher> teachers = generateTeachers();

        List<Person> people = new ArrayList<>();

        people.add((Person) studentsFirstCourse);
        people.add((Person) studentsSecondCourse);
        people.add((Person) teachers);

    }


    private static final String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static String generateRandom(int length) { //метод генерации строк
        Random random = new SecureRandom();
        if (length <= 0) {
            throw new IllegalArgumentException("String length must be a positive integer");
        }

        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            sb.append(characters.charAt(random.nextInt(characters.length())));
        }

        return sb.toString();
    }

    public static List<Student> generateStudentsOneCourse(){

        List<Student> students = new ArrayList<Student>();

        students.add(new Student(generateRandom(6),generateRandom(5),generateRandom(7),generateRandom(10),generateRandom(6),generateRandom(4),true,8543234L,1));
        students.add(new Student(generateRandom(5),generateRandom(7),generateRandom(9),generateRandom(10),generateRandom(8),generateRandom(5),true,8043644L,1));

        return students;
    }

    public static List<Student> generateStudentsTwoCourse(){

        List<Student> students = new ArrayList<Student>();
        students.add(new Student(generateRandom(5),generateRandom(7),generateRandom(5),generateRandom(8),generateRandom(9),generateRandom(5),false,6033534L,2));
        students.add(new Student(generateRandom(5),generateRandom(7),generateRandom(6),generateRandom(6),generateRandom(8),generateRandom(5),false,6220434L,2));

        return students;
    }

    public static List<Teacher> generateTeachers(){

        List<Teacher> teachers = new ArrayList<Teacher>();

        teachers.add(new Teacher(generateRandom(5),generateRandom(5),generateRandom(7),generateRandom(7),generateRandom(7),generateRandom(8),true,generateRandom(8)));
        teachers.add(new Teacher(generateRandom(5),generateRandom(5),generateRandom(5),generateRandom(6),generateRandom(9),generateRandom(8),false,generateRandom(6)));
        teachers.add(new Teacher(generateRandom(5),generateRandom(5),generateRandom(8),generateRandom(8),generateRandom(10),generateRandom(6),true,generateRandom(8)));

        return teachers;
    }
}
