class FlipController extends XController {

  public FlipController(XController invokerController) {

    setTitle("Flip Example");

    /*** flips out to originator ***/
    /*** FlipController.this.flipTo(invokerController, null); ***/
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

/*** somewhere else flips in ***/
FlipController ctrl = new FlipController(getNavigationController().getVisibleController());
this.flipTo(ctrl, null);
