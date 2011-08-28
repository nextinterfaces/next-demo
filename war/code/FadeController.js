class FadeController extends XController {

  FadeController() {
    setTitle("Fade Example");
    
    /*** XController fades In ***/
    /*** this.fadeIn(); ***/
    
    /*** XController fades Out ***/
    /*** this.fadeOut(); ***/
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
