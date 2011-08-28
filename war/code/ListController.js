CellData data = new CellData();
data.setWestWidgets(new Image("images/icons/list0.png"));
data.setTextWidgets(new Label("Ariplane Mode"));
data.setEastWidgets(new XSwitch(true));
XTableCell cell0 = new XTableCell(data);

data = new CellData();
data.setWestWidgets(new Image("images/icons/list1.png"));
data.setTextWidgets(new Label("WI-FI"));
data.setEastWidgets(new Image("images/icons/list1x.png"));
XTableCell cell1 = new XTableCell(data);

data = new CellData();
data.setWestWidgets(new Image("images/icons/list2.png"));
data.setTextWidgets(new Label("Notifications"));
data.setEastWidgets(new Image("images/icons/list2x.png"));
XTableCell cell2 = new XTableCell(data);

data = new CellData();
data.setWestWidgets(new Image("images/icons/list3.png"));
data.setTextWidgets(new Label("Sound"));
data.setEastWidgets(new XSlider(60));
XTableCell cell3 = new XTableCell(data);

XTableView tableView = new XTableView();
tableView.addItem(cell0, cell1, cell2, cell3);