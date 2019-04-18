/**
 * This Queue maintains the queue of messages coming from connected clients.
 */
public class P2PMessageQueue {

    private P2PMessage head = null;
    private P2PMessage tail = null;


    /**
     * This method allows adding a message object to the existing queue.
     * @param oMessage
     */
    public synchronized void enqueue(P2PMessage oMessage){

//		#####################
//		### ADD CODE HERE ###
//		#####################

    P2Message newMesssage=new P2Message (oMessage,null);
    if (isEmpty()) {
        head = newMesssage;
    }
            else {
                tail.next=newMesssage;
        }


        ///checking head is null and tail.



    /**
     * This method allows removing a message object from the existing queue.
     * @return
     */
    public synchronized P2PMessage dequeue(){

//		#####################
//		### ADD CODE HERE ###
//		#####################

            if (isEmpty()){
                throw new NoSuchElementException();
            }
            P2Message oMessage


    public boolean hasNodes(){

//		#####################
//		### ADD CODE HERE ###
//		#####################
//                1.This returns true or false depending on if any nodes exist in queue.
//                2.Code will be reviewed in class
        return head==null;

    }
}

