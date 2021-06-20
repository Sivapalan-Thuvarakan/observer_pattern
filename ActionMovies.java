package observer;

//reading news
public class ActionMovies implements Observer{
    @Override
    public void notifyObserver(String movie, String movie_type) {
        System.out.println("Movie_Type :"+movie_type+"and Movie:"+movie);
    }
}
