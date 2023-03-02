public class Starman extends Item {

    public Starman() {
        this.name = "Starman";
    }

    public void show() {
        setAppear(true);
        System.out.printf("\nBlock is cracked! %s is appearing!", this.name);
    }

    /**
     * @param distance in coordinate x,y
     */
    public void run(int[] distance) {
        if (getAppear()) {
            int[] currentLocation = getLocation();
            System.out.println(this.name + "is at location " + currentLocation[0] + "," + currentLocation[1]);
            System.out.println(this.name + "is Jumping!");
            currentLocation[0] = currentLocation[0] + distance[0];
            currentLocation[1] = currentLocation[1] + distance[1];
            setLocation(currentLocation);
            System.out.println(this.name + " is at location" + currentLocation[0] + "," + currentLocation[1]);
        } else {
            System.out.println(this.name + " is disappear!");
        }
    }
}
