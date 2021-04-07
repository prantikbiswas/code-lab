package com.conceptfactory.problems.bitwise;

public class IpSubnet {

    public static void main(String[] args) {
        IpSubnet net = new IpSubnet();

        net.isInSubnet("10.0.0.44", "10.0.0.0/8");
    }

    public boolean isInSubnet(String address, String cidr) {
        int range = Integer.parseInt(cidr.split("/")[1]);

        int netmask = Integer.MAX_VALUE << range;
        int net = ipAddressToInt(cidr.split("/")[0]);
        int ip = ipAddressToInt(address);

        int ipNet = ip & netmask;

        return ipNet == net;
    }

    int ipAddressToInt(String ip) {
        String[] parts = ip.split("\\.");

        int a = Integer.parseInt(parts[0]);
        int b = Integer.parseInt(parts[1]);
        int c = Integer.parseInt(parts[2]);
        int d = Integer.parseInt(parts[3]);

        return a << 24 | b << 16 | c << 16 | d;
    }
}
