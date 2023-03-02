public class Item {
    protected String name;
    protected boolean appear;
    protected int[] location = new int[] { 10, 10 }; // {x,y}

    public Item() {
        this.name = "Item";
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAppear(boolean appear) {
        this.appear = appear;
        if (appear) {
            System.out.printf("\nSet %s to appear!", this.name);
        } else {
            System.out.printf("\nSet %s to disappear!", this.name);
        }
    }

    public void setLocation(int[] location) {
        this.location = location;
    }

    public String getName() {
        return this.name;
    }

    public boolean getAppear() {
        return this.appear;
    }

    public int[] getLocation() {
        return this.location;
    }

    public void show() {
        this.appear = true;
        System.out.printf("\nBlock is cracked! %s is appearing!", this.name);
    }

    /**
     * @param distance in coordinate x,y
     */
    public void run(int[] distance) {
        if (getAppear()) {
            System.out.println("Item is moving...");
            int[] currentLocation = getLocation();
            currentLocation[0] = currentLocation[0] + distance[0];
            currentLocation[1] = currentLocation[1] + distance[1];
            this.location = currentLocation;
            System.out.println("Item is at location" + currentLocation[0] + "," + currentLocation[1]);
        } else {
            System.out.println("Item is disappear!");
        }
    }
}
