package animationListCreator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//<item android:drawable="@drawable/icon_selector1_000000" android:duration="30" />
		String after=null;
		String drawableName = "loading_anim_";
		int duration = 30;
		int frames = 167;
		
		for(int i=0; i<frames; i++)
		{
			if(i<10) after= "00000" + i;
			else if(i<100) after = "0000" + i;
			else after = "000" + i;
			
			System.out.println("<item android:drawable=\"@drawable/" + drawableName + after + "\" android:duration=\"" + duration + "\" />");
		}
		
		/*for(int i=0; i<20; i++)
		{
			if(i<10) after= "00000" + i;
			else if(i<100) after = "0000" + i;
			else after = "000" + i;
			
			System.out.println("<item android:drawable=\"@drawable/" + drawableName + after + "\" android:duration=\"" + duration + "\" />");
		}
		for(int i=19; i>-1; i--)
		{
			if(i<10) after= "00000" + i;
			else if(i<100) after = "0000" + i;
			else after = "000" + i;
			
			System.out.println("<item android:drawable=\"@drawable/" + drawableName + after + "\" android:duration=\"" + duration + "\" />");
		}*/
	}

}