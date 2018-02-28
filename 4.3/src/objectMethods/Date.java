package objectMethods;

public class Date {
    private final int month;
    private final int day;
    private final int year;

    public Date(int m, int d, int y){
        this.month = m;
        this.day = d;
        this.year = y;
    }

    @Override
    public boolean equals(Object d){
        if(d == null){
            return false;
        }

        if(this.getClass() != d.getClass()){
            return false;
        }


        Date uddaDate = (Date)d;
        if(month != uddaDate.month || day != uddaDate.day || year != ((Date) d).year){
            return false;
        }

        return true;
    }
}
