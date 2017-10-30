
package converter;

class WeightCalcHelper {

    
    //GIGA TO EVERYTHING ELSE
    public double gigaToMega(double input) {
        return input * 1000D;
    }

    double gigaToKilo(double input) {
        return input * 1000000D;
    }

    double gigaToHecto(double input) {
        return input * 10000000D;
    }

    double gigaToDeka(double input) {
        return input * 100000000D;
    }

    double gigaToDeci(double input) {
        return input * 10000000000D;
    }

    double gigaToCenti(double input) {
        return input * 100000000000D;
    }

    double gigaToMilli(double input) {
        return input * 1000000000000D;
    }

    double gigaToMicro(double input) {
        return input * 1000000000000000D;
    }

    double gigaToNano(double input) {
        return input * 1000000000000000000D;
    }

    double gigaToPico(double input) {
        return input * 1000000000000000000000D;
    }

    double gigaToGram(double input) {
        return input * 1000000000D;
    }
}
