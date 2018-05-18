package Lab4;

public class Professor extends Employee{

    public Professor(String teachingMajor) {
        this.teachingMajor = teachingMajor;
    }

    public Professor(String name, String teachingMajor) {
        super(name);
        this.teachingMajor = teachingMajor;
    }

    private String teachingMajor;
    final double OVERTIME_PAY_RATE = 2.0;

    public String getTeachingMajor() {
        return teachingMajor;
    }

    @Override
    public DressCode getDressCode() {
        return DressCode.FANCY;
    }

    @Override
    public boolean isPaidSalary() {
        return true;
    }

    @Override
    public boolean postSecondaryEducationRequired() {
        return true;
    }

    @Override
    public String getWorkVerb() {
        return "teach";
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

        if (this.teachingMajor == ((Professor) obj).teachingMajor) {
            return true;
        }

        return false;

//        return super.equals(obj);
    }

    @Override
    public int compareTo(Object o) {
        if (((Professor) o).teachingMajor.equals("Computer Systems")){
            return -1;
        } else{
            return 0;
        }
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result;
        return result;
    }


    // public int compareTo(Object o)とpublic boolean equals(Object obj)
    // の Object の部分は変えられない。元から存在するclassをoverrideするから。
    // 後でダウンキャストする


//    @Override
//    public int compareTo(Professor o) {
//        //このインスタンスが、compareToの引数として渡されたObjectより小さい(前に並ぶ)なら負の値、
//        //このインスタンスが、compareToの引数として渡されたObjectより大きい(後ろに並ぶ)なら正の値を返す。
//        //同じなら、0を返せばよい。
//        if(o.teachingMajor.equals("Computer Systems")){
//            return 1;
//        } else{
//            return 0;
//        }
//    }

}
