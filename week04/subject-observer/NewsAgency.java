import java.util.ArrayList;
import java.util.List;

class NewsAgency implements Subject {
    
    private final List<Observer> observers = new ArrayList<>();

    @Override
    public void attach(Observer o) {
        observers.add(o);
    }

    @Override
    public void detach(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer o : observers) {
            o.update(message);
        }
    }

    // A method that changes state
    public void breakingNews(String news) {
        System.out.println("NewsAgency publishes: " + news);
        notifyObservers(news);
    }
}