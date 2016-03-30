public class Main {

    public static void main(String[] args) {

        Nissan nissan = new Nissan();
        nissan.setHorsepower(550);
        nissan.setCarType("coupe");
        nissan.setCarColor("White");

        System.out.println(nissan.getCarColor() + " " + nissan.getHorsepower() + " hp " + nissan.getCarType());

        G37 myg37 = new G37();
        myg37.setCarMake("Infinti");
        myg37.setCrankHorsePower(350);
        myg37.setCarCleaned(false);
        myg37.setSizeOfEngine(3.7);

        System.out.println("My " + myg37.getSizeOfEngine() + " liter " + myg37.getCrankHorsePower() + "hp " +
                myg37.getCarMake() + " is clean: " + myg37.getCarCleaned() + ".");

        Molly molly = new Molly();
        molly.setWeight(5.2);
        molly.setFishColor("Black");
        molly.setInchesLong(3.1);

        System.out.println("My molly is pregnant. " + molly.getIsPregnant());

        Guppy guppy = new Guppy();
        guppy.setGallonsOfFishTank(10);
        guppy.setTailFinColor("Blue");
        guppy.setWidth(3);

        System.out.println("My " + guppy.getTailFinColor() + " tail guppy is pregnant, in a " +
                guppy.getGallonsOfFishTank() + " gallon tank. " + guppy.getIsPregnant());

        Stella stella = new Stella();
        stella.setAgeOfDogInWeeks(12);
        stella.setColorsOfDog("brown and white");
        stella.setTypeOfDog("Jack Russell Terrier");

        System.out.println("My " + stella.getTypeOfDog() + " is " + stella.getAgeOfDogInWeeks() +
                " weeks old and she is " + stella.getColorsOfDog() + ".");


    }



}

