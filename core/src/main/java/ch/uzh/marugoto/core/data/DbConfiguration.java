package ch.uzh.marugoto.core.data;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import com.arangodb.ArangoDB;
import com.arangodb.ArangoDB.Builder;
import com.arangodb.springframework.annotation.EnableArangoRepositories;
import com.arangodb.springframework.config.AbstractArangoConfiguration;

/**
 * Configuration for ArangoDB access. The connection settings are stored in the
 * application(-XXX).properties files.
 */
@Configuration
@EnableArangoRepositories(basePackages = { "ch.uzh.marugoto" })
public class DbConfiguration extends AbstractArangoConfiguration {

	/**
	 * Reads database name from application.properties file.
	 */
	@Value("${marugoto.database}")
	private String dbName;

	@Override
	public Builder arango() {
		// Reads application.properties file according to active profile (default,
		// testing)
		return new ArangoDB.Builder();
	}

	@Override
	public String database() {
		return dbName;
	}
}