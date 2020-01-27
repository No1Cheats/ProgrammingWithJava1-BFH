package Lambda;

public class LambdaCalculator {

    public static Integer useLambda(Integer i1, Integer i2, MyLambdaInterface m){
        return(m.func(i1,i2));
    }
}
