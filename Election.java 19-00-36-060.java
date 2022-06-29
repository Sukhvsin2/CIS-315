class Election{
    private Candidate candidates[];
    
    public Election(){
        candidates = new Candidate[0];
    }
    
    private Candidate[] copyFunction(Candidate[] arr){
        Candidate temp[] = new Candidate[arr.length + 1];
        for(int i=0;i<Candidate.length;i++){
            temp[i] = Candidate[i];
        }
        return temp;
    }
    public void addACandidate(Candidate obj){
        candidates = copyFunction(candidates);
        candidates[candidates.length - 1] = obj;
        
        // System.out.println(arr[0].getFirstName());
    }
    public void displayAllCandidates(){
        System.out.println("Some of the major candidates in the 2016 election were:\n");
        System.out.format("%-13s %-13s %-13s %-10s\n", "First Name", "Last Name", "Party", "Trustworthy");
        System.out.println("--------------------------------------------");
        for (int i=0; i<candidates.length; i++){
            System.out.format("%-13s %-13s %-13s %-10s\n", candidates[i].getFirstName(), candidates[i].getLastName(), candidates[i].getParty(), candidates[i].getTrustWorthy());
        }
    }
}