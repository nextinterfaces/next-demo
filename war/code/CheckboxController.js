/*** vertical group ***/
XCheckbox c0 = new XCheckbox("Red", "Red");

XCheckbox c1 = new XCheckbox("Green", "Green");

XCheckbox c2 = new XCheckbox("Blue", "Blue");

c0.setValue(true);


XCheckboxGroup groupVertical = new XCheckboxGroup(true);

groupVertical.add(c0, c1, c2);


/*** horizontal group ***/
XCheckbox v0 = new XCheckbox("Red", "Red");

XCheckbox v1 = new XCheckbox("Green", "Green");

XCheckbox v2 = new XCheckbox("Blue", "Blue");


XCheckboxGroup groupHorizontal = new XCheckboxGroup(false);

groupHorizontal.add(v0, v1, v2);

groupHorizontal.addSelectionChangedHandler(new SelectionChangedHandler() {
  public void onSelectionChanged(SelectionChangedEvent e) {
    /*** selection ***/
    groupHorizontal.getCheckedWidgets();
  }
});
