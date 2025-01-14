
package udmi.schema;

import java.util.Date;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * State
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "timestamp",
    "version",
    "system",
    "gateway",
    "blobset",
    "pointset"
})
@Generated("jsonschema2pojo")
public class State {

    /**
     * RFC 3339 Timestamp the state payload was generated
     * (Required)
     * 
     */
    @JsonProperty("timestamp")
    @JsonPropertyDescription("RFC 3339 Timestamp the state payload was generated")
    public Date timestamp;
    /**
     * Major version of the UDMI schema
     * (Required)
     * 
     */
    @JsonProperty("version")
    @JsonPropertyDescription("Major version of the UDMI schema")
    public Integer version;
    /**
     * System State
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("system")
    public SystemState system;
    /**
     * Gateway State
     * <p>
     * Read more: <https://github.com/faucetsdn/udmi/blob/master/docs/gateway.md>
     * 
     */
    @JsonProperty("gateway")
    @JsonPropertyDescription("Read more: <https://github.com/faucetsdn/udmi/blob/master/docs/gateway.md>")
    public GatewayState gateway;
    /**
     * Blobset State
     * <p>
     * 
     * 
     */
    @JsonProperty("blobset")
    public BlobsetState blobset;
    /**
     * Pointset State
     * <p>
     * A set of points reporting telemetry data.
     * 
     */
    @JsonProperty("pointset")
    @JsonPropertyDescription("A set of points reporting telemetry data.")
    public PointsetState pointset;

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.system == null)? 0 :this.system.hashCode()));
        result = ((result* 31)+((this.pointset == null)? 0 :this.pointset.hashCode()));
        result = ((result* 31)+((this.version == null)? 0 :this.version.hashCode()));
        result = ((result* 31)+((this.blobset == null)? 0 :this.blobset.hashCode()));
        result = ((result* 31)+((this.gateway == null)? 0 :this.gateway.hashCode()));
        result = ((result* 31)+((this.timestamp == null)? 0 :this.timestamp.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof State) == false) {
            return false;
        }
        State rhs = ((State) other);
        return (((((((this.system == rhs.system)||((this.system!= null)&&this.system.equals(rhs.system)))&&((this.pointset == rhs.pointset)||((this.pointset!= null)&&this.pointset.equals(rhs.pointset))))&&((this.version == rhs.version)||((this.version!= null)&&this.version.equals(rhs.version))))&&((this.blobset == rhs.blobset)||((this.blobset!= null)&&this.blobset.equals(rhs.blobset))))&&((this.gateway == rhs.gateway)||((this.gateway!= null)&&this.gateway.equals(rhs.gateway))))&&((this.timestamp == rhs.timestamp)||((this.timestamp!= null)&&this.timestamp.equals(rhs.timestamp))));
    }

}
