package rent_car;

public class Car {
    private int num = 1;
    private String name = "小轿车";
    private int cost = 40;
    private int people = 4;

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
        System.out.println(getNum()+"    "+getName()+"        "+getCost()+"（元/(车*天))"+"        "+"最多载"+getPeople()+"人");
    }
}
