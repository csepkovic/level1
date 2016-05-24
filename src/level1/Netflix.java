package level1;

public class Netflix {
public static void main(String[] args) {
	Movie BacktotheFuture = new Movie ("Back to The Future", 5);
	Movie Twilight = new Movie ("Twilight", 1);
	Movie IAmLegend = new Movie ("I Am Legend", 3);
	Movie Avengers = new Movie ("The Avengers", 4);
	Movie BatmanVSuperman = new Movie ("Batman V Superman", 2);
	System.out.println(BacktotheFuture.getTicketPrice());
	NetflixQueue Queue = new NetflixQueue ();
	Queue.addMovie(BacktotheFuture);
	Queue.addMovie(Avengers);
	Queue.addMovie(IAmLegend);
	Queue.sortMoviesByRating();
	Queue.printMovies();
	System.out.println("The best movie is " + Queue.getBestMovie());
	System.out.println("The second best movie is " + Queue.getMovie(1));
}
}
