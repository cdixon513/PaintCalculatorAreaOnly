import java.util.Scanner;

public class PaintCalculatorAreaOnly{

	public static void main(String[] args){

		int numOfDoors, numOfWindows;
		double length, width, height, area;

		Scanner scanner = new Scanner(System.in);
		System.out.print("Length of room: ");
		length = scanner.nextDouble();

		System.out.print("Width of room: ");
		width = scanner.nextDouble();

		System.out.print("Height of room: ");
		height = scanner.nextDouble();

		System.out.print("Number of doors in room: ");
		numOfDoors = scanner.nextInt();

		System.out.print("Number of windows in room: ");
		numOfWindows = scanner.nextInt();
		scanner.close();

		area = 2*(length*height + width*height) - numOfDoors*21 - numOfWindows*12;
		System.out.println("The total area to be painted is " + area + " sqaure feet.");
	}
}
