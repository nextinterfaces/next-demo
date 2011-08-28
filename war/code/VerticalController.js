class VerticalScrollController extends XController {

  public VerticalScrollController() {
    setTitle("Vertical Scroll");
  }

  @Override
  public Scroll getScrollOrientation() {
    return XController.Scroll.VERTICAL;
  }

  @Override
  public IsWidget getViewContent() {
    return new HTML("The scrollable content.");
  }
}