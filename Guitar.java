public class Guitar extends Instruments {

    public Guitar(String keys,String strings,String drum) {
        super(keys,strings,drum);

    } public String printInfo() {
        return("Accordion Keys - " + getKeys() + "\n" + "Strings - " + getStrings() + "\n" + "Drums - " +getDrums() + "\n" ); } }