package org.tellstick.device;

import org.tellstick.JNA;
import org.tellstick.device.SupportedMethodsException;
import org.tellstick.device.TellstickDevice;
import org.tellstick.device.TellstickException;

public class SceneDevice extends TellstickDevice{

	public SceneDevice(int deviceId) throws SupportedMethodsException {
		super(deviceId);
	}
	
	/**
	 * Executes Scene.
	 * 
	 * @throws TellstickException
	 */
	public void execute() throws TellstickException{
		int status = JNA.CLibrary.INSTANCE.tdExecute(getId());
		if (status != TELLSTICK_SUCCESS)throw new TellstickException(this, status);
	}
	
	public String getType(){
		return "Scene";
	}
}
