package U6T3_Lab1;

public class j {
    public static void main(String[] args) {
        String[] strings5 = {"HELLO", "Halo", "Adam", "what", "booyAH", "WHY?"};
        String[] lower = ArrayAlgorithms.makeLowercase(strings5);
        for (String str : lower) {
            System.out.print(str + " ");
        }
        System.out.println("\n\noriginal array not modified:");
        for (String str : strings5) {
            System.out.print(str + " ");
        }
        System.out.println();
    
    }
}
