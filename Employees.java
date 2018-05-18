package Lab4;

import java.util.ArrayList;
import java.util.Collections;

public class Employees{
    private ArrayList<HockeyPlayer> hockeyPlayers;
    private ArrayList<Professor> professors;
    private ArrayList<Parent> parents;
    private ArrayList<GasStationAttendant> attendantArrayLists;

    // constructor
    // - initialize 5 arraylists with instances
    public Employees() {
        hockeyPlayers = new ArrayList<>();
        hockeyPlayers.add(new HockeyPlayer("Wayne Gretzky", 894));
        hockeyPlayers.add(new HockeyPlayer("Who Ever",0));
        hockeyPlayers.add(new HockeyPlayer("Brent Gretzky",1));
        hockeyPlayers.add(new HockeyPlayer("Pavel Bure",437));
        hockeyPlayers.add(new HockeyPlayer("Jason Bourne",0));

        professors = new ArrayList<>();
        professors.add(new Professor("Albert Einstein", "Physics"));
        professors.add(new Professor("Alan Turing","Computer Systems"));
        professors.add(new Professor("Richard Feynman","Physics"));
        professors.add(new Professor("Tim Berners-Lee","Computer Systems"));
        professors.add(new Professor("Kurt Godel","Logic"));

        parents = new ArrayList<>();
        parents.add(new Parent("Tiger Woods", 1));
        parents.add(new Parent("Super Mom",168));
        parents.add(new Parent("Lazy Larry",20));
        parents.add(new Parent("Ex Hausted",168));
        parents.add(new Parent("Super Dad",167));

        attendantArrayLists = new ArrayList<>();
        attendantArrayLists.add(new GasStationAttendant("Joe Smith", 10));
        attendantArrayLists.add(new GasStationAttendant("Tony Baloney",100));
        attendantArrayLists.add(new GasStationAttendant("Benjamin Franklin",100));
        attendantArrayLists.add(new GasStationAttendant("Mary Fairy",101));
        attendantArrayLists.add(new GasStationAttendant("Bee See",1));

    }

    // displayAllEmployeesLists
    public void displayAllEmployeesLists() {
        for (int i = 0; i < hockeyPlayers.size(); i++) {
            String str = String.format("%-25s", "HockeyPlayer");
            String str2 = String.format("%-20s", hockeyPlayers.get(i).getName());
            String str3 = String.format("%1s", "scored " + ((HockeyPlayer) hockeyPlayers.get(i)).getNumberOfGoals()) + " scored";
            System.out.print(str);
            System.out.print(str2);
            System.out.println(str3);
        }

        System.out.println("");

        for (int i = 0; i < professors.size(); i++) {
            String str = String.format("%-25s", "Professor");
            String str2 = String.format("%-20s", professors.get(i).getName());
            String str3 = String.format("%1s", "teaches " + ((Professor) professors.get(i)).getTeachingMajor());
            System.out.print(str);
            System.out.print(str2);
            System.out.println(str3);
        }

        System.out.println("");

        for (int i = 0; i < parents.size(); i++) {
            String str = String.format("%-25s", "Parent");
            String str2 = String.format("%-20s", parents.get(i).getName());
            String str3 = String.format("%1s", "spends " + ((Parent) parents.get(i)).getNumberOfHoursSpentPerWeekWithKids())
                    + " hour/week with kids";
            System.out.print(str);
            System.out.print(str2);
            System.out.println(str3);
        }

        System.out.println("");

        for (int i = 0; i < attendantArrayLists.size(); i++) {
            String str = String.format("%-25s", "GasStationAttendant");
            String str2 = String.format("%-20s", attendantArrayLists.get(i).getName());
            String str3 = String.format("%1s", "steals " + ((GasStationAttendant) attendantArrayLists.get(i)).getNumberOfDollarsStolenPerDay())
                    + " dollars a day";
            System.out.print(str);
            System.out.print(str2);
            System.out.println(str3);
        }

    }

