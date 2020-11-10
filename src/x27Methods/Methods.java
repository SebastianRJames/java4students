package x27Methods;
public class Methods {
    public static void main(String[] args) {
            // aMethod();
            ruleTheWorld();
            rollTheDice();
            chorusBells();
            wickedWind();
            chorusBells();
            ohohoh();
            chorusBells();
    }
    private static void aMethod(){
        System.out.println("Say hello");
        System.out.println("Say goodbye");
    }
    /*    Task
    Display the song Viva La Vida with each verse and the chorus
    as a method. Use as few different commands as possible to display the
    entire song
     */
    private static void ruleTheWorld(){
        System.out.print("I used to rule the world \nSeas would rise when I gave the word \nNow in the morning, I sleep alone\nSweep the streets I used to own\n\n");
    }
    private static void rollTheDice(){
        System.out.print("I used to roll the dice\n" +
                "Feel the fear in my enemy's eyes\n" +
                "Listen as the crowd would sing\n" +
                "Now the old king is dead! Long live the king!\n\n");
    }
    private static void heldTheKey(){
        System.out.print("One minute I held the key\n" +
                "Next the walls were closed on me\n" +
                "And I discovered that my castles stand\n" +
                "Upon pillars of salt and pillars of sand\n\n");
    }
    private static void chorusBells(){
        System.out.print("I hear Jerusalem bells are ringing\n" +
                "Roman Cavalry choirs are singing\n" +
                "Be my mirror, my sword and shield\n" +
                "My missionaries in a foreign field\n" +
                "For some reason I can't explain\n" +
                "Once you go there was never, never an honest word\n" +
                "And that was when I ruled the world\n\n");
    }
    private static void wickedWind(){
        System.out.print("It was a wicked and wild wind\n" +
                "Blew down the doors to let me in\n" +
                "Shattered windows and the sound of drums\n" +
                "People couldn't believe what I'd become\n\n");
    }
    private static void revolutionaries(){
        System.out.print("Revolutionaries wait\n" +
                "For my head on a silver plate\n" +
                "Just a puppet on a lonely string\n" +
                "Oh, who would ever want to be king?\n\n");
    }
    private static void ohohoh(){
        System.out.print("Oh, oh, oh, oh, oh\n" +
                "Oh, oh, oh, oh, oh\n" +
                "Oh, oh, oh, oh, oh\n" +
                "Oh, oh, oh, oh, oh\n" +
                "Oh, oh, oh, oh, oh\n\n");
    }



    private static void extension(){

    }
    private static void verse1(){
        System.out.printf("\nI used to rule the world,\nSeas would rise when I gave the word ,\nNow in the morning, I sleep alone ,\nSweep the streets I used to own ,\nI used to roll the dice ,\nFeel the fear in my enemys eyes ,\nListen as the crowd would sing ,\nNow the old king is dead! Long live the king! ,\nOne minute I held the key ,\nNext the walls were closed on me ,\nAnd I discovered that my castles stand ,\nUpon pillars of salt and pillars of sand");
    }
    private static void chorus() {
        System.out.printf("\n\nI hear Jerusalem bells are ringing ,\nRoman Cavalry choirs are singing,\nBe my mirror, my sword and shield,\nMy missionaries in a foreign field,\nFor some reason I can't explain,\nOnce you go there was never, never an honest word,\nAnd that was when I ruled the world,\n");
    }
    private static void verse2() {
        System.out.printf("\nIt was a wicked and wild wind,\nBlew down the doors to let me in,\nShattered windows and the sound of drums,\nPeople couldn't believe what I'd become,\nRevolutionaries wait,\nFor my head on a silver plate,\nJust a puppet on a lonely string,\nOh, who would ever want to be king?");
    }
    private static void oh(){
        System.out.printf(",\nOh, oh, oh, oh, oh" +
                ",\nOh, oh, oh, oh, oh" +
                ",\nOh, oh, oh, oh, oh" +
                ",\nOh, oh, oh, oh, oh" +
                ",\nOh, oh, oh, oh, oh");
    }
}
