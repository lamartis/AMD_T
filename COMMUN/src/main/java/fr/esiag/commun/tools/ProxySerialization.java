package fr.esiag.commun.tools;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ProxySerialization {

	public static byte [] serializeFrom (Object object) throws IOException {
		ByteArrayOutputStream byteOutputStream = new ByteArrayOutputStream();
		ObjectOutputStream objectOuputStream = new ObjectOutputStream(byteOutputStream);

		if (object instanceof Serializable) {
			objectOuputStream.writeObject(object);
		} else {
			throw new NotSerializableException();
		}

		return byteOutputStream.toByteArray();
	}


	public static Object unserializeFrom (byte [] stream) throws IOException, ClassNotFoundException {
		ByteArrayInputStream byteInputStream = new ByteArrayInputStream(stream);
		ObjectInputStream objectOuputStream = new ObjectInputStream(byteInputStream);
		
		return objectOuputStream.readObject();
	}



}
