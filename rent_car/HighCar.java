package rent_car;

public class HighCar {
        private int num = 5;
        private String name = "高栏车";
        private int cost = 47;
        private double load = 2.5;

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




