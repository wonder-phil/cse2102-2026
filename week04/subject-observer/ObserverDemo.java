public class ObserverDemo {

    public static void main(String[] args) {
        NewsAgency agency = new NewsAgency();

        Observer cnn = new NewsChannel("CNN");
        Observer bbc = new NewsChannel("BBC");
        Observer fox = new NewsChannel("Fox");

        agency.attach(cnn);
        agency.attach(bbc);
        agency.attach(fox);

        agency.breakingNews("New technology breakthrough!");
        agency.breakingNews("Elections coming soon...");

        agency.detach(cnn);

        agency.breakingNews("Sports team wins championship!");
    }
}
