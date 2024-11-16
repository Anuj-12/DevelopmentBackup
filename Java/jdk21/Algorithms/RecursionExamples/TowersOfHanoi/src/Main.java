public class Main {

    public static void main(String[] args) {
        TowersOfHanoi t = new TowersOfHanoi();
        //disk = total number of disks - 1 because the index starts with 0
        t.solve(63, 'A', 'B', 'C');
    }
}
