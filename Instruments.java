public class Instruments {
    private String keys;
    private String strings;
    private String drums;

    private int size;
    public Instruments(String keys, String strings, String drums)
    { this.keys = keys; this.strings = strings; this.drums = drums; }
    public String getKeys() {
        return keys; }
    public void setKeys(String keys)
    { this.keys = keys;}
    public String getStrings()
    { return strings; }
    public void setStrings(String strings)
    { this.strings = strings; }
    public String getDrums() {
        return drums; }
    public void setDrums(){
        this.drums = drums;
    }



    public int getSize()
    { return size;
    } public void setSize(int size) { this.size = size;
    } public String printInfo() { return(" "); } }