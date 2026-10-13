public class UKPower implements UKPlugInterface {

    @Override
    public void provideUKPower(String powerSource) {
        System.out.println("UK device getting UK power from " + powerSource);
    }
}
