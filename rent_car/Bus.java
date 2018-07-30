package rent_car;

public class Bus {
    private int num = 3;
    private String name = "大巴车";
    private int cost = 180;
    private int people = 20;

    public int getNum(){
        return num;
    }
    public String getName(){
        return name;
    }
    public int getCost(){
        return cost;
    }
    public int getPeople(){
        return people;
    }
    void show(){
        System.out.println(getNum()+"    "+getName()+"        "+getCost()+"(元/(车*天))"+"       "+"最多载"+getPeople()+"人");

    }
}
