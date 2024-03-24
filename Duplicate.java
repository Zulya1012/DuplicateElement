public class Duplicate {

    public static void main(String[] args) {
        String[] array = {"monday", "friday", "thursday", "monday", "saturday", "sunday", "saturday"};  
        for (int i = 0; i < array.length-1; i++) {
            for (int j = i+1; j < array.length; j++) {
               if ((array[i].equals(array[j])) && (i != j)) {
                 System.out.println("Duplicate  : " + array[j]);
                }
            }
        }
    }    
}