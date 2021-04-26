package JavaKampHw;

public class CourseManager {
	
	public void courseProgram(Course course) {
		System.out.println("Kurs Programýnýn Tamamý Listelendi : " + course.name);
	}

	public void previousLesson(Course course) {
		System.out.println(course.name + " kursu için Önceki ders");
	}

	public void finishAndNextLesson(Course course) {
		System.out.println(course.name + " kursu için Bitir ve devam et");
	}	

}

