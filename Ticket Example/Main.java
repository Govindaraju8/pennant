package collectionsPract;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Passenger p1 = new Passenger("p1", 20, 'f', "Lower");
		Passenger p2 = new Passenger("p2", 70, 'm', "Lower");
		Passenger p3 = new Passenger("p3", 30, 'f', "Middle");
		Passenger p4 = new Passenger("p4", 5, 'm', "Upper");
		Passenger p5 = new Passenger("p5", 16, 'f', "Upper");
		// ArrayList<Passenger> pd = new ArrayList<>(Arrays.asList(p1, p2, p3, p4, p5));
		PassengerDetails pd = new PassengerDetails();
		pd.addAll(Arrays.asList(p1, p2, p3, p4, p5));
		// Passenger pd[] = { p1, p2, p3, p4, p5 };
		Ticket t = new Ticket(101, "Vzg", "Tpg", "24-03-2023", "AC", pd);
		t.displayDetails();
		System.out.println(pd.toString());

	}
}
