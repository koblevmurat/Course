package Lessons.Geekbrains.Algorithms.Lesson5;

public class RecursivePwr {

    public static double Power(int _val, int _pwr) {
        if (_pwr == 0){
            return 1;
        }
        else
        {
            if (_pwr>0)
                return _val * Power(_val, --_pwr);
            else {
                _pwr = -1 * _pwr;
                double res = Power(_val, _pwr);
                return 1 / res;
            }
        }
    }

    public static void Test(){
        System.out.println(Power(2, 2));
        System.out.println(Power(2, -2));
    }
}
