package com.eug;


import com.eug.listeners.TestListener;
import org.testng.annotations.Listeners;

@Listeners(TestListener.class)
public abstract class BaseApiTest {
}
