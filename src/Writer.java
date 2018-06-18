public class Writer {
    public CD currentCd;

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

    public void burn(String[] newTracks){
        this.currentCd.setTracks(newTracks);
    }
}
