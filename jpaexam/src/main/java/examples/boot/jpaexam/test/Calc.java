package examples.boot.jpaexam.test;

// A라른 사용자
public class Calc{
    /**
     * i를 j로 나눈 정수값을 반환한다.
     * @param i
     * @param j
     * @throws ArithmeticException j가 0일 때 발생
     * @return
     */
    public int divide(int i, int j) throws MyException{
        int value = 0;
        try {
             value = i / j;
            return value;
        }catch(Exception ex){
           throw new MyException(ex);
        }
    }
}
