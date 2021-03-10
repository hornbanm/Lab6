class Tree{
  private String treeName;
  private String treeType;
  private boolean leavesFall;
  private String leafColor;

  Tree(){
    treeName = "";
    treeType = "";
    leavesFall = false;
    leafColor = "";
  }

  Tree(String aTreeName, String aTreeType, boolean aLeavesFall, String aLeafColor){
    treeName = aTreeName;
    treeType = aTreeType;
    leavesFall = aLeavesFall;
    leafColor = aLeafColor;
  }

  void setName(String theName){
    treeName = theName;
  }
  void setType(String theType){
    treeType = theType;
  }  
  void setLeavesGone(boolean theLeavesGone){
    leavesFall = theLeavesGone;
  }  
  void setColor(String theColor){
    leafColor = theColor;
  }

  String getName(){
    return treeName;
  }
  String getType(){
    return treeType;
  }
  boolean getLeavesGone(){
    return leavesFall;
  }
  String getColor(){
    return leafColor;
  }

  void print() {
    String leavesStatus;
    if (leavesFall == true) {
      leavesStatus = "does";}
      else{
        leavesStatus = "does not";}

        System.out.println("This is a " + treeName + " tree. It is a " + treeType + " and its leaves are currently " + leafColor + ". It " + leavesStatus + " lose its leaves for the winter.");
  }  
}