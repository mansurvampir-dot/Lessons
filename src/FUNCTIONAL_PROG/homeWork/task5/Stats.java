package FUNCTIONAL_PROG.homeWork.task5;

record Stats(long count, double sum, double min, double max) {
    static Stats empty() {
        return new Stats(0, 0, Double.MAX_VALUE, Double.MIN_VALUE);
    }

    double avg() {
        if (count == 0) {
            return 0;
        } else {
            return sum / count;
        }
    }

    Stats merge(double v) {
        return new Stats(count + 1, sum + v, Math.min(min, v), Math.max(max, v));
    }

    Stats combine(Stats x) {
        return new Stats(count + x.count, sum + x.sum, Math.min(min, x.min), Math.max(max, x.max));
    }
}