class Candidate{
    private String firstName, lastName;
    private char party;
    private Boolean trustWorthy;
    
    public Candidate(String firstName, String lastName, char party, Boolean trustWorthy){
        this.firstName = firstName;
        this.lastName = lastName;
        this.party = party;
        this.trustWorthy = trustWorthy;
    }
    
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public char getParty(){
        return party;
    }
    public Boolean getTrustWorthy(){
        return trustWorthy;
    }
    public void setParty(char p){
        party = p;
    }
    public void setTrustWorthy(Boolean t){
        trustWorthy = t;
    }
}