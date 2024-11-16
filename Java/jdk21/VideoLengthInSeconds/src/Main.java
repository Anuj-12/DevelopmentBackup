//The time will be given in the format mm:ss
//Seconds can't be greater than 60
//Minutes can be greater than 99

public class Main {

    public static void main(String[] args) {

        String givenTime = "9999:60";
        int separation = givenTime.indexOf(':');
        int seconds1 = 0, seconds2 = 0;

        //Semi-colon ke baad wala seconds
        for(int i = givenTime.length() - 1; i > separation; i--){
            seconds1 += Integer.parseInt(Character.toString(givenTime.charAt(i))) * (int)Math.pow(10, (givenTime.length() - 1 - i));
        }

        //Semi-colon ke pehle wala minutes to seconds
        for(int j = separation - 1; j > 0; j--){
            seconds2 += Integer.parseInt(Character.toString(givenTime.charAt(j))) * 60 * (int)Math.pow(10, separation - j);
        }

        System.out.println(seconds1 + "\n" + seconds2);

        if(seconds1 > 60){
            return;
        }

        System.out.printf("%s (mm:ss) -> %d seconds", givenTime, seconds1 + seconds2);
    }
}
