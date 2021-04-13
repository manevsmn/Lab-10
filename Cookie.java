class Cookie {
  
  int numCookies;
  int bakeTime;
  int bakeTemp;
  boolean isBaked;

  Cookie() {
    numCookies = 0;
    bakeTime = 0;
    bakeTemp = 0;
    isBaked = false;
  }

  Cookie(int aNumCookies,  int aBakeTime, int aBakeTemp) {
    numCookies = aNumCookies;
    bakeTime = aBakeTime;
    bakeTemp = aBakeTemp;
    isBaked = false;
  }

  boolean getIsBaked() {
    return isBaked;
  }

  void setNumCookies(int aNumCookies){
    numCookies = aNumCookies;
  }

  void bakeCookies (int aBakeTemp, int aBakeMinutes) {
    
    System.out.println("The cookies were baked at " + aBakeTemp + " degrees F for " + aBakeMinutes + " minutes");
    isBaked = true;
  }
}