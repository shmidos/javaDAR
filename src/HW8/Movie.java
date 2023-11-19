package HW8;

public class Movie {
    public String title;
    public String studio;
    public String rating;
    public Movie(String title, String studio, String rating) {
        this.title = title;
        this.studio = studio;
        this.rating = rating;
    }
    public Movie(String title, String studio) {
        this.title = title;
        this.studio = studio;
        this.rating = rating;
    }
    public static void main(String[] args) {
        Movie myMovie = new Movie("Deadpool", "Marvel", "5");
        Movie myMovie2 = new Movie("Venom", "Marvel", "5");

        Movie MyMovie3 = new Movie("Фокус", "RatPac-Dune Entertainment", "R");
        Movie MyMovie4 = new Movie("Главный герой", "20th Century Studios");

        myMovie.displayMovieInfo();
        myMovie2.displayMovieInfo();
        MyMovie3.displayMovieInfo();
        MyMovie4.displayMovieInfo();
    }
    public void displayMovieInfo() {
        System.out.println("Title: " + title);
        System.out.println("Studio: " + studio);
        System.out.println("Rating: " + rating);
        System.out.println();
    }
}
