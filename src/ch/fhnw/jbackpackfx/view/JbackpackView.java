package ch.fhnw.jbackpackfx.view;

import ch.fhnw.jbackpackfx.model.Jbackpack;
import javafx.scene.Parent;

public class JbackpackView extends Parent { // change Parent to GridPane etc.
  private final Jbackpack model;

  //declare all elements here

  /** Javadoc comment here. */
  public JbackpackView(Jbackpack model) {
    this.model = model;

    layoutForm();
    initFieldData();
    bindFieldsToModel();
  }

  private void layoutForm() {
    //setup layout (aka setup specific pane etc.)
  }

  private void initFieldData() {
    //populate fields wich require initial data
  }

  private void bindFieldsToModel() {
    //make the bindings to the model
  }


}


