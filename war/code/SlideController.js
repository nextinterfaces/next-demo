class SlideController extends XController {

  SlideController() {
    setTitle("Slide Example");
    
    /*** slides out by pop previous controller in parent ***/
    /*** getNavigationController().popController(true); ***/
  }

  @Override
  public IsWidget getViewContent() {
    return new HTML("view content");
  }

  @Override
  public Scroll getScrollOrientation() {
    return XController.Scroll.VERTICAL;
  }
}

/*** somewhere else ***/
getNavigationController().pushController(slideController, true);
