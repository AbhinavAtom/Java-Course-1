public enum Level {
    HIGH(3),
    MEDIUM(2),
    LOW(1);

    private int lvlNum;
    private Level(int num){
        this.lvlNum = num;
    }

    //main method
    public static void main(String[] args) {
        Level lvl = Level.LOW;

        System.out.println(Level.values());

        Level[] arr = Level.values();
        for(Level e : arr){
            System.out.println(e);
        }

        if(lvl == Level.LOW)
            System.out.println(lvl);
        else if(lvl == Level.MEDIUM)
            System.out.println(lvl);
        else 
            System.out.println(lvl);
    }   
}

