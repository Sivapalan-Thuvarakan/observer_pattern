package observer;

//reading news
public class ThrillerMovies implements Observer{
    @Override
    public void notifyObserver(String movie, String movie_type) {
        System.out.println("Movie_Type :"+movie_type+"and Movie:"+movie);
    }
}
