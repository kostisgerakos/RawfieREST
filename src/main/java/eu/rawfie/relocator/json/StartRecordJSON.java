package eu.rawfie.relocator.json;

import org.json.JSONObject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import java.sql.Statement;

public class StartRecordJSON {
	
	final private String startRecordJSON;
	private String executionId;
	private String testbed_id;
	private String[] device_ids;

	public StartRecordJSON(String executionId, String testbed_id, String[] device_ids) {
		this.executionId = executionId;
		this.testbed_id = testbed_id;
		this.device_ids = device_ids;
		this.startRecordJSON = createJSON(true);
		

	}

	private String createJSON(boolean prettyPrint)  {
		JSONObject videoJson = new JSONObject();

		videoJson.put("executionId", executionId);
		videoJson.put("testbed_id", testbed_id);
		videoJson.put("device_ids",device_ids);
		
		if (prettyPrint) {
			return videoJson.toString(4);
		} else {
			return videoJson.toString();
		}

		//8a to xrhsimopoiei o Thanasis telika h emeis???
		//String name = null;
		/*String url = "jdbc:postgresql://172.19.0.6:5432/rawfie_db";
		Properties props = new Properties();
		props.setProperty("user", "postgres");
		props.setProperty("password", "");
		Connection conn = DriverManager.getConnection(url, props);
		System.out.println(conn);

		Statement stmt = null;
		stmt = conn.createStatement();

		String sql = "Select user_id from experiment_execution,experiment "
				+ "where experiment_execution.execution_id=722 and"
				+ " experiment.experiment_id=experiment_execution.experiment_id;";
		ResultSet rs = stmt.executeQuery(sql);
		while (rs.next()) {
			name = rs.getString("user_id");
		}
		System.out.println(name);
		stmt.close();
		conn.close();*/

	}
	
	public String getStartRecordJSON() {
		return startRecordJSON;
	}



}
