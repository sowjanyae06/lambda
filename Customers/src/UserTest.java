import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class UserTest {
	  private static List<User> users = Arrays.asList(
	      new User(123, "Sowjanya", "Eesari", 25),
	      new User(456, "Krishna", "Kanth", 30),
	      new User(789, "Manasa", "Kothamraju", 27),
	      new User(900, "Geetha", "Tumma", 52)
	      
	    );

	  public static void main(String[] args) {
	    
	    newJavaWay();
	  }

	

	  private static void newJavaWay() {
	    Collections.sort(users, (User u1, User u2) -> u1.salary.compareTo(u2.salary));
	    printListNewWay("by ID");

	    Collections.sort(users, (User u1, User u2) -> u1.firstName.compareTo(u2.firstName));
	    printListNewWay("by FirstName");

	    Collections.sort(users, (User u1, User u2) -> u1.lastName.compareTo(u2.lastName));
	    printListNewWay("by LastName");

	    Collections.sort(users, (User u1, User u2) -> u1.age.compareTo(u2.age));
	    printListNewWay("by Age");

	  }

	  private static void printListNewWay(String type) {
	    System.out.println("Sorting" + type + ":");

	    users.forEach(u -> System.out.println("\t" + u));

	    System.out.println();
	  }
	}