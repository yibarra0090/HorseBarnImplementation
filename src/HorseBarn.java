public class HorseBarn {
    private Horse[] spaces;
    public HorseBarn(Horse[] spaces){
        this.spaces = spaces;
    }

    public int findHorse(String name){
        for (int i = 0; i < this.spaces.length; i++) {
            if (this.spaces[i]!=null && name.equals(this.spaces[i].getName())) {
                return i;
            }
        }
        return -1;
    }
    public void consolidate() {
    }
}
