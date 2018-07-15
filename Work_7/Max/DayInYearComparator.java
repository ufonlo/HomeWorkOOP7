package Work_7.Max;

import java.time.LocalDate;
import java.util.Comparator;

public class DayInYearComparator implements Comparator<LocalDate> {
    @Override
    public int compare(LocalDate id1,LocalDate id2){
        return id1.getDayOfYear() - id2.getDayOfYear();
    }
}
