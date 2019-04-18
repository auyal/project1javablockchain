import java.io.*;
import java.net.InetSocketAddress;
import java.net.Socket;


/**
 * This class holds any utility methods needed for P2P networking communication.
 */
public class P2PUtil {


    /**
     * Allows a one time socket call to a server, gets reply, and then closes connection.
     * @param sIP
     * @param iPort
     * @param sMessage
     * @return
     */
    public static String connectForOneMessage(String sIP, int iPort, String sMessage){

//		#####################
//		### ADD CODE HERE ###
//		#####################


        try (Socket oSocket = new Socket()) {
            oSocket.connect(new InetSocketAddress (sIP, iPort));

            OutputStream output = oSocket.getOutputStream();
            PrintWriter write = new PrintWriter(output, true);

            write.println(sMessage);

            write.flush();

            InputStream input =oSocket.getInputStream();
            BufferedReader oReader= new BufferedReader(new InputStreamReader (input));

            String sReceiveMessage= oReader.readLine();




            oSocket.close();
            return sReceiveMessage;





        } catch (Exception ex) {

            System.out.println("Error from client: " + ex.getMessage());
            return null;
        }
    }
    }
}
