package edu.lmu.cs.mike.impl;

import edu.lmu.cs.mike.iface.IntegerDoubler;

public class AdditionDoubler implements IntegerDoubler {

  @Override
  public long doDouble(int i) {
    return i + i;
  }
  
  public long doDouble_qh(int i) {
    return i + i;
  }
  
  class Person{
    protected String sayHello(){
      return "hi";
    }
  }
}

