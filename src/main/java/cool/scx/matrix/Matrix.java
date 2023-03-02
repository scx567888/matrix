package cool.scx.matrix;

import cool.scx.core.Scx;
import cool.scx.core.ScxModule;
import cool.scx.core.enumeration.ScxCoreFeature;

public class Matrix extends ScxModule {

    public static void main(String[] args) {
        Scx.builder()
                .setMainClass(Matrix.class)
                .configure(ScxCoreFeature.USE_DEVELOPMENT_ERROR_PAGE, true)
                .addModule(
                        new Matrix()
                )
                .setArgs(args)
                .run();
    }

}
