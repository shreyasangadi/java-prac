package javaProblems;

import io.netty.util.internal.SystemPropertyUtil;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class PrimeNum {

	
	public static void primeNum(int a)
	{
		
		int flg =0;
		for (int i = 2;i<(a);i++)
		{
			flg=1;
			for(int j = 2;j<=(i/2);j++)
			{
				if(i%j == 0)
				{
					flg=0;
					break;
				}
			
				
				
				}
				if (flg == 1) {
				
                System.out.print(i + " ");	
				
			}
			//System.out.println(i);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 100;
		
		primeNum(num);
		

	}
	
	
		

}
