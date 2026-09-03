class Good implements Details {

    private double val;

    public static void main(String[] args) {
        Good g = new Good();
        g.setValue(-999);
        System.out.println("value = " + g.getValue());
    }


    Good() { val = 0; }

    @Override 
    public double getValue() {
        return val;
    }

    @Override 
    public void setValue(double d) {
        val = d;
    }
   
}