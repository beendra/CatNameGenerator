import java.util.Scanner;

public class NameGenerator {
    public static void main(String[] args) {
        System.out.println("Cat Name Generator");

        Scanner keyboardReader = new Scanner(System.in);

        System.out.println("What is the first letter of your first name?");

        String firstLetter = keyboardReader.nextLine();

        System.out.println("What month were you born?");

        String birthMonth = keyboardReader.nextLine();

        String part = "";
        String part2 = "";

        if (firstLetter.equalsIgnoreCase("A")){
            part = "Angel";
        }
        if (firstLetter.equalsIgnoreCase("B")){
            part = "Paws";
        }
        if (firstLetter.equalsIgnoreCase("C")){
            part = "Puss";
        }
        if (firstLetter.equalsIgnoreCase("D")){
            part = "Mister";
        }
        if (firstLetter.equalsIgnoreCase("E")){
            part = "Fluffy";
        }
        if (firstLetter.equalsIgnoreCase("F")){
            part = "Mittens";
        }
        if (firstLetter.equalsIgnoreCase("G")){
            part = "Baby";
        }
        if (firstLetter.equalsIgnoreCase("H")){
            part = "Pancake";
        }
        if (firstLetter.equalsIgnoreCase("I")){
            part = "Muffin";
        }
        if (firstLetter.equalsIgnoreCase("J")){
            part = "Lewis";
        }
        if (firstLetter.equalsIgnoreCase("K")){
            part = "Snuffles";
        }
        if (firstLetter.equalsIgnoreCase("L")){
            part = "Bucky";
        }
        if (firstLetter.equalsIgnoreCase("M")){
            part = "Wild";
        }
        if (firstLetter.equalsIgnoreCase("N")){
            part = "Strawberry";
        }
        if (firstLetter.equalsIgnoreCase("O")){
            part = "Maggie";
        }
        if (firstLetter.equalsIgnoreCase("P")){
            part = "Noodle";
        }
        if (firstLetter.equalsIgnoreCase("Q")){
            part = "Roland";
        }
        if (firstLetter.equalsIgnoreCase("R")){
            part = "George";
        }
        if (firstLetter.equalsIgnoreCase("S")){
            part = "Brutus";
        }
        if (firstLetter.equalsIgnoreCase("T")){
            part = "Trout";
        }
        if (firstLetter.equalsIgnoreCase("U")){
            part = "Angus";
        }
        if (firstLetter.equalsIgnoreCase("V")){
            part = "Bubbles";
        }
        if (firstLetter.equalsIgnoreCase("W")){
            part = "Hank";
        }
        if (firstLetter.equalsIgnoreCase("X")){
            part = "Biscuit";
        }
        if (firstLetter.equalsIgnoreCase("Y")){
            part = "General";
        }
        if (firstLetter.equalsIgnoreCase("Z")){
            part = "Major";
        }


        if (birthMonth.equalsIgnoreCase("January")){
            part2 = "Banana";
        }
        if (birthMonth.equalsIgnoreCase("February")){
            part2 = "Snookums";
        }
        if (birthMonth.equalsIgnoreCase("March")){
            part2 = "Floof";
        }
        if (birthMonth.equalsIgnoreCase("April")){
            part2 = "Esquire";
        }
        if (birthMonth.equalsIgnoreCase("May")){
            part2 = "Disaster";
        }
        if (birthMonth.equalsIgnoreCase("June")){
            part2 = "Ballyhoo";
        }
        if (birthMonth.equalsIgnoreCase("July")){
            part2 = "Mouser";
        }
        if (birthMonth.equalsIgnoreCase("August")){
            part2 = "Meowser";
        }
        if (birthMonth.equalsIgnoreCase("September")){
            part2 = "Boots";
        }
        if (birthMonth.equalsIgnoreCase("October")){
            part2 = "Patootie";
        }
        if (birthMonth.equalsIgnoreCase("November")){
            part2 = "Gizmo";
        }
        if (birthMonth.equalsIgnoreCase("December")){
            part2 = "the Destroyer";
        }

        String catName = part + " " + part2;

        System.out.println("Your cat name is: " + catName);


    }
}
