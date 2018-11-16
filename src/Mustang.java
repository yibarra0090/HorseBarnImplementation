public class Mustang implements Horse{
    private String name;
    private double weight;

    public Mustang(String name, double weight){
        this.name = name;
        this.weight = weight;
    }

    public String getName(){
        return this.name;
    }

    public double getWeight(){
        return this.weight;
    }

    public String toString(){
        return this.getName();
    }
}