class MovieTicket {
    //Implement your code here 
    private int movieId;
    private int noOfSeats;
    private double costPerTicket;
    public MovieTicket(int movieId,int noOfSeats){
        this.movieId=movieId;
        this.noOfSeats=noOfSeats;
    }
    // Method to calculate total amount
    public double calculateTotalAmount() {
        // Set costPerTicket based on movieId
        // (Use the mapping given in your question/table.
        // I'm using 111→7.0, 112→8.0, 113→8.5 as an example.)
        if (movieId == 111) {
            costPerTicket = 7.0;
        } else if (movieId == 112) {
            costPerTicket = 8.0;
        } else if (movieId == 113) {
            costPerTicket = 8.5;
        } else {
            // Invalid movieId
            return 0;
        }

        // Calculate basic total
        double total = costPerTicket * noOfSeats;

        // Apply 2% tax
        total = total + (total * 0.02);  // or total *= 1.02;

        // Round off and return
        return Math.round(total);
    }
    public void setMovieId(int movieId){
        this.movieId=movieId;
    }
    public int getMovieId(){
        return movieId;
    }
    public void setNoOfSeats(int noOfSeats){
        this.noOfSeats=noOfSeats;
    }
    public int getNoOfSeats(){
        return noOfSeats;
    }
     public void setCostPerTicket(double costPerTicket){
        this.costPerTicket=costPerTicket;
    }
     public double getCostPerTicket(){
        return costPerTicket;
    }
    
}


class Tester {
    public static void main(String[] args) {
        MovieTicket movieTicket = new MovieTicket(112, 3);
        double amount = movieTicket.calculateTotalAmount();
        if (amount==0)
            System.out.println("Sorry! Please enter valid movie Id and number of seats");
        else
            System.out.println("Total amount for booking : $" + amount);
    }
}