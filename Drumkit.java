public class Drumkit extends Instruments {
    public Drumkit(String keys,String strings,String drum) {
        super(keys,strings,drum);

    } public String printInfo() {
        return("Accordion Keys - " + getKeys() + "\n" + "Strings - " + getStrings() + "\n" + "Drums - " +getDrums() + "\n" ); } }
