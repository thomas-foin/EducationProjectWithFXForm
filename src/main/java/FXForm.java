import javafx.application.Application;
import javafx.scene.GroupBuilder;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.SceneBuilder;
import javafx.stage.Stage;
import javafx.stage.StageBuilder;

/**
 * Created with IntelliJ IDEA.
 * User: thomasfoin
 * Date: 19/04/13
 * Time: 10:39
 * To change this template use File | Settings | File Templates.
 */
public class FXForm extends Application {

    public static void main(String[] arg){
        launch(arg);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Node fxform = new com.dooapp.fxform.FXForm(new DemoModel());

        Scene scene = SceneBuilder.create()
                .root(GroupBuilder.create().children(fxform).build())
                .build();

        StageBuilder.create()
                .title("Demo JavaFX2.X")
                .width(600)
                .height(400)
                .resizable(true)
                .scene(scene)
         .applyTo(stage);

        stage.show();
    }
}
