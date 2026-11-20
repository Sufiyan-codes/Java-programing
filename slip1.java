// Write a program for multilevel inheritance such that Country is inherited from Continent and State is inherited from Country. Display place, state, country and continent.

class Continent
{
    String continent = "Asia";
}

class Country extends Continent
{
    String country = "India";
}

class State extends Country
{
    String state = "Maharashtra";
    String place = "Pune";

    void display()
    {
        System.out.println("Place: "+place);
        System.out.println("Place: "+state);
        System.out.println("Place: "+country);
        System.out.println("Place: "+continent);
    }
}

class main
{
    public static void main(String[] arg)
    {
        State s = new State();
        s.display();
    }
}

