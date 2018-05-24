package eu.rawfie.relocator.test;

import eu.rawfie.relocator.REST.StartRecordClient;
import eu.rawfie.relocator.json.StartRecordJSON;

public class Test {

	public static void main(String[] args) throws InterruptedException{
		StartRecordJSON json = new StartRecordJSON("722","hmod",new String[] { "hmod.inesctec.flexus.2", "hmod.inesctec.flexus.3", "hmod.inesctec.flexus.4" });
		StartRecordClient record = new StartRecordClient("http://...", json.getStartRecordJSON(),"http://....");
        Thread.sleep(10000);
		record.getStopClient().sendMessage();

	}

}
