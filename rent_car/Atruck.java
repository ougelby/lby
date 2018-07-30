package rent_car;

public class Atruck {
    private int num = 8;
    private String name = "美式皮卡车";
    private int cost = 60;
    private int people = 2;
    private double load = 3;

    public int getNum(){
        return num;
    }
    public String getName(){
        return name;
    }
    public int getCost(){
        return cost;
    }
    public int getPeople() {
        return people;
    }
    public double getLoad(){
        return load;
    }
    void show(){
        System.out.println(getNum()+"    "+getName()+"    "+getCost()+"(元/(车*天))"+"         "+"最多载"+getPeople()+"人"+"        "+"最多载"+getLoad()+"吨");

    }
}
