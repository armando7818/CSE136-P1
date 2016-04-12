import java.util.Date;
import java.util.Random;
import java.sql.Timestamp;

public class Hello {
	public static void printHtml() {
		System.out.print("Content-type: text/html\n\n");
		System.out.println("<!DOCTYPE html>");
		System.out.println("<html lang=\"en\">");
		printHead();
		printBody();
		System.out.println("</html>");
	}

	public static void printHead() {
		System.out.println("  <head>");
		System.out.println("    <meta charset=\"UTF-8\">");
		System.out.println("    <title>Hello Java Example</title>");
		System.out.println("  </head>");
	}

	public static void printBody() {
		System.out.println("  <body style=\"background-color:" + getRandomColor() + "\">");
		System.out.println("    <p>Hello World from Java @ " + getTimestamp() + "</p>");
		System.out.println("  </body>");
	}

	public static String getRandomColor() {
		String[] colors = {"aqua", "black", "blue", "fuchsia", "gray",
							"green", "lime", "maroon", "navy", "olive",
							"purple", "red", "silver", "teal", "white",
							"yellow"};

		Random r = new Random();
		int num = r.nextInt(colors.length);
		return colors[num]; 
	}

	public static String getTimestamp() {
		Date date = new Date();
		return date.toString();
	}

	public static void main(String[] args) {
		printHtml();
	}
}