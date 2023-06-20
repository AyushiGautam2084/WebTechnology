interface Motor{
    int capacity=200;
    void run();
    void consume();
}
class WashingMachine implements Motor{
    public void run(){
        System.out.println("RUN METHOD");
        System.out.println("Capacity: " + capacity);
    }
    public void consume(){
        System.out.println("CONSUME METHOD");
        System.out.println("Capacity: "+ capacity);
    }
}
class Main{
    public static void main(String[] args) {
        WashingMachine ob=new WashingMachine();
        ob.consume();
        ob.run();
    }
}
