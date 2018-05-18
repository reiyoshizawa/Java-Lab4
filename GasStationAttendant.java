package Lab4;

public class GasStationAttendant extends Employee{

    public GasStationAttendant(int numberOfDollarsStolenPerDay) {
        this.numberOfDollarsStolenPerDay = numberOfDollarsStolenPerDay;
    }

    public GasStationAttendant(String name, int numberOfDollarsStolenPerDay) {
        super(name);
        this.numberOfDollarsStolenPerDay = numberOfDollarsStolenPerDay;
    }

    private int numberOfDollarsStolenPerDay;
    final double OVERTIME_PAY_RATE = 1.5;

    public int getNumberOfDollarsStolenPerDay() {
        return numberOfDollarsStolenPerDay;
    }

    @Override
    public DressCode getDressCode() {
        return DressCode.UNIFORM;
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
        return "pump";
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

        if (this.numberOfDollarsStolenPerDay == ((GasStationAttendant) obj).numberOfDollarsStolenPerDay) {
            return true;
        }

        return false;

//        return super.equals(obj);
    }

    @Override
    public int compareTo(Object o) {
        if(this.numberOfDollarsStolenPerDay < ((GasStationAttendant) o).numberOfDollarsStolenPerDay){
            return -1;
        }else if(this.numberOfDollarsStolenPerDay > ((GasStationAttendant) o).numberOfDollarsStolenPerDay){
            return 1;
        }else{
            return 0;
        }
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + numberOfDollarsStolenPerDay;
        return result;
    }


//    @Override
//    public int compareTo(GasStationAttendant o) {
//        //このインスタンスが、compareToの引数として渡されたObjectより小さい(前に並ぶ)なら負の値、
//        //このインスタンスが、compareToの引数として渡されたObjectより大きい(後ろに並ぶ)なら正の値を返す。
//        //同じなら、0を返せばよい。
//        if(this.numberOfDollarsStolenPerDay < o.numberOfDollarsStolenPerDay){
//            return -1;
//        }else if(this.numberOfDollarsStolenPerDay > o.numberOfDollarsStolenPerDay){
//            return 1;
//        }else{
//            return 0;
//        }
//    }

}