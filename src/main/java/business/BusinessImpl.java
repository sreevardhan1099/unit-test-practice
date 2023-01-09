package business;

public class BusinessImpl {

    private DataService dataService;

    public BusinessImpl(DataService dataService) {
        this.dataService = dataService;
    }

    public int findGreatesvalue(){
        int greatest=Integer.MIN_VALUE;
        int[] data = dataService.retrieveAllData();
        for(int i:data){
            if(i>greatest){
                greatest=i;
            }
        }
        return greatest;
    }

}


