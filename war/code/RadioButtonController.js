/*** vertical group ***/
XRadioButton h0 = new XRadioButton("Red", "Red");
h0.setValue(true);/*** selected ***/

XRadioButton h1 = new XRadioButton("Green", "Green");

XRadioButton h2 = new XRadioButton("Blue", "Blue");


XRadioButtonGroup groupVertical = new XRadioButtonGroup(true);
groupVertical.add(h0, h1, h2);


/*** horizontal group ***/
XRadioButton v0 = new XRadioButton("Red", "Red");

XRadioButton v1 = new XRadioButton("Green", "Green");

XRadioButton v2 = new XRadioButton("Blue", "Blue");

XRadioButtonGroup groupHorizontal = new XRadioButtonGroup(false);
groupHorizontal.add(v0, v1, v2);

groupHorizontal.addSelectionChangedHandler(new SelectionChangedHandler() {
  public void onSelectionChanged(SelectionChangedEvent e) {
    /*** selection ***/
    groupHorizontal.getCheckedWidget().getName();
  }
});