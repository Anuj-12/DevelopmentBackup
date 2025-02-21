package com.springdemo.cruddemo;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.springdemo.cruddemo.dao.StudentDAO;
import com.springdemo.cruddemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}

	// Hook from spring boot framework
	// Allows us to run code after the program has just started
	@Bean
	public CommandLineRunner commandLineRunner (StudentDAO studentDAO){
		// Lambda expression
		return runner ->{
			//createStudent(studentDAO);
			
			//createMultipleStudents(studentDAO);
			
			//readStudent(studentDAO);

			//queryForStudents(studentDAO);

			queryForStudentsByLastName(studentDAO);

			//updateStudent(studentDAO);

			//deleteStudent(studentDAO);

			//deleteAllStudents(studentDAO);
		};
	}

	private void deleteAllStudents(StudentDAO studentDAO) {

		// delete all students
		System.out.println("Deleting all students");
		int numRowsDeleted = studentDAO.deleteAll();
		System.out.println("No. of rows deleted : " + numRowsDeleted);
	}

	private void deleteStudent(StudentDAO studentDAO) {

		int studentId = 4;
		// deleting the student by id
		System.out.println("Deleting student by id : " + studentId) ;
		studentDAO.delete(studentId);
	}

	private void updateStudent(StudentDAO studentDAO) {

		// retrieve student based on the id
		int studentId = 1;
		System.out.println("Getting the student with id : " + studentId);
		Student myStudent = studentDAO.findById(studentId);

		// change the first name
		System.out.println("Updating the student...");
		myStudent.setFirstName("Donald");

		// update the student
		studentDAO.update(myStudent);

		// displaying the updated student
		System.out.println(myStudent);
	}

	private void queryForStudentsByLastName(StudentDAO studentDAO) {

		// get a list of students
		List<Student> theStudent = studentDAO.findByLastName("Prakash");

		//display the list of students
		for(Student tempStudent : theStudent){
			System.out.println(tempStudent);
		}
	}

	private void queryForStudents(StudentDAO studentDAO) {

		// get list of students
		List<Student> theStudents = studentDAO.findAll();

		// display list of students
		for(Student tempStudent : theStudents){
			System.out.println(tempStudent);
		}
	}

	private void readStudent(StudentDAO studentDAO) {

		// create a student object
		System.out.println("Creating a student object...");
		Student newStudent = new Student("Donald", "Duck", "donalisrich@gmail.com");

		// save the student
		System.out.println("Saving the student...");
		studentDAO.save(newStudent);

		// display id of the student
		int theId = newStudent.getId();
		System.out.println("Student created with the ID : " + theId);

		// retrieve the student based on the id
		System.out.println("Retrieving student with the id : " + theId);
		Student myStudent = studentDAO.findById(theId);

		// display student
		System.out.println("Found the student : " + myStudent);
	}

	private void createMultipleStudents(StudentDAO studentDAO) {

		// creating multiple students
		System.out.println("Creating 3 new student object...");
		Student tempStudent1= new Student("Manoj", "Prakash", "randomguy@gmail.com");
		Student tempStudent2 = new Student("Jyoti", "Prakash", "gobarguy@gmail.com");
		Student tempStudent3= new Student("Cold", "Play", "epicguys@gmail.com");

		// saving the students
		System.out.println("Saving the students...");
		studentDAO.save(tempStudent1);
		studentDAO.save(tempStudent2);
		studentDAO.save(tempStudent3);
	}

	private void createStudent(StudentDAO studentDAO) {

		// Create the student object
		System.out.println("Creating a new student object...");
		Student tempStudent = new Student("Manoj", "Prakash", "randomguy@gmail.com");

		// Save the student object
		System.out.println("Saving the student....");
		studentDAO.save(tempStudent);

		// Display the ID of the student object
		System.out.println("Saved student! Generated ID : " + tempStudent.getId());
	}

}
