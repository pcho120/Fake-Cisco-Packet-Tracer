/**
 *
 * @author Marcus Jones
 */ 
/*
package config;

import java.util.ArrayList;
import java.util.Iterator;

public class Hub {

	infoList = new ArrayList<>();
	String name ;
	String info ;
	String subnet ;
	String netmask ;

	public String getName() {
        return name;
    }
	public void setName(String name) {
        this.name = name;
    }
	public String getInfo() {
        return info;
    }
	public void setInfo(String info) {
		this.info = info;
	}
	public void generateInfo() {
		if (infoList.size() > 0) {
            for (int n = 0; n < infoList
			List.size(); n++) {
                if (n == 0) {
                    this.inf = infoList
					.get(n);
                } else {
                    this.inf += ", " + infoList
					.get(n);
                }
            }
        } else {
            this.inf = "";
        	
	}
	public void addInfo(String string) {
        if (!this.infoList
		.contains(string)) {
            this.infoList
			.add(string);
            generateInf();
        }
	}
	public void removeInfo(String string) {
        if (this.infoList
		.contains(string)) {
            this.infoList
			.remove(string);
            generateInf();
        }
    }
	public void removeVM(String name) {
        for (Iterator<String> iterator = this.infoList
		.iterator(); iterator.hasNext();) {
            String listItem = iterator.next();
            if (listItem.contains(name)) {
                iterator.remove();
            }
        }
        generateInf();
    }
	public String getSubnet() {
        return subnet;
    }
	public setSubnet() {
		if (validIP(subnet)) { //check if is valid IP
            this.subnet = subnet;
            return true;
        } else {
            return false;
        }
	}
	public String getNetmask() {
        return netmask;
    }
   public boolean setNetmask(String netmask) {
        if (validIP(netmask)) { //check if is valid IP
            this.netmask = netmask;
            return true;
        } else {
            return false;
        }
    }
	//Check if IP is valid
	public boolean validIP (String IP) {
		String[] parts = ip.split( "\\." );
		if(IP == null){
			return 0;
		}
		for (String s:parts){
			int i = Integer.parseInt(s);
			if ((i < 0) || (i>255)){
				return 0;
			}
		}
		if(parts.length != 4){
			return 0;
		}
	}
}

*/ 