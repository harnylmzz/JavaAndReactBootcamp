package kodlama.io;

public class Main {

	public static void main(String[] args) {

		// user

		User user = new User();
		user.setId(1);
		user.setEmail("birisi@gmail.com");
		user.setPassword("12345");
		
		//Course
		
		Course course = new Course();
		course.setId(1);
		course.setName("Java");
		
		
		//Student
		
		Student student = new Student();
		student.setFirstName("Isim");
		student.setLastName("Soyisim");
		
		//Instructor
		Instructor instructor = new Instructor();
		instructor.setFirstName("EgitmenAdi");
		instructor.setLastName("EgitmenSoyadi");
		
		//managers
		
		UserManager userManager = new UserManager();
		userManager.add(user);
		
		CourseManager courseManager = new CourseManager();
		courseManager.add(course);
		
		StudentManager studentManager = new StudentManager();
		studentManager.add(student);

		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add(instructor);
	}

}
