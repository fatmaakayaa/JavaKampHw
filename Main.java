package JavaKampHw;

	public class Main {

		public static void main(String[] args) {
			
			Course course1 = new Course(1, "C# + ANGULAR", "Engin Demirog", 0);
			Course course2 = new Course(2, "JAVA + REACT", "Engin Demirog", 29);
			Course course3 = new Course(3, "Programlamaya Giris", "Engin Demirog", 32);

			Course[] courses = {course1, course2, course3};

			System.out.println("Kurslar: ");
			for(Course course : courses) {
				System.out.println(course.name + " kursu %" + course.progress + " tamamlandý.");
			}

			Instructor instructor1 = new Instructor(1, "Engin Demirog");
			Instructor[] instructors = {instructor1};

			System.out.println();
			System.out.println("Egitmenler: ");
			for (Instructor instructor : instructors) {
				System.out.println(instructor.name);
			}

			System.out.println();
			CourseManager courseManager = new CourseManager();
			courseManager.courseProgram(course3);
			courseManager.previousLesson(course2);
			courseManager.finishAndNextLesson(course1);


		}

	}
