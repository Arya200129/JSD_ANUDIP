interface Bill {
    static void addToBill();
}

interface Travelling {
    void provideAccommodation();
}

interface Laundry {
    void provideLaundry();
}

abstract class RoomService{
	abstract void foodService();
	abstract void cleaning();
}

class Hotel implements Bill, Travelling, Laundry extends RoomService{
	void foodService(){
		System.out.println("This service provides a serving food to the customer");
		addToBill(500.0);
	}
	void cleaning(){
		System.out.println("Cleaning");
		addToBill(500.0);
	}

    public void provideAccommodation() {
        System.out.println("This service provides accommodation to the customer");
		addToBill(500.0);
    }

    public void provideLaundry() {
        System.out.println("This service provides laundry to the customer");
		addToBill(500.0);
    }
	
	public static void addToBill(double newBill){
		double totalBill;
		double hotelRoomcost = 5000;
		totalBill += hotelRoomcost;
		totalBill += newBill;
	}
	
    public static void main(String[] args) {
        HotelServices hotel = new HotelServices();
        hotel.provideMeal();
        hotel.provideAccommodation();
        hotel.provideLaundry();
    }
}