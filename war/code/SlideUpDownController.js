SlideUpDownController extends XController {

  SlideUpDownController() {

    setTitle("Slide Up/Down");

    /*** When invoked via slideUpIn() then ***/
    /*** this.slideUpReverse(); ***/
    
    /*** When instantiated with slideDownIn() then ***/
    /*** this.slideDownReverse(); ***/
  }

  @Override
  public IsWidget getViewContent() {
    return new HTML("view content");
  }
}


SlideUpDownController ctrl = new SlideUpDownController("Slide Up", true);
ctrl.slideUpIn();

SlideUpDownController ctrl = new SlideUpDownController("Slide Down", false);
ctrl.slideDownIn();