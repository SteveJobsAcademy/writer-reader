public class Main {

    public static void main(String[] args) {

        String[] songs = {"Azzurro", "Margherita", "Rosso fuoco", "Pazzia", "Somebody to love"};

        String[] songs2 = {"Bella Ciao", "Rosso relativo", "Infermiera di notta", "Pazzia", "Somebody to love"};

        CD cd1 = new CD("X il mio amore", songs, false);

        CD cd2 = new CD("X mia nonna", songs2, true);

        Reader r = new Reader();

        r.setCurrentCd(cd1);
        r.removeCD();
        r.setCurrentCd(cd2);

        String x = r.playSong(2);

        System.out.println("x:" + x);
        System.out.println(r.getCurrentCd().cdName);

        String[] gigidalessio = {"Non dirmi mai", "Miele", "Campioni del cuore","Basta"};

        Writer w = new Writer();

        w.setCurrentCd(cd2);
        w.burn(gigidalessio);
        w.removeCD();
        //CD cd3 = w.getCurrentCd();

        r.removeCD();
        r.setCurrentCd(cd2);
        System.out.println(r.playSong(0));

        w.setCurrentCd(cd1);
        w.burn(gigidalessio);

        r.removeCD();
        r.setCurrentCd(cd1);
        System.out.println(r.playSong(0));





    }
}
