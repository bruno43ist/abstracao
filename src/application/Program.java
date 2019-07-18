package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Shape> shapes = new ArrayList<>();
		
		System.out.println("Enter the number of shapes: ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.println("Shape #" + i + "data: ");
			System.out.println("Rectangle or Circle (r/c)? ");
			char c = sc.next().charAt(0);
			System.out.println("Color (BLACK/BLUE/RED): ");
			String col = sc.next();
			Color color = Color.valueOf(col);
			if(c == 'r') {
				System.out.println("Width: ");
				double width = sc.nextDouble();
				System.out.println("Height: ");
				double height = sc.nextDouble();
				Shape rec = new Rectangle(width, height);
				shapes.add(rec);
			} else {
				System.out.println("Radius: ");
				double radius = sc.nextDouble();
				Shape cir = new Circle(radius);
				shapes.add(cir);
			}
		}
		
		System.out.println();
		
		System.out.println("SHAPE AREAS: ");
		
		for(Shape c : shapes) {
			System.out.println(String.format("%.2f", c.area()));
		}
		
		sc.close();

	}

}
