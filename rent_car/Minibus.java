package rent_car;

public class Minibus  {
    private int num = 2;
    private String name = "面包车";
    private int cost = 65;
    private int people = 7;

    public int getNum(){

        return num;
    }
    public String getName(){

        return name;
    }
    public int getCost() {

        return cost;
    }
    public int getPeople(){

        return people;
    }
    void show(){
        System.out.println(getNum()+"    "+getName()+"        "+getCost()+"（元/(车*天))"+"        "+"最多载"+getPeople()+"人");
    }
}

