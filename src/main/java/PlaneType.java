public enum PlaneType {

    BOEING747(700, 500),
    BOEING347(300, 200),
    BOEING247(200, 100);

    private final int capacity;
    private final int weight;


    PlaneType(int capacity, int weight) {
        this.capacity = capacity;
        this.weight = weight;


    }



}

