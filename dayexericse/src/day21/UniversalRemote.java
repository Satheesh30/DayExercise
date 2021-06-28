package day21;

public class UniversalRemote {
	public static void main(String[] args) {
		System.out.println("demonstration of remote");
		Tv tv=new Tv();
		SetTopBox set=new SetTopBox();
		Netflix net=new Netflix();
		SoundSystem sound=new SoundSystem();
		FatherNewsChannel fncc=new FatherNewsChannel(tv,set,sound,net);
		MotherSerial msc=new MotherSerial(tv,set,sound,net);
		MotherOldMovie moc=new MotherOldMovie(tv,set,sound,net);
		
		Remote universalremote=new Remote();
	//	universalremote.executeCommad(1);
		universalremote.setCommad(fncc, 1);
		universalremote.setCommad(msc, 2);
		universalremote.setCommad(moc, 3);
		universalremote.executeCommad(1);
		
	}

}
class Tv{
	public void av() {
		System.out.println("tv switched to...");
}
	public void switchon() {
		System.out.println("tv is on..");
	}
}
class SetTopBox{
	public void newsChannel() {
		System.out.println("news channel....");
	}
	public void serialChannel() {
		System.out.println("serial channel...");
	}
}
class Netflix{
	public void movieOld()
	{
		System.out.println("old movie...");
	}
	public void movieNew()
	{
		System.out.println("new movie..");
	}
}
class SoundSystem{
	public void lowSound() {
		System.out.println("sound volume .. decreased..");
	}
}
interface Command{
	public void execute();
}
class FatherNewsChannel implements Command{
	Tv tv;SetTopBox set;SoundSystem sound;Netflix net;
	
	public FatherNewsChannel(Tv tv, SetTopBox set, SoundSystem sound, Netflix net) {
	
		this.tv=tv;
		this.set=set;
		this.net=net;
		this.sound=sound;
	}
	
	public void execute() {
		System.out.println("father tv action.. started..");
		tv.switchon();
		tv.av();
		set.newsChannel();
		sound.lowSound();
		System.out.println("dad enjoy news channel..");
	}
}
class MotherOldMovie implements Command{
	Tv tv;SetTopBox set;Netflix net;SoundSystem sound;
	public MotherOldMovie(Tv tv,SetTopBox set,SoundSystem sound,Netflix net) {
	this.tv=tv;
	this.set=set;
	this.net=net;
	this.sound=sound;
	}
	@Override
	public void execute() {
		System.out.println("mother tv action.. started..");
		tv.switchon();
		tv.av();
		net.movieOld();
		sound.lowSound();
		System.out.println("mother enjoy in old movie....");
	}
}
class MotherSerial implements Command{
	Tv tv;SetTopBox set;Netflix net;SoundSystem sound;
	public MotherSerial(Tv tv,SetTopBox set,SoundSystem sound,Netflix net) {
	this.tv=tv;
	this.set=set;
	this.net=net;
	this.sound=sound;
	}
	@Override
	public void execute() {
	System.out.println("mother tv action started...");
	tv.switchon();
	tv.av();
	set.serialChannel();
	sound.lowSound();
	System.out.println("mother enjoy serial ....");
	}
}
class Dummy implements Command{
	public void execute() {
		System.out.println("i am dummy ....");
	}
} 
class Remote{
	Command command[]=new Command[5];
	public Remote() {
		for(int i=0;i<command.length;i++) {
			command[i]=new Dummy();
		
		}
	
	}
	public void setCommad(Command command,int slot) {
		this.command[slot]=command;
		
	}
	public void executeCommad(int slot) {
		command[slot].execute();
	}
}