
import java.util.Scanner;

public class GetSet  extends IpHeader{



    public static void main(String[] args) {


        IpHeader ip = new IpHeader();
        Scanner sc = new Scanner(System.in);

              System.out.println("bitte version eingeben");
              ip.version = Integer.parseInt(sc.next());

              System.out.println("Bitte IHL eingeben");
              ip.ihl = Integer.parseInt(sc.next());

              System.out.println("Bitte TOS eingeben ");
              ip.tos = Integer.parseInt(sc.next());

              System.out.println("Bitte Packetlenge  eingeben ");
              ip.packetleanger = Integer.parseInt(sc.next());

              System.out.println("Bitte Kennung eingeben ");
              ip.kennung = Integer.parseInt(sc.next());

              System.out.println("Bitte Flags eingeben ");
              ip.flags = String.valueOf(Integer.parseInt(sc.next()));

              System.out.println("Bitte Fragment-Offset eingeben ");
              ip.fragment_offset = Integer.parseInt(sc.next());

              System.out.println("Bitte TTL eingeben ");
              ip.ttl = Integer.parseInt(sc.next());

              System.out.println("Bitte Protokoll eingeben ");
              ip.protokoll = Integer.parseInt(sc.next());

              System.out.println("Bitte Header-Checksum eingeben ");
              ip.header_checksum = Integer.parseInt(sc.next());

              System.out.println("Bitte Quell-IP-Adresse angeben");
              ip.quiel_ip = sc.next();

              System.out.println("Bitte Ziel-IP angeben");
              ip.ziel_ip= sc.next();


        System.out.println("Ausgabe"+ip.version+"-"+ip.getIhl()+"-"+ip.tos+"-"+ip.getPacketleanger()+"-"+ip.kennung+"-"+
                            ip.flags+"-"+ip.fragment_offset+"-"+ip.ttl+"-"+ip.protokoll+"-"+ip.header_checksum
                            +"-"+ip.quiel_ip+"-"+ip.ziel_ip);



        String headerChecksum = "4-6-24-6-0-000-0-32-0-0-195.168.1.102-195.168.1.102";
        System.out.println(Function.translateHeaderChecksum(headerChecksum));





        System.out.println(Function.getDecimal(100 ) +"-"+ Function.getDecimal(110)+"-"+ Function.getDecimal( 11000)
                +"-"+ Function.getDecimal(110)
                +"-"+ Function.getDecimal(0000000000000000)+"-"+ Function.getDecimal(000)+"-"+ Function.getDecimal(0000000000000)+"-"+
                Function.getDecimal(100000)+"-"+ Function.getDecimal(00000000)+"-"+ Function.getDecimal(0000000000000000)+" "+
                Function.getDecimal(11000011)+"."+ Function.getDecimal(10101000)+"."+ Function.getDecimal(0000001)+"."+ Function.getDecimal(1100110)
                +"-"+ Function.getDecimal(11011111)+"."+ Function.getDecimal(10101000)+"."+ Function.getDecimal(1)+"."+
                Function.getDecimal(1100110));    }


}










































