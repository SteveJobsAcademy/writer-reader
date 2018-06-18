public class Reader {

    private CD currentCd;

    public void setCurrentCd(CD cd) {
        if (this.currentCd != null){
            return;
        }
        this.currentCd = cd;
    }

    public void removeCD(){
        this.currentCd = null;
    }

    public CD getCurrentCd() {
        return this.currentCd;
    }

    public String playSong(int track) {
        return this.currentCd.getTracks()[track];
    }

}
