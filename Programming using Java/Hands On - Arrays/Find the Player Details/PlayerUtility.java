public class PlayerUtility {
	public Player findPlayerDetailsById(Player[] arr, int playerIdToSearch){
		for (int i=0;i<arr.length ;i++ ) {
		    if(arr[i].getPlayerId()==playerIdToSearch)
		        return arr[i];
		}
		return null;
	}
}