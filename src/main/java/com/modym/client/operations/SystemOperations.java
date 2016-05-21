/************************************************************************ 
 * Copyright MODYM, Ltd.
 */
package com.modym.client.operations;

import java.math.BigDecimal;
import java.util.List;

import com.modym.client.ModymException;
import com.modym.client.objects.ModymCity;
import com.modym.client.objects.ModymCountry;
import com.modym.client.response.BigDecimalResponse;
import com.modym.client.response.CityListResponse;
import com.modym.client.response.CountryListResponse;
import com.modym.client.response.StringResponse;

/**
 * @author bashar
 *
 */
public class SystemOperations extends AbstractOperations {

    /**
     * 
     */
    public SystemOperations(ModymApiTransport transport) {
        super(transport);
    }

    /*******************************************************************************************************************
     * SYSTEM CALLS
     */

    public String getProgramName() throws ModymException {
        return "[Reward Program]";
    }

    public String getSystemCurrency() throws ModymException {
        return this.transport.doGet("system/currency", null, null, StringResponse.class).getResult();
    }

    public BigDecimal getSystemPointConversionRate() throws ModymException {
        return this.transport.doGet("system/pointConversionRate", null, null, BigDecimalResponse.class).getResult();
    }

    public List<ModymCountry> getCountries() throws ModymException {
        return this.transport.doGet("system/countries", null, null, CountryListResponse.class).getResult();
    }

    public List<ModymCity> getCountryCities(long countryId) throws ModymException {
        return this.transport.doGet("system/countries/" + countryId + "/cities", null, null, CityListResponse.class)
                .getResult();
    }

    public List<ModymCity> getCountryCities(String countryIso23) throws ModymException {
        return this.transport.doGet("system/countries/" + countryIso23 + "/cities", null, null, CityListResponse.class)
                .getResult();
    }

}