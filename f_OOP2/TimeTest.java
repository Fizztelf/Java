package f_OOP2;

public class TimeTest {
	public static void main(String[] args) {
		
		//DTO (Data Table Object)
		//VO (Variable Object)
		
		//40시간 --> 16
		//분 200분 --> 19:20
		//초 10000초 --> 22:6:40
		
		// 22시간   --> 22
		//분 100 --> 23:40
		// 초 10000초 --> 2:24:40
		
		TimeVO t = new TimeVO();

		t.setHour(40);
		int hour = t.getHour();
		System.out.println(hour+"시간");
		
		t.setMinute(200);
		int minute = t.getMinute();
		System.out.println(t.getAddHour()+"시간 "+minute+"분");
		
		t.setSecond(10000);
		int second = t.getSecond()+t.getAddSecond2()+t.getAddSecond1();
		System.out.println(minute);
		
	}
}


class TimeVO{
	private int hour;		// 시
	private int minute;		// 분
	private int second;		// 초
	
	void setHour(int hour){
		if(hour > 23){
			this.hour = hour%24;
		} else {
			this.hour = hour;
		}
	}

	int getHour(){
		return hour;
	}
	
	void setMinute(int minute){
		if(minute > 59){
			this.minute = minute%60;
			this.hour += minute/60;
		} else {
			this.minute = minute;
		}
	}
	
	int getMinute(){
		return minute;
	}
	
	int getAddHour(){
		return hour;
	}
	
	
	void setSecond(int second){
		if(second > 59){
			
			this.second = second%60;
			this.minute += minute/60;
			this.hour += second/60;
		} else {
			this.second = second;
		}
	}
	
	int getSecond(){
		return second;
	}
	
	int getAddSecond1(){
		return minute;
	}
	
	int getAddSecond2(){
		return hour;
	}
	
	
	
	
	
	
	
}

