package pe.com.gmd.seguridad.json;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

public class JsonStringIntegerDeserializer extends JsonDeserializer<Integer> {

    @Override
    public Integer deserialize(JsonParser p, DeserializationContext ctxt) throws IOException, JsonProcessingException {
    	
        
    	String value = p.getText();
        try {
            if (value!= null && value.equals("Si")) {
                return 1;
            }
            
            return 0;
        }
        catch (Exception pe) {
            throw new RuntimeException(pe);
        }
    }

}