public class Percolation {
    private int [][] percGrid;
    private int [][] condition;
    private int [][] sz;
    // create N-by-N grid, with all sites blocked
    public Percolation(int N){
     //grid N*N   
     percGrid=new int[N][N];
     //open (1) or not (0)
     condition=new int[N][N];
     //sz [i][j] - number of object in subtree rooted at [i][j] 
     sz=new int[N][N];
     //filling all the arrays
     for(int i=1;i<=N;i++){
         for(int j=1;j<=N;j++){
             int cell=1;
             percGrid[i][j]=i;
             condition[i][j]=0;
             sz[i][j]=1;
             cell++;
         }
     }
    } 
    // open site (row i, column j) if it is not already
    public void open(int i, int j){
        if (condition[i][j]==0){
        condition[i][j]=1;
        
        }
    }
    // is site (row i, column j) open?
    public boolean isOpen(int i,int j){
        return condition[i][j]==1;       
    }
    // is site (row i, column j) full (connected to top)?
    public boolean isFull(int i,int j){}
    // does the system percolate?
    public boolean percolates(){}
}