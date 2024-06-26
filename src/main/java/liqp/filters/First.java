package liqp.filters;

import liqp.TemplateContext;

public class First extends Filter {

    /*
     * first(array)
     *
     * Get the first element of the passed in array
     */
    @Override
    public Object apply(Object value, TemplateContext context, Object... params) {

        Object[] array = super.asArray(value, context);

        return array.length == 0 ? null : array[0];
    }
}
