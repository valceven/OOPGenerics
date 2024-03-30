package Arithmetic;

public class Arithmetic {

    Number x, y;

    public Arithmetic(Number x, Number y) {
        this.x = x;
        this.y = y;
    }

    public Number add() {
        if (x instanceof Double || y instanceof Double) {
            return x.doubleValue() + y.doubleValue();
        } else if (x instanceof Float || y instanceof Float) {
            return x.floatValue() + y.floatValue();
        } else if (x instanceof Long || y instanceof Long) {
            return x.longValue() + y.longValue();
        } else {
            return x.intValue() + y.intValue();
        }
    }

    public Number subtract() {
        if (x instanceof Double || y instanceof Double) {
            return x.doubleValue() - y.doubleValue();
        } else if (x instanceof Float || y instanceof Float) {
            return x.floatValue() - y.floatValue();
        } else if (x instanceof Long || y instanceof Long) {
            return x.longValue() - y.longValue();
        } else {
            return x.intValue() - y.intValue();
        }
    }

    public Number multiply() {
        if (x instanceof Double || y instanceof Double) {
            return x.doubleValue() * y.doubleValue();
        } else if (x instanceof Float || y instanceof Float) {
            return x.floatValue() * y.floatValue();
        } else if (x instanceof Long || y instanceof Long) {
            return x.longValue() * y.longValue();
        } else {
            return x.intValue() * y.intValue();
        }
    }

    public Number divide() {
        try {
            if (x instanceof Double || y instanceof Double) {
                return x.doubleValue() / y.doubleValue();
            } else if (x instanceof Float || y instanceof Float) {
                return x.floatValue() / y.floatValue();
            } else if (x instanceof Long || y instanceof Long) {
                return x.longValue() / y.longValue();
            } else {
                return x.intValue() / y.intValue();
            }
        } catch (ArithmeticException e) {
            if (x instanceof Double || y instanceof Double) {
                return y.doubleValue() / x.doubleValue();
            } else if (x instanceof Float || y instanceof Float) {
                return y.floatValue() / x.floatValue();
            } else if (x instanceof Long || y instanceof Long) {
                return y.longValue() / x.longValue();
            } else {
                return y.intValue() / x.intValue();
            }
        }
    }

    public Number getMin() {
        if (x instanceof Double || y instanceof Double) {
            return Math.min(x.doubleValue(), y.doubleValue());
        } else if (x instanceof Float || y instanceof Float) {
            return Math.min(x.floatValue(), y.floatValue());
        } else if (x instanceof Long || y instanceof Long) {
            return Math.min(x.longValue(), y.longValue());
        } else {
            return Math.min(x.intValue(), y.intValue());
        }
    }

    public Number getMax() {
        if (x instanceof Double || y instanceof Double) {
            return Math.max(x.doubleValue(), y.doubleValue());
        } else if (x instanceof Float || y instanceof Float) {
            return Math.max(x.floatValue(), y.floatValue());
        } else if (x instanceof Long || y instanceof Long) {
            return Math.max(x.longValue(), y.longValue());
        } else {
            return Math.max(x.intValue(), y.intValue());
        }
    }
}

