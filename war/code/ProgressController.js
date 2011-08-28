final XProgress progress = new XProgress();

/*** progress.setTransistionTiming(1000); ***/

XButton btn = new XButton("Start Progress");

btn.addClickHandler(new ClickHandler() {
  public void onClick(ClickEvent event) {
  
    if(!progress.isRunning()){
      progress.reset();
      runProgress(0, progress);
    }
  }
});