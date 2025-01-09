public interface ITelephone
{
    void setMyNumber(String myNumber);
    void setIsBusy(boolean isBusy);
    void setOnCall(boolean onCall);
    String getMyNumber();
    boolean isIsBusy();
    boolean isOnCall();
    String setNumber();
    void dial(String number);
    void ringging();
    boolean answerCall(String number);
    void endCall();
    boolean call(String number);    
}
