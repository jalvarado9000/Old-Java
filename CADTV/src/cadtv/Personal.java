package cadtv;

public class Personal {

	private String name;
	private int id = 99;
	private int channel;
	
	Personal(String n, int cha, int i){
		name = n;
		channel = cha;
		id++;
		
	}
	
	
	String get_name() {return name;}
	int get_channelId() {return id;}
	int get_channel() {return channel;}
	
	
	
	
}
