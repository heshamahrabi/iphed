public class IpHeader {
    int version ;
    int ihl;
    int tos;
    int packetleanger;
    int kennung;
    String flags;
    int fragment_offset;
    int ttl;
    int protokoll;
    int header_checksum;
    String quiel_ip;
    String ziel_ip;



    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public int getIhl() {
        int bit = 8;
        int byt = 32;
        int result;
        return result=ihl*bit/byt;
    }

    public void setIhl(int ihl) {
        this.ihl = ihl;
    }

    public int getTos() {
        return tos;
    }

    public void setTos(int tos) {
        this.tos = tos;
    }

    public int getPacketleanger()
    {
        int bit = 8;
        int byt = 32;
        int result;
        return result=ihl*bit/byt;
    }

    public void setPacketleanger(int packetleanger) {
        this.packetleanger = packetleanger;
    }

    public int getKennung() {
        return kennung;
    }

    public void setKennung(int kennung) {
        this.kennung = kennung;
    }

    public String getFlags() {
        return flags;
    }

    public void setFlags(String flags) {
        this.flags = flags;
    }

    public int getFragment_offset() {
        return fragment_offset;
    }

    public void setFragment_offset(int fragment_offset) {
        this.fragment_offset = fragment_offset;
    }

    public int getTtl() {
        return ttl;
    }

    public void setTtl(int ttl) {
        this.ttl = ttl;
    }

    public int getProtokoll() {
        return protokoll;
    }

    public void setProtokoll(int protokoll) {
        this.protokoll = protokoll;
    }

    public int getHeader_checksum() {
        return header_checksum;
    }

    public void setHeader_checksum(int header_checksum) {
        this.header_checksum = header_checksum;
    }

    public String getQuiel_ip() {
        return quiel_ip;
    }

    public void setQuiel_ip(String quiel_ip) {
        this.quiel_ip = quiel_ip;
    }

    public String getZiel_ip() {
        return ziel_ip;
    }

    public void setZiel_ip(String  ziel_ip) {
        this.ziel_ip = ziel_ip;
    }

    @Override
    public String toString() {
        return "IpHeader{" +
                "version=" + version +
                ", ihl=" + ihl +
                ", tos=" + tos +
                ", packetleanger=" + packetleanger +
                ", kennung=" + kennung +
                ", flags=" + flags +
                ", fragment_offset=" + fragment_offset +
                ", ttl=" + ttl +
                ", protokoll=" + protokoll +
                ", header_checksum=" + header_checksum +
                ", quiel_ip=" + quiel_ip +
                ", ziel_ip=" + ziel_ip +
                '}';
    }



}