    // sortAllEmployeesLists
    public void sortAllEmployeesLists() {

        System.out.println("");
        System.out.println("-----------------------------------------------------");
        System.out.println("");

        for (int i = 0; i < hockeyPlayers.size(); i++) {
            String str = String.format("%-25s", "HockeyPlayer");
            String str2 = String.format("%-20s", hockeyPlayers.get(i).getName());
            String str3 = String.format("%1s", "scored " + ((HockeyPlayer) hockeyPlayers.get(i)).getNumberOfGoals()) + " scored";
            System.out.print(str);
            System.out.print(str2);
            System.out.println(str3);
        }

        System.out.println("");

        Collections.sort(hockeyPlayers);

        for (int i = 0; i < hockeyPlayers.size(); i++) {
            String str = String.format("%-25s", "HockeyPlayer");
            String str2 = String.format("%-20s", hockeyPlayers.get(i).getName());
            String str3 = String.format("%1s", "scored " + ((HockeyPlayer) hockeyPlayers.get(i)).getNumberOfGoals()) + " scored";
            System.out.print(str);
            System.out.print(str2);
            System.out.println(str3);
        }

        System.out.println("");
        System.out.println("-----------------------------------------------------");
        System.out.println("");

        for (int i = 0; i < professors.size(); i++) {
            String str = String.format("%-25s", "Professor");
            String str2 = String.format("%-20s", professors.get(i).getName());
            String str3 = String.format("%1s", "teaches " + ((Professor) professors.get(i)).getTeachingMajor());
            System.out.print(str);
            System.out.print(str2);
            System.out.println(str3);
        }

        System.out.println("");

        Collections.sort(professors);

        for (int i = 0; i < professors.size(); i++) {
            String str = String.format("%-25s", "Professor");
            String str2 = String.format("%-20s", professors.get(i).getName());
            String str3 = String.format("%1s", "teaches " + ((Professor) professors.get(i)).getTeachingMajor());
            System.out.print(str);
            System.out.print(str2);
            System.out.println(str3);
        }

        System.out.println("");
        System.out.println("-----------------------------------------------------");
        System.out.println("");

        for (int i = 0; i < parents.size(); i++) {
            String str = String.format("%-25s", "Parent");
            String str2 = String.format("%-20s", parents.get(i).getName());
            String str3 = String.format("%1s", "spends " + ((Parent) parents.get(i)).getNumberOfHoursSpentPerWeekWithKids())
                    + " hour/week with kids";
            System.out.print(str);
            System.out.print(str2);
            System.out.println(str3);
        }

        System.out.println("");

        Collections.sort(parents);

        for (int i = 0; i < parents.size(); i++) {
            String str = String.format("%-25s", "Parent");
            String str2 = String.format("%-20s", parents.get(i).getName());
            String str3 = String.format("%1s", "spends " + ((Parent) parents.get(i)).getNumberOfHoursSpentPerWeekWithKids())
                    + " hour/week with kids";
            System.out.print(str);
            System.out.print(str2);
            System.out.println(str3);
        }

        System.out.println("");
        System.out.println("-----------------------------------------------------");
        System.out.println("");

        for (int i = 0; i < attendantArrayLists.size(); i++) {
            String str = String.format("%-25s", "GasStationAttendant");
            String str2 = String.format("%-20s", attendantArrayLists.get(i).getName());
            String str3 = String.format("%1s", "steals " + ((GasStationAttendant) attendantArrayLists.get(i)).getNumberOfDollarsStolenPerDay())
                    + " dollars a day";
            System.out.print(str);
            System.out.print(str2);
            System.out.println(str3);
        }

        System.out.println("");

        Collections.sort(attendantArrayLists);

        for (int i = 0; i < attendantArrayLists.size(); i++) {
            String str = String.format("%-25s", "GasStationAttendant");
            String str2 = String.format("%-20s", attendantArrayLists.get(i).getName());
            String str3 = String.format("%1s", "steals " + ((GasStationAttendant) attendantArrayLists.get(i)).getNumberOfDollarsStolenPerDay())
                    + " dollars a day";
            System.out.print(str);
            System.out.print(str2);
            System.out.println(str3);
        }
    }


