import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import model.Student;

@SpringBootApplication
public class StudentSpring {

	public static void main(String[] args) {
		SpringApplication.run(Student.class, args);

	}

}

