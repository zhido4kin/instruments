public class Accordion extends Instruments {

    public Accordion(String keys,String strings,String drums) {
        super(keys,strings,drums);

    }
    public String printInfo(){
        return("Accordion Keys - " + getKeys() + "\n" + "Strings - " + getStrings() + "\n" + "Drums - " +getDrums() + "\n" ); } }