    // equalAllEmployeesLists
    public void equalAllEmployeesLists() {

        Collections.sort(hockeyPlayers);

        System.out.println("");
        System.out.println("HockeyPlayer:");
        System.out.println("");

        for (int i = 0; i < hockeyPlayers.size() -1; i++) {

            HockeyPlayer player = (HockeyPlayer)hockeyPlayers.get(i);
            HockeyPlayer player2 = (HockeyPlayer)hockeyPlayers.get(i+1);

            String strHockeyPlayer = String.format("%-25s", "HockeyPlayer");
            String str2HockeyPlayer = String.format("%-20s", hockeyPlayers.get(i).getName());
            String str3HockeyPlayer = String.format("%1s", "scored " + ((HockeyPlayer) hockeyPlayers.get(i)).getNumberOfGoals()) + " scored";

            System.out.print(strHockeyPlayer);
            System.out.print(str2HockeyPlayer);
            System.out.println(str3HockeyPlayer);

            if ((player.equals(player2))){

            } else {
                System.out.println("-----------------------------------------------------");
            }

        }

        String strLastHockeyPlayer = String.format("%-25s", "HockeyPlayer");
        String strLast2HockeyPlayer = String.format("%-20s", hockeyPlayers.get(4).getName());
        String strLast3HockeyPlayer = String.format("%1s", "scored " + ((HockeyPlayer) hockeyPlayers.get(4)).getNumberOfGoals()) + " scored";

        System.out.println(strLastHockeyPlayer + strLast2HockeyPlayer + strLast3HockeyPlayer);
        System.out.println("-----------------------------------------------------");


        Collections.sort(professors);

        System.out.println("");
        System.out.println("Professor:");
        System.out.println("");

        for (int i = 0; i < professors.size() -1; i++) {

            Professor player = (Professor)professors.get(i);
            Professor player2 = (Professor)professors.get(i+1);

            String strProfessor = String.format("%-25s", "Professor");
            String str2Professor = String.format("%-20s", professors.get(i).getName());
            String str3Professor = String.format("%1s", "teaches " + ((Professor) professors.get(i)).getTeachingMajor());

            System.out.print(strProfessor);
            System.out.print(str2Professor);
            System.out.println(str3Professor);

            if ((player.equals(player2))){

            } else {
                System.out.println("-----------------------------------------------------");
            }

        }

        String strLastProfessor = String.format("%-25s", "Professor");
        String strLast2Professor = String.format("%-20s", professors.get(4).getName());
        String strLast3Professor = String.format("%1s", "teaches " + ((Professor) professors.get(4)).getTeachingMajor());

        System.out.println(strLastProfessor + strLast2Professor + strLast3Professor);
        System.out.println("-----------------------------------------------------");


        Collections.sort(parents);

        System.out.println("");
        System.out.println("Parent:");
        System.out.println("");

        for (int i = 0; i < parents.size() -1; i++) {

            Parent player = (Parent)parents.get(i);
            Parent player2 = (Parent) parents.get(i+1);

            String strParent = String.format("%-25s", "Parent");
            String str2Parent = String.format("%-20s", parents.get(i).getName());
            String str3Parent = String.format("%1s", "spends " + ((Parent) parents.get(i)).getNumberOfHoursSpentPerWeekWithKids())
                    + " hour/week with kids";

            System.out.print(strParent);
            System.out.print(str2Parent);
            System.out.println(str3Parent);

            if ((player.equals(player2))){

            } else {
                System.out.println("-----------------------------------------------------");
            }

        }

        String a = String.format("%-25s", "Parent");
        String b = String.format("%-20s", parents.get(4).getName());
        String c = String.format("%1s", "spends " + ((Parent) parents.get(4)).getNumberOfHoursSpentPerWeekWithKids())
                + " hour/week with kids";

        System.out.println(a+b+c);
        System.out.println("-----------------------------------------------------");


        Collections.sort(attendantArrayLists);

        System.out.println("");
        System.out.println("GasStationAttendant:");
        System.out.println("");

        for (int i = 0; i < attendantArrayLists.size() -1; i++) {

            GasStationAttendant player = (GasStationAttendant)attendantArrayLists.get(i);
            GasStationAttendant player2 = (GasStationAttendant)attendantArrayLists.get(i+1);

            String strGasStationAttendant = String.format("%-25s", "GasStationAttendant");
            String str2GasStationAttendant = String.format("%-20s", attendantArrayLists.get(i).getName());
            String str3GasStationAttendant = String.format("%1s", "steals " + ((GasStationAttendant) attendantArrayLists.get(i)).getNumberOfDollarsStolenPerDay())
                    + " dollars a day";

            System.out.print(strGasStationAttendant);
            System.out.print(str2GasStationAttendant);
            System.out.println(str3GasStationAttendant);

            if ((player.equals(player2))){

            } else {
                System.out.println("-----------------------------------------------------");
            }

        }

        String strLastGasStationAttendant = String.format("%-25s", "GasStationAttendant");
        String strLast2GasStationAttendant = String.format("%-20s", attendantArrayLists.get(4).getName());
        String strLast3GasStationAttendant = String.format("%1s", "steals " + ((GasStationAttendant) attendantArrayLists.get(4)).getNumberOfDollarsStolenPerDay())
                + " dollars a day";

        System.out.println(strLastGasStationAttendant + strLast2GasStationAttendant + strLast3GasStationAttendant);
        System.out.println("-----------------------------------------------------");
    }


    //get ArrayList
//    public boolean checkIfHockeyPlayerSame(ArrayList<HockeyPlayer> hockeyPlayers) {
//        if (hockeyPlayers.equals(hockeyPlayers)) {
//            return true;
//        }
//        return false;
//     }


}
