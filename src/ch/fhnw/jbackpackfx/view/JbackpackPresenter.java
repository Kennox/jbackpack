package ch.fhnw.jbackpackfx.view;

import ch.fhnw.jbackpackfx.model.Jbackpack;

public class JbackpackPresenter {
  private final Jbackpack model;
  private final JbackpackView view;

  /** Javadoc comment here. */
  public JbackpackPresenter(Jbackpack model, JbackpackView view) {
    this.model = model;
    this.view = view;
    attachEvents();
  }

  private void attachEvents() {
    //TODO put all setOnAction/addListeners in here
  }
}
