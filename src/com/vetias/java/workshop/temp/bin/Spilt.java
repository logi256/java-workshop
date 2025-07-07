public class Spilt {

    public static void main(String[] ar) {
        String sentence = "this program shows how can we split a "+"string into multiple strings. we need to find sentences in a string and split them into multiple strings,word and letter counts are also important in this program";
        String[] sentences = sentence.split("\\." );
        System.out.println("Total sentences: " + sentences.length);
        String[] words = sentence.split(" ");
        System.out.println("Total words: " + words.length);
        String[] chars = sentence.split("");
        System.out.println("Total chars: " + chars.length);
        }
    

    }
