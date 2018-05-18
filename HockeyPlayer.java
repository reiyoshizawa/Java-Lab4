package Lab4;

public class HockeyPlayer extends Employee{

    public HockeyPlayer(){}

    public HockeyPlayer(int numberOfGoals) {
        this.numberOfGoals = numberOfGoals;
    }

    public HockeyPlayer(String name, int numberOfGoals) {
        super(name);
        this.numberOfGoals = numberOfGoals;
    }

    private int numberOfGoals;
    final double OVERTIME_PAY_RATE = 0.0;

    public int getNumberOfGoals() {
        return numberOfGoals;
    }

    @Override
    public DressCode getDressCode() {
        return DressCode.JERSEY;
    }

    @Override
    public boolean isPaidSalary() {
        return true;
    }

    @Override
    public boolean postSecondaryEducationRequired() {
        return false;
    }

    @Override
    public String getWorkVerb() {
        return "play";
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

        if (this.numberOfGoals == ((HockeyPlayer) obj).numberOfGoals) {
            return true;
        }

        return false;

//        return super.equals(obj);
    }

    @Override
    // if this < Object o -> negative (-1)
    // if this > Object o -> positive (1)
    // if this = Object o -> (0)
    public int compareTo(Object o) {
        if(this.numberOfGoals < ((HockeyPlayer) o).numberOfGoals){
            return -1;
        }else if(this.numberOfGoals > ((HockeyPlayer) o).numberOfGoals){
            return 1;
        }else{
            return 0;
        }
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + numberOfGoals;
        return result;
    }

    //    @Override
//    public int compareTo(HockeyPlayer o) {
//        //このインスタンスが、compareToの引数として渡されたObjectより小さい(前に並ぶ)なら負の値、
//        //このインスタンスが、compareToの引数として渡されたObjectより大きい(後ろに並ぶ)なら正の値を返す。
//        //同じなら、0を返せばよい。
//        if(this.numberOfGoals < o.numberOfGoals){
//            return -1;
//        }else if(this.numberOfGoals > o.numberOfGoals){
//            return 1;
//        }else{
//            return 0;
//        }
//    }

}
