package chapter10.practice6;

public class MyDate {
    int year;
    int month;
    int day;

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof MyDate){
            MyDate myDate = (MyDate) obj;
            return this.year == myDate.year
                    && this.month == myDate.month
                    && this.day == myDate.day;
        }else{
            return false;
        }
    }

    @Override
    public int hashCode() {
        return year *(12 * 31) + month * 31 + day;
    }
}
