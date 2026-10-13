class AmericanDevice implements AmericanPlugInterface {

    @Override
    public void provideAmericanPower(String powerSource) {
        System.out.println("American device getting American power from " + powerSource);
    }

}
