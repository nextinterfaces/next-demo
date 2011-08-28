XSwitch switchBtn = new XSwitch(true);

switchBtn.addValueChangeHandler(new ValueChangeHandler<Boolean>() {

  @Override
  public void onValueChange(ValueChangeEvent<Boolean> e) {
  
    e.getValue(); /*** Switched true/false ***/
    
  }
});