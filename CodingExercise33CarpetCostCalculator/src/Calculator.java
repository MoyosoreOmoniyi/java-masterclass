public class Calculator {

    private Floor floor;        // Field (which is also an object) floor of type Floor.
    private Carpet carpet;

    public Calculator(Floor floor, Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }

    public double getTotalCost (){
        return this.floor.getArea() * this.carpet.getCost();
    }
}
