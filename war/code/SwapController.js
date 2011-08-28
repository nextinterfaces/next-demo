SwapController extends XController {

  SwapController(IController invokerController) {

    setTitle("Swap example");	
	
	/*** reverse swap using ***/
	/*** Command afterCommand = ...; ***/
	/*** this.swapToReverse(invokerController, afterCommand); ***/
  }

  @Override
  public IsWidget getViewContent() {
    return new HTML("view content");
  }
}

/*** instantiate ***/
SwapController ctrl = new SwapController(getNavigationController().getVisibleController());

someOtherController.swapTo(ctrl, new Command(){
  public void execute(){
    /*** on swap complete callback ***/
  }
});