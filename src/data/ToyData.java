package data;

import base.Bike;
import base.Parcel;
import base.ParcelStatus;
import base.Person;

public class ToyData {

    public static Bike[] getBikes() {
        Bike[] bikes = new Bike[3];
        // your code
        
        return bikes;
    }

    public static Person[] getPerson() {
        Person[] person = new Person[3];
        // your code
        Person p0 = new Person("Sunchai", "Trabdee");
        Person p1 = new Person("Todsawat","Somtua");
        Person p2 = new Person("Supphakorn","Kaika");
        
        return person;
    }

    public static Parcel[] getParcels() {
        Parcel[] parcels = new Parcel[10];
        // your code
        Parcel pa0 = new Parcel(1,ParcelStatus.DELIVERED);
        Parcel pa1 = new Parcel(2,ParcelStatus.DELIVERED);
        Parcel pa2 = new Parcel(3,ParcelStatus.DELIVERED);
        Parcel pa3 = new Parcel(4,ParcelStatus.DELIVERED);
        Parcel pa4 = new Parcel(5,ParcelStatus.DELIVERED);
        Parcel pa5 = new Parcel(6,ParcelStatus.DELIVERED);
        Parcel pa6 = new Parcel(7,ParcelStatus.DELIVERED);
        Parcel pa7 = new Parcel(8,ParcelStatus.DELIVERED);
        Parcel pa8 = new Parcel(9,ParcelStatus.DELIVERED);
        Parcel pa9 = new Parcel(10,ParcelStatus.DELIVERED);
        
        return parcels;
    }

    //testing
    public static void main(String[] args) {
        printBike();
        printPerson();
        printParcels();
    }

    private static void printBike() {
        Bike[] bikes = getBikes();
        for (int i = 0; i < bikes.length; i++) {
            System.out.println(bikes[i].toString());
        }
    }

    private static void printPerson() {
        Person[] person = getPerson();
        for (int i = 0; i < person.length; i++) {
            System.out.println(person[i].toString());
        }
    }

    private static void printParcels() {
        Parcel[] percels = getParcels();
        for (int i = 0; i < percels.length; i++) {
            System.out.println(percels[i].toString());
        }
    }

}
