public class MountainBike extends Bicycle {
    // the MountainBike subclass adds one field
    public int seatHeight;

    // the MountainBike subclass has one constructor
    public MountainBike(int startHeight, 
                        int startCadence, 
                        int startSpeed, 
                        int startGear) {
        super(startCadence, startSpeed, startGear);
        seatHeight = startHeight;
    }

    // the MountainBike subclass adds one method
    public void setHeight(int newValue) {
        seatHeight = newValue;
    }

    public static void main(String[] args) {
        // obj is both an Object and a MountainBike (until such time as obj is assigned another 
        // object that is not a MountainBike). This is called implicit casting.
        Object obj = new MountainBike(0, 0, 0, 0);
        
        
        
        // if we write MountainBike myBike = obj
        // we would get a compile-time error because obj is not known to the compiler to be a MountainBike. 
        // However, we can tell the compiler that we promise to assign a MountainBike to obj by explicit casting:
        
        MountainBike myBike = (MountainBike) obj;
        // This cast inserts a runtime check that obj is assigned a MountainBike so that the compiler can safely assume that obj is a MountainBike. 
        // If obj is not a MountainBike at runtime, an exception will be thrown.
    }
}