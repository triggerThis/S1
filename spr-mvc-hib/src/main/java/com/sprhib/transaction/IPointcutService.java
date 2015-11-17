package com.sprhib.transaction;

import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Stack;


public interface IPointcutService {
    
    public boolean test();


    public boolean test(Object obj);

    public boolean test(Date date);
    
  
    



    public void test(Map map, int i);



    public void test(Set<TestMap> set);
    
    public void test(Stack<Map> list);
    
    public static class TestMap extends HashMap {}


}
