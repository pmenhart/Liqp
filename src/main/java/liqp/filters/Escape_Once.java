package liqp.filters;

import liqp.TemplateContext;

public class Escape_Once extends Filter {

    /*
     * escape_once(input)
     *
     * returns an escaped version of html without affecting
     * existing escaped entities
     */
    @Override
    public Object apply(Object value, TemplateContext context, Object... params) {

        String str = super.asString(value, context);

        return str.replaceAll("&(?!([a-zA-Z]+|#[0-9]+|#x[0-9A-Fa-f]+);)", "&amp;")
                .replace("<", "&lt;")
                .replace(">", "&gt;")
                .replace("\"", "&quot;");
    }
}
