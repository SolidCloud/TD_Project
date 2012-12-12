package se.chalmers.chraker.jolinds.tdproject;

public class GameUtils {
	public static int modSub(int a, int b){
		return a>=0?
				a-b<0?0:a-b:
					a-b>0?0:a-b;
	}
}
