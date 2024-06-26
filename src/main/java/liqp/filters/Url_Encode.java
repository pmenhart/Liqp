package liqp.filters;

import liqp.TemplateContext;

import java.net.URLEncoder;

public class Url_Encode extends Filter {

    @Override
    public Object apply(Object value, TemplateContext context, Object... params) {

        try {
            return URLEncoder.encode(super.asString(value, context), "UTF-8");
        }
        catch (Exception e) {
            return value;
        }
    }
}
