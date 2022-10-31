package personal;

public class DealingWithEmotions {
    public enum EMOTIONS{
        WORRIED,
        MISGUIDED,
        TIRED,
    }
    public static void main(String[] args) {
        System.out.println(whatToDo(EMOTIONS.TIRED));
    }
    public static String whatToDo(EMOTIONS you){
        switch (you){
            case WORRIED:
                return "pray";
            case MISGUIDED:
                return "read quran";
            case TIRED:
                return "drink coffee :)";
            default:
                return "keep going ;)";
        }
    }
}
