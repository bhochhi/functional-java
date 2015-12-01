import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.function.Predicate;
import java.util.stream.Collectors;
public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello world");
		new HelloWorld().execute();
	}
	public void execute(){
		String[] strs = {"dsdewew "," dsd sd",""};
		
		String opt =Arrays.asList(strs).stream().map(String::trim).filter(s->s.length()>0).collect(Collectors.joining());
		System.out.println("*****************  "+opt);
		
		
		System.out.println("Hellow");
		List<Student> students = new ArrayList<Student>(){
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			{
				add(new Student(22226,2001));
				add(new Student(2441,2011));
				add(new Student(22,2011));
				add(new Student(211,2011));
				add(new Student(222,2011));
				
			}
		};
		
		OptionalInt highScore = students.stream()
		.filter(new Predicate<Student>() {

			@Override
			public boolean test(Student t) {
				// TODO Auto-generated method stub
				return t.getYear() == 2011;
			}
		})
		.mapToInt(Student::getScore).max();
		
		System.out.println(highScore.isPresent()?highScore.getAsInt():"Failed");
	}
	
	public class Student {
		private int score;
		private int year;

		public Student(int score, int year){
			setScore(score);
			setYear(year);
		}
		public int getScore() {
			return score;
		}

		public void setScore(int score) {
			this.score = score;
		}
		public int getYear() {
			return year;
		}
		public void setYear(int year) {
			this.year = year;
		}
	}
}
