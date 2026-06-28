static class Singleton {
    private String val;
    private static Singleton uniqueInstance = null;
    private Singleton() {
        val = "";
    }

    public static Singleton getInstance() {
        if(uniqueInstance == null)
            uniqueInstance = new Singleton();
        return uniqueInstance;
    }

    public String getValue() {
        return val;
    }

    public void setValue(String value) {
        this.val = value;
    }
    
}
