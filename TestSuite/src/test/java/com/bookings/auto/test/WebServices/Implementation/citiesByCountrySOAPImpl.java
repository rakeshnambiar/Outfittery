package com.bookings.auto.test.WebServices.Implementation;

import net.webservicex.GetCitiesByCountry;
import net.webservicex.GetCitiesByCountryResponse;
import net.webservicex.GlobalWeather;
import net.webservicex.GlobalWeatherSoap;

import javax.xml.bind.JAXBContext;
import javax.xml.namespace.QName;
import javax.xml.soap.SOAPMessage;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;
import java.io.ByteArrayOutputStream;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.logging.Handler;

/**
 * Created by rakeshnambiar on 9/3/16.
 */
public class citiesByCountrySOAPImpl {

    public static void testWeatherByCountry() throws Exception {
        try{
            System.setProperty("com.sun.xml.ws.transport.http.client.HttpTransportPipe.dump", "true");
            System.setProperty("com.sun.xml.internal.ws.transport.http.client.HttpTransportPipe.dump", "true");
            System.setProperty("com.sun.xml.ws.transport.http.HttpAdapter.dump", "true");
            System.setProperty("com.sun.xml.internal.ws.transport.http.HttpAdapter.dump", "true");
            System.setProperty("com.sun.xml.internal.ws.transport.http.HttpAdapter.dumpTreshold","999999");

            URL wsdl = new URL("http://compA.com/ws/server?wsdl");

            
            String endpointURL = "http://www.webservicex.net/globalweather.asmx";
            //BindingProvider bp = (BindingProvider)weatherPort;
            //bp.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, endpointURL);

            GetCitiesByCountry getcitiesByCountry = new GetCitiesByCountry();
            getcitiesByCountry.setCountryName("United Arab Emirates");
           
            //EMDSearchResponseType emdSearchResponseType = fqtemdSearchServicePort.searchEMD(emdSearchRequestType);

            //GlobalWeatherSoap globalWeather = new GlobalWeatherSoap();

        }catch (Exception e){
            throw new Exception("ERROR: While Testing the EMD Search Service");
        }
    }

}
