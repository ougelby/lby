package rent_car;

public class Van {
        private int num = 6;
        private String name = "厢式车";
        private int cost = 80;
        private double load = 4.5;

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




