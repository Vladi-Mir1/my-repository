
public class Main {

	public static void main(String[] args) {
		int x = 1;
		while (x <= 100) {
			if (x % 15 == 0){
				System.out.println("foobar");
			} else if (x % 3 == 0) {
				System.out.println("foo");
			} else if (x % 5 == 0) {
				System.out.println("bar");
			} else {
				System.out.println(x);
			}
			x++;
		}
	}
}
