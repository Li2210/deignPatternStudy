package designPattern.ValueObject;

public class Year implements Comparable<Year>{

    private final int value;

    public Year(int value) {
        super();
        this.value = value;
    }

    public int getValue(){
        return value;
    }

    public Year increment(){
        return new Year(value+1);
    }

    public Year decrement(){
        return new Year(value-1);
    }

    public Year diff(int counter){
        return new Year(value+counter);
    }

    @Override
    public String toString(){
        return "Year is "+value+" now !";
    }

    @Override
    public boolean equals(Object compare) {
        if(!(compare instanceof Year)) {
            return false;
        }

        return this.value == ((Year) compare).getValue();
    }

    @Override
    public int hashCode() {
        final int prime = 19;
        int result = 11;
        result = prime * result + value;

        return result;
    }

    @Override
    public int compareTo(Year anotherYear) {
        return this.value - anotherYear.getValue();
    }

    public static void main(String[] args) {

        Year yearA = new Year(2000);
        System.out.println(yearA);

        Year yearB = yearA.decrement();
        System.out.println(yearB);

        Year yearC = yearA.increment();
        System.out.println(yearC);

        Year yearD = yearA.diff(10);
        System.out.println(yearD);

        Year yearE = yearA.diff(-10);
        System.out.println(yearE);

        Year yearF = new Year(2000);
        System.out.println("Is yearA and yearF equal: "+yearA.equals(yearF));
        System.out.println("Is yearA and yearB equal: "+yearA.equals(yearB));
        System.out.println("Compare yearA and yearC: "+yearA.compareTo(yearC));
    }

}
