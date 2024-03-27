package Model;

public class Part {

    private final int partId;
    private final String partName;
    private final int partWeight;
    private final int partWidth;
    private final int partHeight;

    public Part(int partId, String partName, int partWeight, int partWidth, int partHeight) {
        this.partId = partId;
        this.partName =partName;
        this.partWeight = partWeight;
        this.partWidth = partWidth;
        this.partHeight = partHeight;
    }


    public int getPartId() {
        return partId;
    }

    public String getPartName() {
        return partName;
    }

    public int getPartWeight() {
        return partWeight;
    }

    public int getPartWidth() {
        return partWidth;
    }

    public int getPartHeight() {
        return partHeight;
    }

    @Override
    public String toString() {
        return (partName);
    }
}

