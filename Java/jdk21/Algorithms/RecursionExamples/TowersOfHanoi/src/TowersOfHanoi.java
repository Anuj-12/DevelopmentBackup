public class TowersOfHanoi {

    public void solve(int disk, char source, char middle, char destination){

        if(disk == 0){
            System.out.println("Plate " + disk + " from " + source + " to " +  destination);
            return;
        }

        //Move n-1 plates to the middle - to be able to move the largest plate
        solve(disk-1, source, destination, middle);
        System.out.println("Plate " + disk + " from " + source + " destination");
        //Move the largest plate to the destination
        solve(disk-1, source, middle, destination);
    }
}
