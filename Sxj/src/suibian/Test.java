package suibian;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		 Course course=new Course(1, "Japonese", "tokyo",3,3);
		 Teather teather=new Teather(1, "王老师", "women",course);
		 Student student=new Student(1, "宋小军", "men",course,teather);
		 System.out.println(student.toString());
		 student.delete();
//		 student.setCourse(null);
//		 student.setTeather(null);
		 student.putcourse();
		 
	}
	

}
