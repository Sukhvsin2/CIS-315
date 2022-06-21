class Election{
    private Candidate arr[];
    
    public Election(){
        arr = new Candidate[0];
    }
    
    private Candidate[] copyFunction(Candidate[] arr){
        Candidate temp[] = new Candidate[arr.length + 1];
        for(int i=0;i<arr.length;i++){
            temp[i] = arr[i];
        }
        return temp;
    }
    public void addACandidate(String fName, String lName, char p, Boolean t){
        Candidate obj = new Candidate(fName, lName, p, t);
        arr = copyFunction(arr);
        arr[arr.length - 1] = obj;
        
        // System.out.println(arr[0].getFirstName());
    }
    public void displayAllCandidates(){
        System.out.println("Some of the major candidates in the 2016 election were:\n");
        System.out.format("%-13s %-13s %-13s %-10s\n", "First Name", "Last Name", "Party", "Trustworthy");
        System.out.println("--------------------------------------------");
        for (int i=0; i<arr.length; i++){
            System.out.format("%-13s %-13s %-13s %-10s\n", arr[i].getFirstName(), arr[i].getLastName(), arr[i].getParty(), arr[i].getTrustWorthy());
        }
    }
}