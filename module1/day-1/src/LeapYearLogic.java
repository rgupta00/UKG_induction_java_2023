
class Date{

}
public class LeapYearLogic {

    public static void main(String[] args) {

        //U need to covert this OO way

//        1. leap year
//        2. permitted day per month
//        3. to find the next day

        int day=28;
        int month=2;
        int year=2023;

        //in need to check no of day in every month
        int noOfDays[]={-1, 31, 28};
        if(isLeapYear(year)){
            noOfDays[2]=29;
        }

        day=day+1;

        if(day>noOfDays[month]){
            day=1;
            month++;
            if(month>12){
                month=1;
                year++;
            }
        }


    }

    public static  boolean isLeapYear(int year){
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0) ;
    }
}
