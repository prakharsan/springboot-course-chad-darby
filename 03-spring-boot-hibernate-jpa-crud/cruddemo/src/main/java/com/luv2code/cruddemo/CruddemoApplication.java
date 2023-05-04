package com.luv2code.cruddemo;

import com.luv2code.cruddemo.dao.StudentDAO;
import com.luv2code.cruddemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CruddemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(CruddemoApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(StudentDAO studentDAO) {
        return runner -> {
//			createStudent(studentDAO);
//            createMultipleStudents(studentDAO);

            readStudent(studentDAO);
        };
    }

    private void readStudent(StudentDAO studentDAO) {
        System.out.println("Creating new student object ...");
        Student tempStudent1= new Student("Prakhar", "Sankrityayan", "prakhar@luv2code.com");
        System.out.println("Saving the student ...");
        studentDAO.save(tempStudent1);

        int theId = tempStudent1.getId();
        System.out.println("Saved student. Generated id: " + theId);

        System.out.println("Retrieving the student with id: " + theId);
        Student myStudent = studentDAO.findById(theId);
        System.out.println("myStudent: " + myStudent);

    }

    private void createMultipleStudents(StudentDAO studentDAO) {
        System.out.println("Creating new student object ...");
        Student tempStudent1 = new Student("John", "Doe", "john@luv2code.com");
        Student tempStudent2 = new Student("Paul", "Walker", "paul_walker@luv2code.com");
        Student tempStudent3 = new Student("jane", "Doe", "jane@luv2code.com");

        System.out.println("Saving the students ...");
        studentDAO.save(tempStudent1);
        studentDAO.save(tempStudent2);
        studentDAO.save(tempStudent3);

    }

    private void createStudent(StudentDAO studentDAO) {
        System.out.println("Creating new student object ...");
        Student tempStudent = new Student("Paul", "Doe", "paul@luv2code.com");

        System.out.println("Saving the student ...");
        studentDAO.save(tempStudent);

        System.out.println("Saved student. Generated id: " + tempStudent.getId());
    }

}