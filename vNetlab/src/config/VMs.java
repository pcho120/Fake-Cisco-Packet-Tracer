//written by Paul
package config;

import java.util.HashMap;


public class VMs {
    public String type, name, os, ver, src, eth0, eth1, eth2;
    public HashMap<String, String> connections = new HashMap<>();

    VMs (String name) {
        this.type = "VM";
        this.name = name;
        System.out.println("New VM created: " + this.name);
    }

    public String connectionAdd(String host, String conn) {
        if(connections.get(host) != null){
            return "Already connected";
        }
        else {
            connections.put(host, conn);
            return "Add " + host + ", " + conn + " to " + this.name;
        }
    }

    public String connectionRemove(String host){
        if (connections.get(host) != null){
            connections.remove(host);
            return "Connection removed " + this.name + "+" + host;
        }
        else {
            return "Connection remove failed";
        }
    }

    public void checkToRemoveHub (String H){
        for (String port : connections.keySet()) {
            if(connections.get(port).contains(H)) {
                connections.remove(port);
            }
        }
    }

    public String getName() {
        return name;
    }
    public void setName(String n) {
        this.name = n;
    }

    public String getOs() {
        return os;
    }
    public void setOs(String o){
        this.os = o;
    }

    public String getVr() {
        return ver;
    }
    public void setVr(String v) {
        this.ver = v;
    
    }

    public String getSrc() {
        return src;
    }
    public void setSrc(String s) {
        this.src = s;
    }
    
    public String getEh0() {
        return eth0;
    }
    public boolean setEth0(String eth0){
        if(validIP(eth0)){
            this.eth0 = eth0;
            return true;
        } else {
            return false;
        }
    }

    public String getEth1(){
        return eth1;
    }
    public boolean setEth1(String eth1){
        if(validIP(eth1)){
            this.eth1 = eth1;
            return true;
        } else {
            return false;
        }
    }

    public String getEth2(){
        return eth2;
    }
    public boolean setEth2(String eth2){
        if(validIP(eth2)){
            this.eth2 = eth2;
            return true;
        } else {
            return false;
        }
    }
    
    public boolean validIP (String IP) {
        String[] parts = IP.split( "\\." );
        if(IP == null){
            return true;
        }
        for (String s:parts){
            int i = Integer.parseInt(s);
            if ((i < 0) || (i>255)){
                return false;
            }
        }
        if(parts.length != 4){
            return false;
        }
        if(IP.endsWith(".")){
            return false;
        }
        return true;
    }
}
