public class Spilt {

    public static void main(String[] args) {
        String sentence = "this program shows how can we split a string into multiple string";
        String[] words = sentence.split(" ");
        for (String word : words) {
            String upperWord = word.toUpperCase();
            System.out.println(upperWord);
        }
    }

}
