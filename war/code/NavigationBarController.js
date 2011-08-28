XNavigationBar bar = new XNavigationBar();

bar.setTitle("A Title");

bar.setLeftTitle("Back", Type.BACK_BUTTON);

bar.getLeftButton().addClickHandler(new ClickHandler() {
  public void onClick(ClickEvent e) {
    ...
  }
});

bar.setRightTitle("Done");

bar.getRightButton().addClickHandler(new ClickHandler() {
  public void onClick(ClickEvent e) {
    ...
  }
});