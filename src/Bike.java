public class Bike {
    public String brand;
    protected String name;
    private String type;

    Bike() {
    }

    Bike(String brand, String name) {
        this.brand = brand;
        this.name = name;
        this.type = "bike";
    }
        public void setType(String type){
            this.type = type;

        }
        public void printInfo(){
            System.out.println("brand: " + this.brand + ", name: " + this.name + ", type: " + this.type);
        }
}

