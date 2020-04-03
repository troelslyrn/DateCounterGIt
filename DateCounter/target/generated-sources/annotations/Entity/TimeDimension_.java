package Entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-04-03T13:53:08")
@StaticMetamodel(TimeDimension.class)
public class TimeDimension_ { 

    public static volatile SingularAttribute<TimeDimension, Character> weekendFlag;
    public static volatile SingularAttribute<TimeDimension, Integer> week;
    public static volatile SingularAttribute<TimeDimension, String> dayName;
    public static volatile SingularAttribute<TimeDimension, Integer> month;
    public static volatile SingularAttribute<TimeDimension, Integer> year;
    public static volatile SingularAttribute<TimeDimension, Date> dbDate;
    public static volatile SingularAttribute<TimeDimension, String> monthName;
    public static volatile SingularAttribute<TimeDimension, Integer> id;
    public static volatile SingularAttribute<TimeDimension, String> event;
    public static volatile SingularAttribute<TimeDimension, Integer> day;
    public static volatile SingularAttribute<TimeDimension, Character> holidayFlag;
    public static volatile SingularAttribute<TimeDimension, Integer> quarter;

}