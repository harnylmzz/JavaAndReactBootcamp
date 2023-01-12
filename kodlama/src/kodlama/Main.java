package kodlama;

public class Main {

	public static void main(String[] args) {

		// STUDENT

		Student student1 = new Student(1, "Harun Yilmaz");

		Student student2 = new Student(2, "Harnu Yilmaz");

		Student[] students = { student1, student2 };

		for (Student student : students) {
			System.out.println(student.fullName);
		}

		StudentManager studentManager = new StudentManager();
		studentManager.add(student1);
		studentManager.add(student2);

		// COURSE

		Course course1 = new Course(1, "Java");
		Course course2 = new Course(2, "C#");

		Course[] courses = { course1, course2 };

		for (Course course : courses) {
			System.out.println(course.courseName);

			CourseManager courseManager = new CourseManager();
			courseManager.add(course);
			
			
		// TEACHER
			
			Teacher teacher1 = new Teacher(1, "Engin Demirog");
			 
			Teacher teacher2 = new Teacher(2, "Polat Alemdar");
			
			Teacher[] teachers = {teacher1, teacher2 };
					
			for (Teacher teacher : teachers) {
				System.out.println(teacher.fullName);
				
				
			TeacherManager teacherManager = new TeacherManager();
			teacherManager.add(teacher);
			}
			
			
		}
	}
}
