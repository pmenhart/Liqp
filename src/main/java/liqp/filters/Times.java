package liqp.filters;

import java.math.BigDecimal;

public class Times extends Filter {

    /*
     * times(input, operand)
     *
     * multiplication
     */
    @Override
    public Object apply(Object value, Object... params) {

        if(value == null) {
            value = 0L;
        }

        super.checkParams(params, 1);

        Object rhsObj = params[0];

        if (super.canBeInteger(value) && super.canBeInteger(rhsObj)) {
            return super.asNumber(value).longValue() * super.asNumber(rhsObj).longValue();
        }

        BigDecimal first = new BigDecimal(super.asNumber(value).toString());
        BigDecimal second = new BigDecimal(super.asNumber(rhsObj).toString());
        return first.multiply(second);
    }
}
