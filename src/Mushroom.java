public class Mushroom extends Item {

    enum Color {
        Red, Green
    }

    Color mushroomColor;

    public Mushroom(String name) {
        this.setName(name);
    }

    public Mushroom(int i) {
        this.setName(name);
    }

    protected String color;

    public void setColor(Color c) {
        this.mushroomColor = c;
    }

    public String getColor() {
        return this.color;
    }

    public Mushroom(Color c) {
        this.name = "Mushroom";
        this.color = "Red";
    }

    @Override
    public void show() {
        setAppear(true);
        System.out.printf("\nBlock is cracked! %s %s is appearing!\n", this.color, this.name);
        if (this.color.equals("Green")) {
            System.out.println("1-up mushroom!");
        } else if (this.color.equals("Red")) {
            System.out.println("Super mushroom!");
        } else {
            System.out.println("not macthed color!");
        }
    }

    /**
     * @param distance in coordinate x,y
     */
    public void run(int[] distance) {
        if (getAppear()) {
            int[] currentLocation = getLocation();
            System.out.println(this.name + " is at location " + currentLocation[0] + "," + currentLocation[1]);
            System.out.println(this.name + " is moving...........");
            currentLocation[0] = currentLocation[0] + distance[0];
            currentLocation[1] = currentLocation[1] - distance[1];
            setLocation(currentLocation);
            System.out.println(this.name + " is at location" + currentLocation[0] + "," + currentLocation[1]);
        } else {
            System.out.println(this.name + " is disappear!");
        }
    }
}
