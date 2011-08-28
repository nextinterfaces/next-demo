XPicker picker = new XPicker();

picker.add("Castle in the Sky");

picker.add("Totoro");

picker.add("Spirited Away");

/*** selected ***/
picker.add("Ponyo", true);

picker.addValueChangeHandler(new ValueChangeHandler<String>() {
  public void onValueChange(ValueChangeEvent<String> e) {
    ...
  }
});