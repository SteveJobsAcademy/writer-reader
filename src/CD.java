public class CD {
    public String cdName;
    private String[] tracks;
    private boolean RW;

    public CD(String cdName, String[] param, boolean rw){
        this.cdName = cdName;
        this.tracks = param;
        this.RW = rw;
    }


    public String[] getTracks(){
        return this.tracks;
    }

    public void setTracks(String[] newTracks) {
        if (this.RW == true) {
            this.tracks = newTracks;
        } else {
            System.err.println("Cd non riscrivobile");
        }
    }
}
