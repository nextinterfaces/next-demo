class DragScrollController extends XController {

  public DragScrollController() {
    setTitle("My title");
  }

  @Override
  public Scroll getScrollOrientation() {
    return XController.Scroll.DRAGGABLE;
  }

  @Override
  public IsWidget getViewContent() {
    return new HTML("The scrollable content.");
  }
}