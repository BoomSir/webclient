package test;

import client1.WeatherInterfaceImpl;
import client1.WeatherInterfaceImplService;

public class WeatherClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.创建服务视图
        WeatherInterfaceImplService weatherInterfaceImplService = 
               new WeatherInterfaceImplService();
        //2.获取服务实现类
        WeatherInterfaceImpl weatherInterfaceImpl =weatherInterfaceImplService.getPort(WeatherInterfaceImpl.class);
         //3.调用查询方法，打印
		String result = weatherInterfaceImpl.queryWeather("北京");
		System.out.println(result);
	}
}
