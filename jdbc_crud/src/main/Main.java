package main;

import implementor.OperationsImp;

public class Main {
  public static void main(String[] args) {
	OperationsImp imp=new OperationsImp();
	imp.insertData();
	imp.updateData();
	imp.deleteData();
	imp.showData();
}
  
}
