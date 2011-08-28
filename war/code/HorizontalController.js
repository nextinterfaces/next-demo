class HorizontalScrollController extends XController {

  public HorizontalScrollController() {
    setTitle("My title");
  }

  @Override
  public Scroll getScrollOrientation() {
    return XController.Scroll.HORIZONTAL;
  }

  @Override
  public IsWidget getViewContent() {
    return new HTML("The scrollable content.");
  }
}