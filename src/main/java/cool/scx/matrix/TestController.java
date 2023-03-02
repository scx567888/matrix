package cool.scx.matrix;

import cool.scx.enumeration.HttpMethod;
import cool.scx.mvc.annotation.ScxMapping;

@ScxMapping
public class TestController {

    @ScxMapping(method = HttpMethod.GET, useNameAsUrl = false)
    public String index() {
        return "Matrix";
    }

}
