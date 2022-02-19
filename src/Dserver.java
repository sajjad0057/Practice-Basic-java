
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class Dserver {
    private DatagramSocket datagramSocket;
    public Dserver() throws IOException {
        datagramSocket=new DatagramSocket(5000);
        while (true)
        {
            byte[] data=new byte[1024];
            DatagramPacket dp=new DatagramPacket(data,data.length);
            datagramSocket.receive(dp);

            System.out.println("Packet received form: "+ dp.getAddress()+":"+dp.getPort()+" -> "+dp.getLength());
            System.out.println(new String(dp.getData()));

            //sending echo packet
            datagramSocket.send(dp);
        }
    }

    public static void main(String[] args) throws IOException {
        new Dserver();
    }
}