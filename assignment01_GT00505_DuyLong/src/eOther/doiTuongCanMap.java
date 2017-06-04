package eOther;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import aClass.Customer;

public class doiTuongCanMap {

	
	public doiTuongCanMap() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ObjectMapper doiTuongMap(){
		ObjectMapper mapper = new ObjectMapper();
		return mapper;
	}

	
}

//public class doiTuongCanMap<tlop> {
//
//	
//	
//	public doiTuongCanMap() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//
//	public static ObjectMapper doiTuongMap(){
//		ObjectMapper mapper = new ObjectMapper();
//		return mapper;
//	}
//	
//	public <T> List map_List(Class<T> tlop, File f) throws JsonParseException, JsonMappingException, IOException {
//		List<tlop> listDoiTuong = 
//				doiTuongMap().readValue(f, new TypeReference<List<tlop>>() {
//				});
//		return listDoiTuong;
//	}
//	
//	
//	
//}
