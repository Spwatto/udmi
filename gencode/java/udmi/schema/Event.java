
package udmi.schema;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Event
 * <p>
 * Container object for all event schemas, not directly used.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "system",
    "pointset",
    "discovery"
})
@Generated("jsonschema2pojo")
public class Event {

    /**
     * System Event
     * <p>
     * 
     * 
     */
    @JsonProperty("system")
    public SystemEvent system;
    /**
     * Pointset Event
     * <p>
     * A set of points reporting telemetry data
     * 
     */
    @JsonProperty("pointset")
    @JsonPropertyDescription("A set of points reporting telemetry data")
    public PointsetEvent pointset;
    /**
     * Discovery
     * <p>
     * Read more: <https://github.com/faucetsdn/udmi/blob/master/docs/discovery.md>
     * 
     */
    @JsonProperty("discovery")
    @JsonPropertyDescription("Read more: <https://github.com/faucetsdn/udmi/blob/master/docs/discovery.md>")
    public Discovery discovery;

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.pointset == null)? 0 :this.pointset.hashCode()));
        result = ((result* 31)+((this.system == null)? 0 :this.system.hashCode()));
        result = ((result* 31)+((this.discovery == null)? 0 :this.discovery.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Event) == false) {
            return false;
        }
        Event rhs = ((Event) other);
        return ((((this.pointset == rhs.pointset)||((this.pointset!= null)&&this.pointset.equals(rhs.pointset)))&&((this.system == rhs.system)||((this.system!= null)&&this.system.equals(rhs.system))))&&((this.discovery == rhs.discovery)||((this.discovery!= null)&&this.discovery.equals(rhs.discovery))));
    }

}
