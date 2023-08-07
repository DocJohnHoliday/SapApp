package Model;

public class Wood {

    private int woodBaseWeight;

    private int woodTierWeight;

    public Wood(int woodBaseWeight, int woodTierWeight) {
        this.woodBaseWeight = woodBaseWeight;
        this.woodTierWeight = woodTierWeight;
    }

    public Wood(int woodBaseWeight) {
        this.woodBaseWeight = woodBaseWeight;
    }


    public int getWoodBaseWeight() {
        return woodBaseWeight;
    }

    public int getWoodTierWeight() {
        return woodTierWeight;
    }
}

