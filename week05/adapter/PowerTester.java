public class PowerTester {
    public static void main(String[] args) {
        AmericanDevice americanDevice = new AmericanDevice();
        UKDevice ukDevice = new UKDevice();
        AmericanDevice2UKPlug adapter = new AmericanDevice2UKPlug(americanDevice);

        adapter.provideUKPower("UK Power Source");
    }
}
