package rent_car;

public class LowCar {
    private int num = 4;
    private String name = "低栏车";
    private int cost = 30;
    private double load = 1.5;

    public int getNum(){
        return num;
    }
    public String getName(){
        return name;
    }
    public int getCost(){
        return cost;
    }
    public double getLoad(){
        return load;
    }
    void show(){
        System.out.println(getNum()+"    "+getName()+"        "+getCost()+"(元/(车*天))"+"                         "+"最多载"+getLoad()+"吨");

    }
}


