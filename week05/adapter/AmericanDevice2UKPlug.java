public class AmericanDevice2UKPlug implements UKPlugInterface {
    private AmericanPlugInterface americanPlug; 

    public AmericanDevice2UKPlug(AmericanPlugInterface americanPlug) {
        this.americanPlug = americanPlug;
    }

    @Override
    public void provideUKPower(String powerSource) {
        americanPlug.provideAmericanPower(powerSource);
    }
}
