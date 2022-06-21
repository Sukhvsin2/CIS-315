public class ElectionTest
{
    static Election createElection(){
        Election el = new Election();
        Candidate obj = new Candidate("Donald", "Trump", 'R', true);
        Candidate obj1 = new Candidate("Ben", "Carson", 'R', false);
        Candidate obj2 = new Candidate("Jeb", "Bush", 'R', false);
        Candidate obj3 = new Candidate("Hillary", "Clinton", 'D', true);
        Candidate obj4 = new Candidate("Bernie", "Sanders", 'D', false);
        Candidate obj5 = new Candidate("Jim", "Webb", 'D', false);
        el.addACandidate(obj);
        el.addACandidate(obj1);
        el.addACandidate(obj2);
        el.addACandidate(obj3);
        el.addACandidate(obj4);
        el.addACandidate(obj5);
        return el;
    }
	public static void main(String[] args) {
	    Election obj = createElection();
	    obj.displayAllCandidates();
	}
}
