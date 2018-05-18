package Lab4;

public class Parent extends Employee {

    public Parent(int numberOfHoursSpentPerWeekWithKids) {
        this.numberOfHoursSpentPerWeekWithKids = numberOfHoursSpentPerWeekWithKids;
    }

    public Parent(String name, int numberOfHoursSpentPerWeekWithKids) {
        super(name);
        this.numberOfHoursSpentPerWeekWithKids = numberOfHoursSpentPerWeekWithKids;
    }

    private int numberOfHoursSpentPerWeekWithKids;
    final double OVERTIME_PAY_RATE = -2.0;

    public int getNumberOfHoursSpentPerWeekWithKids() {
        return numberOfHoursSpentPerWeekWithKids;
    }

    @Override
    public DressCode getDressCode() {
        return DressCode.ANYTHING;
    }

    @Override
    public boolean isPaidSalary() {
        return false;
    }

    @Override
    public boolean postSecondaryEducationRequired() {
        return false;
    }

    @Override
    public String getWorkVerb() {
        return "care";
    }

    @Override
    double getOverTimePayRate() {
        return OVERTIME_PAY_RATE;
    }

    @Override
    public boolean equals(Object obj) {

        if(this == obj) {
            return true;
        }

        if(this == null) {
            return false;
        }

        if (this.getClass() != obj.getClass()) {
            return false;
        }

        if (this.numberOfHoursSpentPerWeekWithKids == ((Parent) obj).numberOfHoursSpentPerWeekWithKids) {
            return true;
        }

        return false;

//        return super.equals(obj);
    }

    @Override
    public int compareTo(Object o) {
        if(this.numberOfHoursSpentPerWeekWithKids < ((Parent) o).numberOfHoursSpentPerWeekWithKids){
            return -1;
        }else if(this.numberOfHoursSpentPerWeekWithKids > ((Parent) o).numberOfHoursSpentPerWeekWithKids){
            return 1;
        }else{
            return 0;
        }
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + numberOfHoursSpentPerWeekWithKids;
        return result;
    }


    //    @Override
//    public int compareTo(Parent o) {
//        //このインスタンスが、compareToの引数として渡されたObjectより小さい(前に並ぶ)なら負の値、
//        //このインスタンスが、compareToの引数として渡されたObjectより大きい(後ろに並ぶ)なら正の値を返す。
//        //同じなら、0を返せばよい。
//        if(this.numberOfHoursSpentPerWeekWithKids < o.numberOfHoursSpentPerWeekWithKids){
//            return -1;
//        }else if(this.numberOfHoursSpentPerWeekWithKids > o.numberOfHoursSpentPerWeekWithKids){
//            return 1;
//        }else{
//            return 0;
//        }
//    }

}
