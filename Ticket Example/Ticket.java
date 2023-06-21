package collectionsPract;

public class Ticket {
	int trainNo;
	String srcStation, destStation, travelDate, ticketClass;

	// ArrayList<Passenger> passDetails = new ArrayList<>();
	//
	// public Ticket(int trainNo, String srcStation, String destStation, String travelDate, String ticketClass,
	// ArrayList<Passenger> passDetails) {
	// this.trainNo = trainNo;
	// this.srcStation = srcStation;
	// this.destStation = destStation;
	// this.travelDate = travelDate;
	// this.ticketClass = ticketClass;
	// this.passDetails = passDetails;
	// }

	PassengerDetails passDetails = new PassengerDetails();

	public Ticket(int trainNo, String srcStation, String destStation, String travelDate, String ticketClass,
			PassengerDetails passDetails) {
		this.trainNo = trainNo;
		this.srcStation = srcStation;
		this.destStation = destStation;
		this.travelDate = travelDate;
		this.ticketClass = ticketClass;
		this.passDetails = passDetails;
	}

	// Passenger passDetails[];
	//
	// public Ticket(int trainNo, String srcStation, String destStation, String travelDate, String ticketClass,
	// Passenger[] passDetails) {
	// super();
	// this.trainNo = trainNo;
	// this.srcStation = srcStation;
	// this.destStation = destStation;
	// this.travelDate = travelDate;
	// this.ticketClass = ticketClass;
	// this.passDetails = passDetails;
	// }

	public void displayDetails() {
		System.out.println("Train no : " + trainNo);
		System.out.println("Train source : " + srcStation);
		System.out.println("Train destination : " + destStation);
		System.out.println("Travel Date : " + travelDate);
		System.out.println("Ticket Class : " + ticketClass);
		System.out.println("Passenger Details : ");
		for (Passenger p : passDetails)
			System.out.println(
					p.getName() + " " + p.getAge() + " " + p.getGender() + " " + p.getPrefBerth() + " " + p.ticketCost);
	}

}
