class PopController extends XController {

  PopController() {
    setTitle("Pop Example");
    
    /*** XController pop In ***/
    /*** this.popIn(); ***/
    
    /*** XController pop Out ***/
    /*** this.popOut(); ***/
  }

  @Override
  public Scroll getScrollOrientation() {
    return XController.Scroll.VERTICAL;
  }
}
