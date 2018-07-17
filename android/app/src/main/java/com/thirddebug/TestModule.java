package com.thirddebug;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableNativeArray;

import java.util.Map;
import java.util.HashMap;

public class TestModule extends ReactContextBaseJavaModule {

  public TestModule(ReactApplicationContext reactContext) {
    super(reactContext);
  }

  @Override
  public String getName() {
    return "Test";
  }

  @ReactMethod
  public void testMethod() {
    WritableNativeArray array = new WritableNativeArray();
    
    System.out.println("a");
    array.pushString("hi");
    
    System.out.println("b");
    System.out.println(array.size());

    array.pushString("hi2");

    System.out.println("c");
    System.out.println(array.size());

    System.out.println("d");
  }


}
