import java.util.ArrayList;
import java.util.Random;

public class program {
	public static void main(String[] args) {
		Random randNumber = new Random();
		ArrayList<Integer> numbs = new ArrayList<Integer>();
		while (numbs.size()<10) {
			int iNumber = randNumber.nextInt(10);
			if (!numbs.contains(iNumber)) {
				numbs.add(iNumber);
				System.out.println(iNumber);
			}
		}
	}
}