package observer;

//reading news
public class RomanceMovies implements Observer{
    @Override
    public void notifyObserver(String movie, String movie_type)
    {
        System.out.println("Movie_Type :"+movie_type+"and Movie:"+movie);
    }
}
