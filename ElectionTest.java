public class ElectionTest
{
    static Election createElection(){
        Election obj = new Election();
        obj.addACandidate("Donald", "Trump", 'R', true);
        obj.addACandidate("Ben", "Carson", 'R', false);
        obj.addACandidate("Jeb", "Bush", 'R', false);
        obj.addACandidate("Hillary", "Clinton", 'D', true);
        obj.addACandidate("Bernie", "Sanders", 'D', false);
        obj.addACandidate("Jim", "Webb", 'D', false);
        return obj;
    }
	public static void main(String[] args) {
	    Election obj = createElection();
	    obj.displayAllCandidates();
	}
}
