import java.util.ArrayList;

public class MyFarm {

    ArrayList<Plot> row;

    public static void main(String[] args) {
        MyFarm AlyssasFarm = new MyFarm();
    }

    public MyFarm() {
        row = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            row.add(new Plot());
        }
//        for (int x = 0; x < row.size(); x++) {
//            row.get(x).printPlotInfo();
//        }
        totalCarrots();
        totalPlants();
        addLettuce();
        addTulip();
        everyOtherNeedsWater();
        printRowInfo();
        printPlantNames();
        tomatoLocations();
        numberOfCarrotPlots();
        numberOfEmptyPlots();
        averageNumberOfPlants();
        greaterThan10();
        plantWithMinNumber();
        plantWithMaxNumber();

    }

    public void totalPlants() {
        // how many total plants are there in the row?
        System.out.println("***TOTAL PLANTS***");
        int total=0;
        for(int t=0; t<row.size();t++){
            total= total + row.get(t).numberOfPlants;
        }
        System.out.println("total plants: "+ total);
    }

    public void printPlantNames() {
        // print the name of each plant in the row and its index
        System.out.println("***PLANT NAMES***");
        for(int t=0; t<row.size();t++){
            System.out.print(t +": "+ row.get(t).plantName + ", ");
        }
        System.out.println();
    }
    public void totalCarrots() {
        // how many total carrot plants are there?
        System.out.println("***TOTAL CARROTS***");
        int total =0;
        for(int t=0; t<row.size();t++) {
            if (row.get(t).plantName.equals("Carrot")) {
                total = total + row.get(t).numberOfPlants;
            }
        }
        System.out.println("total carrots: "+ total);

    }
    public void printRowInfo() {
        // use the printPlotInfo() method in Plot.java to print all information for each plot in the row
        System.out.println("***ROW INFO***");
            for (int t = 0; t < row.size(); t++) {
                row.get(t).printPlotInfo();
            }
        }


    public void addLettuce() {
        // add a lettuce plot to the end of the row with 42 plants that need water
        // call printPlantNames() method before and after your addition to make sure it worked
        System.out.println("***ADD LETTUCE***");
        row.add(new Plot());
        row.get(10).plantName="Lettuce";
        row.get(10).numberOfPlants = 42;
        row.get(10).needsWater = true;

    }


    public void addTulip() {
        // at index 3, add a new tulip plot with 70 plants that do not need water
        // call printPlantNames() method before and after your addition to make sure it worked
        System.out.println("***ADD TULIP***");
        row.add(new Plot());
        row.get(3).plantName="Tulip";
        row.get(3).numberOfPlants = 70;
        row.get(3).needsWater = false;
    }


    public void tomatoLocations() {
        // print indexes of all tomato plants
        // call printPlantNames() method to make sure you're getting the correct indexes
        System.out.println("***TOMATO LOCATION***");
        for (int t = 0; t < row.size(); t++) {
            if (row.get(t).plantName.equals("Tomato")) {
                System.out.print("tomato locations: " + t + ", ");
            }

        }
    }

    public void averageNumberOfPlants() {
        // what is the average number of plants across the whole row?
        System.out.println("***AVERAGE NUMBER OF PLANTS***");
        int total=0;
        int avg = 0;
        for(int t=0; t<row.size();t++){
            total= total + row.get(t).numberOfPlants;
        }
        avg= total/row.size();
        System.out.println("average number of plants: "+ avg);

    }



    public void numberOfCarrotPlots() {
        // how many plots have carrots on them
        // call printPlantNames() method to check
        System.out.println("***TOTAL CARROT PLOT***");
        int total =0;
        for(int t=0; t<row.size();t++) {
            if (row.get(t).plantName.equals("Carrot")) {
                total = total + 1;
            }
        }
        System.out.println("total carrot plot: "+ total);
    }

    public void numberOfEmptyPlots() {
        // how many plots are empty
        // call printPlantNames() method to check
        System.out.println("***TOTAL EMPTY PLOT***");
        int total =0;
        for(int t=0; t<row.size();t++) {
            if (row.get(t).plantName.equals("Empty")) {
                total = total + 1;
            }
        }
        System.out.println("total empty plot: "+ total);
    }


    public void everyOtherNeedsWater(){
        // change the value of needsWater to be true for every other plot
        System.out.println("***EVERY OTHER NEEDS WATER***");
        for(int t=0; t<row.size();t=t+2) {
                row.get(t).needsWater = false;
            }
        }



    public void plantWithMaxNumber() {
        // which plant type has the most total plants?
        System.out.println("***MAX PLANT TYPE***");
        int totalCarrot = 0;
        int totalTomato = 0;
        int totalTulip = 0;
        int totalLettuce = 0;
        for(int t=0; t<row.size();t++) {
            if (row.get(t).plantName.equals("Carrot")) {
                totalCarrot = totalCarrot + row.get(t).numberOfPlants;
            }
            if (row.get(t).plantName.equals("Tomato")) {
                totalTomato = totalTomato + row.get(t).numberOfPlants;
            }
            if (row.get(t).plantName.equals("Tulip")) {
                totalTulip = totalTulip + row.get(t).numberOfPlants;
            }
            if (row.get(t).plantName.equals("Lettuce")) {
                totalLettuce = totalLettuce + row.get(t).numberOfPlants;
            }
        }
        int currentMax = 0;
        String minPlantType;

        if (totalCarrot>totalTomato){
            currentMax = totalCarrot;
            minPlantType = "Carrot";
        } else{
            currentMax = totalTomato;
            minPlantType = "Tomato";
        }
        if(totalTulip>currentMax){
            currentMax = totalTulip;
            minPlantType = "Tulip";
        }
        if(totalLettuce>currentMax){
            currentMax = totalLettuce;
            minPlantType = "Lettuce";
        }
        System.out.println("Plant with MOST number of plants is: " + minPlantType + ". number of plants = " + currentMax);

    }



    public void plantWithMinNumber() {

        // which plant type has the least total plants (not counting empty plots)?
        System.out.println("***MIN PLANT TYPE***");
        int totalCarrot = 0;
        int totalTomato = 0;
        int totalTulip = 0;
        int totalLettuce = 0;
        for(int t=0; t<row.size();t++) {
            if (row.get(t).plantName.equals("Carrot")) {
                totalCarrot = totalCarrot + row.get(t).numberOfPlants;
            }
            if (row.get(t).plantName.equals("Tomato")) {
                totalTomato = totalTomato + row.get(t).numberOfPlants;
            }
            if (row.get(t).plantName.equals("Tulip")) {
                totalTulip = totalTulip + row.get(t).numberOfPlants;
            }
            if (row.get(t).plantName.equals("Lettuce")) {
                totalLettuce = totalLettuce + row.get(t).numberOfPlants;
            }
        }
        int currentMin = 0;
        String minPlantType = "Carrot";

        if (totalCarrot<totalTomato && totalCarrot>0){
            currentMin = totalCarrot;
            minPlantType = "Carrot";
        } else if (totalTomato>0 && totalTomato<currentMin){
            currentMin = totalTomato;
            minPlantType = "Tomato";
        }
        if(totalTulip<currentMin && totalTulip>0){
            currentMin = totalTulip;
            minPlantType = "Tulip";
        }
        if(totalLettuce<currentMin && totalLettuce>0){
            currentMin = totalLettuce;
            minPlantType = "Lettuce";
        }
        System.out.println("Plant with LEAST number of plants is: " + minPlantType + ". number of plants = " + currentMin);

    }



    public void greaterThan10() {
        // how many plots have more than 10 plants in the plot?
        System.out.println("***HOW MANY PLOTS HAVE MORE THAN 10 PLANTS***");
        int total = 0;
        for (int t = 0; t < row.size(); t++) {
            if (row.get(t).numberOfPlants > 10) {
                total = total + 1;
            }
        }
        System.out.println("Number of plots with more than 10 plants: " + total);
    }


        public void plantWithMaxNumberNeedsWater () {
            // which plant type has the most total plants (not counting empty plots) that needs water?
            System.out.println("***HOW MANY PLOTS HAVE MORE THAN 10***");
            int total = 0;
            for (int t = 0; t < row.size(); t++) {
                if (row.get(t).numberOfPlants > 10) {
                    total = total + 1;
                }
                System.out.println("Number of plants with more than 10: " + total);
            }

        }
    }


