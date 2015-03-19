
package eu.europeana.corelib.definitions.jibx;

import java.util.ArrayList;
import java.util.List;

/** 
 *  The RDF root element declaration 
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://www.w3.org/ns/dcat#" xmlns:ns1="http://www.w3.org/2004/02/skos/core#" xmlns:ns2="http://xmlns.com/foaf/0.1/" xmlns:ns3="http://creativecommons.org/ns#" xmlns:ns4="http://www.europeana.eu/schemas/edm/" xmlns:ns5="http://www.openarchives.org/ore/terms/" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="RDF">
 *   &lt;xs:sequence minOccurs="1" maxOccurs="1">
 *     &lt;xs:element type="ns4:ProvidedCHOType" name="ProvidedCHO" minOccurs="1" maxOccurs="unbounded"/>
 *     &lt;xs:element type="ns4:WebResourceType" name="WebResource" minOccurs="0" maxOccurs="unbounded"/>
 *     &lt;xs:element type="ns4:AgentType" name="Agent" minOccurs="0" maxOccurs="unbounded"/>
 *     &lt;xs:element type="ns4:PlaceType" name="Place" minOccurs="0" maxOccurs="unbounded"/>
 *     &lt;xs:element type="ns4:TimeSpanType" name="TimeSpan" minOccurs="0" maxOccurs="unbounded"/>
 *     &lt;xs:element ref="ns1:Concept" minOccurs="0" maxOccurs="unbounded"/>
 *     &lt;xs:element ref="ns5:Aggregation" minOccurs="1" maxOccurs="unbounded"/>
 *     &lt;xs:element ref="ns5:Proxy" minOccurs="1" maxOccurs="unbounded"/>
 *     &lt;xs:element type="ns4:EuropeanaAggregationType" name="EuropeanaAggregation" minOccurs="1" maxOccurs="unbounded"/>
 *     &lt;xs:element ref="ns3:License" minOccurs="0" maxOccurs="unbounded"/>
 *     &lt;xs:element ref="ns2:Organization" minOccurs="0" maxOccurs="unbounded"/>
 *     &lt;xs:element ref="ns:Dataset" minOccurs="0" maxOccurs="unbounded"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class RDF
{
    private List<ProvidedCHOType> providedCHOList = new ArrayList<ProvidedCHOType>();
    private List<WebResourceType> webResourceList = new ArrayList<WebResourceType>();
    private List<AgentType> agentList = new ArrayList<AgentType>();
    private List<PlaceType> placeList = new ArrayList<PlaceType>();
    private List<TimeSpanType> timeSpanList = new ArrayList<TimeSpanType>();
    private List<Concept> conceptList = new ArrayList<Concept>();
    private List<Aggregation> aggregationList = new ArrayList<Aggregation>();
    private List<ProxyType> proxyList = new ArrayList<ProxyType>();
    private List<EuropeanaAggregationType> europeanaAggregationList = new ArrayList<EuropeanaAggregationType>();
    private List<License> licenseList = new ArrayList<License>();
    private List<Organization> organizationList = new ArrayList<Organization>();
    private List<Dataset> datasetList = new ArrayList<Dataset>();

    /** 
     * Get the list of 'ProvidedCHO' element items.
     * 
     * @return list
     */
    public List<ProvidedCHOType> getProvidedCHOList() {
        return providedCHOList;
    }

    /** 
     * Set the list of 'ProvidedCHO' element items.
     * 
     * @param list
     */
    public void setProvidedCHOList(List<ProvidedCHOType> list) {
        providedCHOList = list;
    }

    /** 
     * Get the list of 'WebResource' element items.
     * 
     * @return list
     */
    public List<WebResourceType> getWebResourceList() {
        return webResourceList;
    }

    /** 
     * Set the list of 'WebResource' element items.
     * 
     * @param list
     */
    public void setWebResourceList(List<WebResourceType> list) {
        webResourceList = list;
    }

    /** 
     * Get the list of 'Agent' element items.
     * 
     * @return list
     */
    public List<AgentType> getAgentList() {
        return agentList;
    }

    /** 
     * Set the list of 'Agent' element items.
     * 
     * @param list
     */
    public void setAgentList(List<AgentType> list) {
        agentList = list;
    }

    /** 
     * Get the list of 'Place' element items.
     * 
     * @return list
     */
    public List<PlaceType> getPlaceList() {
        return placeList;
    }

    /** 
     * Set the list of 'Place' element items.
     * 
     * @param list
     */
    public void setPlaceList(List<PlaceType> list) {
        placeList = list;
    }

    /** 
     * Get the list of 'TimeSpan' element items.
     * 
     * @return list
     */
    public List<TimeSpanType> getTimeSpanList() {
        return timeSpanList;
    }

    /** 
     * Set the list of 'TimeSpan' element items.
     * 
     * @param list
     */
    public void setTimeSpanList(List<TimeSpanType> list) {
        timeSpanList = list;
    }

    /** 
     * Get the list of 'Concept' element items.
     * 
     * @return list
     */
    public List<Concept> getConceptList() {
        return conceptList;
    }

    /** 
     * Set the list of 'Concept' element items.
     * 
     * @param list
     */
    public void setConceptList(List<Concept> list) {
        conceptList = list;
    }

    /** 
     * Get the list of 'Aggregation' element items.
     * 
     * @return list
     */
    public List<Aggregation> getAggregationList() {
        return aggregationList;
    }

    /** 
     * Set the list of 'Aggregation' element items.
     * 
     * @param list
     */
    public void setAggregationList(List<Aggregation> list) {
        aggregationList = list;
    }

    /** 
     * Get the list of 'Proxy' element items.
     * 
     * @return list
     */
    public List<ProxyType> getProxyList() {
        return proxyList;
    }

    /** 
     * Set the list of 'Proxy' element items.
     * 
     * @param list
     */
    public void setProxyList(List<ProxyType> list) {
        proxyList = list;
    }

    /** 
     * Get the list of 'EuropeanaAggregation' element items.
     * 
     * @return list
     */
    public List<EuropeanaAggregationType> getEuropeanaAggregationList() {
        return europeanaAggregationList;
    }

    /** 
     * Set the list of 'EuropeanaAggregation' element items.
     * 
     * @param list
     */
    public void setEuropeanaAggregationList(List<EuropeanaAggregationType> list) {
        europeanaAggregationList = list;
    }

    /** 
     * Get the list of 'License' element items.
     * 
     * @return list
     */
    public List<License> getLicenseList() {
        return licenseList;
    }

    /** 
     * Set the list of 'License' element items.
     * 
     * @param list
     */
    public void setLicenseList(List<License> list) {
        licenseList = list;
    }

    /** 
     * Get the list of 'Organization' element items.
     * 
     * @return list
     */
    public List<Organization> getOrganizationList() {
        return organizationList;
    }

    /** 
     * Set the list of 'Organization' element items.
     * 
     * @param list
     */
    public void setOrganizationList(List<Organization> list) {
        organizationList = list;
    }

    /** 
     * Get the list of 'Dataset' element items.
     * 
     * @return list
     */
    public List<Dataset> getDatasetList() {
        return datasetList;
    }

    /** 
     * Set the list of 'Dataset' element items.
     * 
     * @param list
     */
    public void setDatasetList(List<Dataset> list) {
        datasetList = list;
    }
}
