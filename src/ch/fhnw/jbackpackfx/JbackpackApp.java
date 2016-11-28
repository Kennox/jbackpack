package ch.fhnw.jbackpackfx;

import ch.fhnw.jbackpackfx.model.Jbackpack;
import ch.fhnw.jbackpackfx.model.Jbackpack;
import ch.fhnw.jbackpackfx.view.JbackpackPresenter;
import ch.fhnw.jbackpackfx.view.JbackpackView;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class JbackpackApp extends Application {
  public static final String APP_NAME = "Jbackpack";

  public static void main(String[] args) {
    Application.launch(args);
  }

  @Override
  public void start(Stage stage) {
    Jbackpack model = new Jbackpack();
    JbackpackView view = new JbackpackView(model);

    // Must set the scene before creating the presenter that uses
    // the scene to listen for the focus change
    Scene scene = new Scene(view);

    JbackpackPresenter presenter = new JbackpackPresenter(model, view);

    stage.setScene(scene);
    stage.setTitle(APP_NAME);
    stage.show();
  }
}
