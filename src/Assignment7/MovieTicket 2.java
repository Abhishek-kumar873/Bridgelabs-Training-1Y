package Assignment7;
class MovieTicket {
    String movieName;
    int seatNumber;
    double price;
    MovieTicket(String movieName, int seatNumber, double price) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
    }
    void bookTicket() {
        price += 50; // booking charge
        System.out.println("Ticket booked successfully!");
    }
    void display() {
        System.out.println("Movie: " + movieName);
        System.out.println("Seat No: " + seatNumber);
        System.out.println("Price: " + price);
    }
    public static void main(String[] args) {
        MovieTicket t = new MovieTicket("name", 12, 200);
        t.bookTicket();
        t.display();
    }
}