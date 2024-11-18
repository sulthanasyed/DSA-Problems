public class Solution {
    public static String braveAndMice(String animal) {
        if(animal.toLowerCase().equals("Mouse".toLowerCase()))
            return "Hide";
        else
            return "Walk";
    }

    public static void main(String[] args) {
        String animal = "Dog";
        assert braveAndMice(animal).equals("Walk") : "Expect \"Walk\" for animal=\"Dog\"";
        animal = "Mouse";
        assert braveAndMice(animal).equals("Hide") : "Expect \"Hide\" for animal=\"Mouse\"";
        System.out.println("All test cases in main function passed");
    }
}
