import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose your instrument");
        System.out.println("1 - Accordion");
        System.out.println("2 - Guitar");
        System.out.println("3 - Drums");
        int type = sc.nextInt();
        ArrayList<Instruments> instruments = new ArrayList<>();
        Accordion a = new Accordion("+", "+", "-");
        Guitar g = new Guitar("-", "+","-");
        Drumkit d = new Drumkit("-", "-", "+");
        int size = 0;
        int price = 0;
        if (type == 1) {
            System.out.println("Chosen instrument - Accordion");
            instruments.add(a);
            System.out.println("Choose your size : 20cm, 30cm, 40cm, 50cm");
            size = sc.nextInt();
            if(size==20) {
                price = 6;
                System.out.println("Price - " +price);
            } else if (size==30){
                price = 8;
                System.out.println("Price - " +price);
            } else if (size==40) {
                price = 10;
                System.out.println("Price - " +price);
            } else if (size==50){
                price = 12;
                System.out.println("Price - " +price);
            } else {
                System.out.println("Size is not available");
            }
            System.out.println("Accept your order, press 1 - agree, press 2 - decline");
            int o = sc.nextInt();
            if(o==1){
                System.out.println("Thank you!");
            } else {
                System.out.println("Come again!");
            }
        } else if (type == 2) {
            System.out.println("Chosen instrument - Guitar");
            instruments.add(g);
            System.out.println("Choose your size : 20cm, 30cm, 40cm, 50cm");
            size = sc.nextInt();
            if(size==20){
                price = 6;
                System.out.println("Price - " +price);
            } else if (size==30){
                price = 8;
                System.out.println("Price - " +price);
            } else if (size==40) {
                price = 10;
                System.out.println("Price - " +price);
            } else if (size==50){
                price = 12;
                System.out.println("Price - " +price);
            } else {
                System.out.println("Size is not available");
            }
            System.out.println("Accept your order, press 1 - agree, press 2 - decline");
            int o = sc.nextInt();
            if(o==1){
                System.out.println("Thanks!");
            } else {
                System.out.println("Come again!");
            }
        } else if (type == 3) {
            System.out.println("Chosen instrument - Drumkit");
            instruments.add(d);
            System.out.println("Choose your size : 20cm, 30cm, 40cm, 50cm");
            size = sc.nextInt();
            if(size==20){
                price = 6;
                System.out.println("Price - " +price);
            } else if (size==30){
                price = 8;
                System.out.println("Price - " +price);
            } else if (size==40) {
                price = 10;
                System.out.println("Price - " +price);
            } else if (size==50){
                price = 12;
                System.out.println("Price - " +price);
            } else {
                System.out.println("Size is not available");
            }
            System.out.println("Accept your order, press 1 - agree, press 2 - decline");
            int o = sc.nextInt();
            if(o==1){
                System.out.println("Thanks!");
            } else {
                System.out.println("Come again!");
            }
        } else {
            System.out.println("Error - you did something wrong, try again");
        }

        String str = "";
        for (Instruments instrument : instruments) {
            str += "Chosen instrument type!" + "\n";
            if (instrument instanceof Instruments) {
                str += "Accordion: " + ((Accordion) instrument).printInfo() + "\n";
            } else if (instrument instanceof Guitar) {
                str += "Guitar: " + ((Guitar) instrument).printInfo() + "\n";
            } else if (instrument instanceof Drumkit) {
                str += "Burrito: " + ((Drumkit) instrument).printInfo() + "\n";
            }
            str += "Choose your size : 20cm, 30cm, 40cm, 50cm" + "\n";
            price = 0;
            if (size == 20) {
                price = 6;
                str += "Price - " + price + "\n";
            } else if (size == 30) {
                price = 8;
                str += "Price - " + price + "\n";
            } else if (size == 40) {
                price = 10;
                str += "Price - " + price + "\n";
            } else if (size == 50) {
                price = 12;
                str += "Price - " + price + "\n";
            } else {
                str += "Size is not available" + "\n";
            }
            str += "Accept your order, press 1 - agree, press 2 - decline" + "\n";
            int o = sc.nextInt();
            if (o == 1) {
                str += "Thanks!" + "\n";
            } else {
                str += "Come again!" + "\n";
            }
        }
        System.out.println(str);
        try {
            FileWriter fw = new FileWriter("instruments.txt");
            fw.write(str);
            fw.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}