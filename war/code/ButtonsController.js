new XButton("Rounded");

new XButton("Shadow", XButtonType.Shadow);

new XButton("Navigation", XButtonType.Navigation);

new XButton("Blue", XButtonType.NavigationBlue);

new XButton("Red", XButtonType.NavigationRed);

new XButton("Black", XButtonType.NavigationBlack);

new XButton("Left", XButtonType.Image, "images/icon.png", "images/icon-pressed.png", true);

new XButton("Right", XButtonType.Image, "images/icon.png", "images/icon-pressed.png", false);
           
btn.addClickHandler(new ClickHandler() {
  public void onClick(ClickEvent e) {
     ...
  }
});