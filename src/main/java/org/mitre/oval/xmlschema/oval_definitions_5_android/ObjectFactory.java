


package org.mitre.oval.xmlschema.oval_definitions_5_android;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import org.mitre.oval.xmlschema.oval_definitions_5.EntityStateBinaryType;
import org.mitre.oval.xmlschema.oval_definitions_5.EntityStateBoolType;
import org.mitre.oval.xmlschema.oval_definitions_5.EntityStateIntType;
import org.mitre.oval.xmlschema.oval_definitions_5.EntityStateStringType;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.mitre.oval.xmlschema.oval_definitions_5_android package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AppmanagerState_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#android", "appmanager_state");
    private final static QName _BluetoothTest_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#android", "bluetooth_test");
    private final static QName _LocationserviceState_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#android", "locationservice_state");
    private final static QName _SystemdetailsState_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#android", "systemdetails_state");
    private final static QName _CameraTest_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#android", "camera_test");
    private final static QName _PasswordTest_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#android", "password_test");
    private final static QName _AppmanagerObject_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#android", "appmanager_object");
    private final static QName _LocationserviceTest_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#android", "locationservice_test");
    private final static QName _WifinetworkState_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#android", "wifinetwork_state");
    private final static QName _LocationserviceObject_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#android", "locationservice_object");
    private final static QName _DevicesettingsTest_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#android", "devicesettings_test");
    private final static QName _CertificateTest_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#android", "certificate_test");
    private final static QName _WifiTest_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#android", "wifi_test");
    private final static QName _WifinetworkObject_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#android", "wifinetwork_object");
    private final static QName _EncryptionState_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#android", "encryption_state");
    private final static QName _BluetoothState_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#android", "bluetooth_state");
    private final static QName _EncryptionTest_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#android", "encryption_test");
    private final static QName _CertificateState_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#android", "certificate_state");
    private final static QName _BluetoothObject_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#android", "bluetooth_object");
    private final static QName _SystemdetailsTest_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#android", "systemdetails_test");
    private final static QName _WifinetworkTest_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#android", "wifinetwork_test");
    private final static QName _PasswordObject_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#android", "password_object");
    private final static QName _NetworkTest_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#android", "network_test");
    private final static QName _CameraState_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#android", "camera_state");
    private final static QName _WifiState_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#android", "wifi_state");
    private final static QName _EncryptionObject_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#android", "encryption_object");
    private final static QName _TelephonyObject_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#android", "telephony_object");
    private final static QName _CertificateObject_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#android", "certificate_object");
    private final static QName _DevicesettingsState_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#android", "devicesettings_state");
    private final static QName _WifiObject_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#android", "wifi_object");
    private final static QName _TelephonyTest_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#android", "telephony_test");
    private final static QName _NetworkState_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#android", "network_state");
    private final static QName _SystemdetailsObject_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#android", "systemdetails_object");
    private final static QName _NetworkObject_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#android", "network_object");
    private final static QName _TelephonyState_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#android", "telephony_state");
    private final static QName _DevicesettingsObject_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#android", "devicesettings_object");
    private final static QName _PasswordState_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#android", "password_state");
    private final static QName _CameraObject_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#android", "camera_object");
    private final static QName _AppmanagerTest_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#android", "appmanager_test");
    private final static QName _AppmanagerStateDataDirectory_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#android", "data_directory");
    private final static QName _AppmanagerStateApplicationName_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#android", "application_name");
    private final static QName _AppmanagerStateUid_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#android", "uid");
    private final static QName _AppmanagerStateLastUpdateTime_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#android", "last_update_time");
    private final static QName _AppmanagerStatePackageFileLocation_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#android", "package_file_location");
    private final static QName _AppmanagerStatePackageName_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#android", "package_name");
    private final static QName _AppmanagerStateCurrentStatus_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#android", "current_status");
    private final static QName _AppmanagerStateGid_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#android", "gid");
    private final static QName _AppmanagerStateFirstInstallTime_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#android", "first_install_time");
    private final static QName _AppmanagerStateSigningCertificate_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#android", "signing_certificate");
    private final static QName _AppmanagerStateNativeLibDir_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#android", "native_lib_dir");
    private final static QName _AppmanagerStateVersion_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#android", "version");
    private final static QName _AppmanagerStatePermission_QNAME = new QName("http://oval.mitre.org/XMLSchema/oval-definitions-5#android", "permission");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.mitre.oval.xmlschema.oval_definitions_5_android
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CertificateObject }
     * 
     */
    public CertificateObject createCertificateObject() {
        return new CertificateObject();
    }

    /**
     * Create an instance of {@link WifinetworkObject }
     * 
     */
    public WifinetworkObject createWifinetworkObject() {
        return new WifinetworkObject();
    }

    /**
     * Create an instance of {@link SystemdetailsState }
     * 
     */
    public SystemdetailsState createSystemdetailsState() {
        return new SystemdetailsState();
    }

    /**
     * Create an instance of {@link CameraObject }
     * 
     */
    public CameraObject createCameraObject() {
        return new CameraObject();
    }

    /**
     * Create an instance of {@link DevicesettingsTest }
     * 
     */
    public DevicesettingsTest createDevicesettingsTest() {
        return new DevicesettingsTest();
    }

    /**
     * Create an instance of {@link SystemdetailsObject }
     * 
     */
    public SystemdetailsObject createSystemdetailsObject() {
        return new SystemdetailsObject();
    }

    /**
     * Create an instance of {@link PasswordState }
     * 
     */
    public PasswordState createPasswordState() {
        return new PasswordState();
    }

    /**
     * Create an instance of {@link CameraTest }
     * 
     */
    public CameraTest createCameraTest() {
        return new CameraTest();
    }

    /**
     * Create an instance of {@link SystemdetailsTest }
     * 
     */
    public SystemdetailsTest createSystemdetailsTest() {
        return new SystemdetailsTest();
    }

    /**
     * Create an instance of {@link EncryptionState }
     * 
     */
    public EncryptionState createEncryptionState() {
        return new EncryptionState();
    }

    /**
     * Create an instance of {@link LocationserviceState }
     * 
     */
    public LocationserviceState createLocationserviceState() {
        return new LocationserviceState();
    }

    /**
     * Create an instance of {@link BluetoothObject }
     * 
     */
    public BluetoothObject createBluetoothObject() {
        return new BluetoothObject();
    }

    /**
     * Create an instance of {@link PasswordObject }
     * 
     */
    public PasswordObject createPasswordObject() {
        return new PasswordObject();
    }

    /**
     * Create an instance of {@link NetworkTest }
     * 
     */
    public NetworkTest createNetworkTest() {
        return new NetworkTest();
    }

    /**
     * Create an instance of {@link WifiObject }
     * 
     */
    public WifiObject createWifiObject() {
        return new WifiObject();
    }

    /**
     * Create an instance of {@link LocationserviceObject }
     * 
     */
    public LocationserviceObject createLocationserviceObject() {
        return new LocationserviceObject();
    }

    /**
     * Create an instance of {@link NetworkObject }
     * 
     */
    public NetworkObject createNetworkObject() {
        return new NetworkObject();
    }

    /**
     * Create an instance of {@link PasswordTest }
     * 
     */
    public PasswordTest createPasswordTest() {
        return new PasswordTest();
    }

    /**
     * Create an instance of {@link TelephonyTest }
     * 
     */
    public TelephonyTest createTelephonyTest() {
        return new TelephonyTest();
    }

    /**
     * Create an instance of {@link WifinetworkState }
     * 
     */
    public WifinetworkState createWifinetworkState() {
        return new WifinetworkState();
    }

    /**
     * Create an instance of {@link LocationserviceTest }
     * 
     */
    public LocationserviceTest createLocationserviceTest() {
        return new LocationserviceTest();
    }

    /**
     * Create an instance of {@link BluetoothState }
     * 
     */
    public BluetoothState createBluetoothState() {
        return new BluetoothState();
    }

    /**
     * Create an instance of {@link CertificateTest }
     * 
     */
    public CertificateTest createCertificateTest() {
        return new CertificateTest();
    }

    /**
     * Create an instance of {@link DevicesettingsObject }
     * 
     */
    public DevicesettingsObject createDevicesettingsObject() {
        return new DevicesettingsObject();
    }

    /**
     * Create an instance of {@link WifiState }
     * 
     */
    public WifiState createWifiState() {
        return new WifiState();
    }

    /**
     * Create an instance of {@link WifinetworkTest }
     * 
     */
    public WifinetworkTest createWifinetworkTest() {
        return new WifinetworkTest();
    }

    /**
     * Create an instance of {@link BluetoothTest }
     * 
     */
    public BluetoothTest createBluetoothTest() {
        return new BluetoothTest();
    }

    /**
     * Create an instance of {@link AppmanagerTest }
     * 
     */
    public AppmanagerTest createAppmanagerTest() {
        return new AppmanagerTest();
    }

    /**
     * Create an instance of {@link TelephonyObject }
     * 
     */
    public TelephonyObject createTelephonyObject() {
        return new TelephonyObject();
    }

    /**
     * Create an instance of {@link EncryptionObject }
     * 
     */
    public EncryptionObject createEncryptionObject() {
        return new EncryptionObject();
    }

    /**
     * Create an instance of {@link DevicesettingsState }
     * 
     */
    public DevicesettingsState createDevicesettingsState() {
        return new DevicesettingsState();
    }

    /**
     * Create an instance of {@link AppmanagerObject }
     * 
     */
    public AppmanagerObject createAppmanagerObject() {
        return new AppmanagerObject();
    }

    /**
     * Create an instance of {@link AppmanagerState }
     * 
     */
    public AppmanagerState createAppmanagerState() {
        return new AppmanagerState();
    }

    /**
     * Create an instance of {@link CertificateState }
     * 
     */
    public CertificateState createCertificateState() {
        return new CertificateState();
    }

    /**
     * Create an instance of {@link EncryptionTest }
     * 
     */
    public EncryptionTest createEncryptionTest() {
        return new EncryptionTest();
    }

    /**
     * Create an instance of {@link WifiTest }
     * 
     */
    public WifiTest createWifiTest() {
        return new WifiTest();
    }

    /**
     * Create an instance of {@link NetworkState }
     * 
     */
    public NetworkState createNetworkState() {
        return new NetworkState();
    }

    /**
     * Create an instance of {@link CameraState }
     * 
     */
    public CameraState createCameraState() {
        return new CameraState();
    }

    /**
     * Create an instance of {@link TelephonyState }
     * 
     */
    public TelephonyState createTelephonyState() {
        return new TelephonyState();
    }

    /**
     * Create an instance of {@link EntityStateWifiAuthAlgorithmType }
     * 
     */
    public EntityStateWifiAuthAlgorithmType createEntityStateWifiAuthAlgorithmType() {
        return new EntityStateWifiAuthAlgorithmType();
    }

    /**
     * Create an instance of {@link EntityStateWifiKeyMgmtType }
     * 
     */
    public EntityStateWifiKeyMgmtType createEntityStateWifiKeyMgmtType() {
        return new EntityStateWifiKeyMgmtType();
    }

    /**
     * Create an instance of {@link EntityStateKeyguardDisabledFeaturesType }
     * 
     */
    public EntityStateKeyguardDisabledFeaturesType createEntityStateKeyguardDisabledFeaturesType() {
        return new EntityStateKeyguardDisabledFeaturesType();
    }

    /**
     * Create an instance of {@link EntityStateWifiProtocolType }
     * 
     */
    public EntityStateWifiProtocolType createEntityStateWifiProtocolType() {
        return new EntityStateWifiProtocolType();
    }

    /**
     * Create an instance of {@link EntityStateEncryptionStatusType }
     * 
     */
    public EntityStateEncryptionStatusType createEntityStateEncryptionStatusType() {
        return new EntityStateEncryptionStatusType();
    }

    /**
     * Create an instance of {@link EntityStateWifiGroupCipherType }
     * 
     */
    public EntityStateWifiGroupCipherType createEntityStateWifiGroupCipherType() {
        return new EntityStateWifiGroupCipherType();
    }

    /**
     * Create an instance of {@link EntityStateNetworkType }
     * 
     */
    public EntityStateNetworkType createEntityStateNetworkType() {
        return new EntityStateNetworkType();
    }

    /**
     * Create an instance of {@link EntityStatePasswordQualityType }
     * 
     */
    public EntityStatePasswordQualityType createEntityStatePasswordQualityType() {
        return new EntityStatePasswordQualityType();
    }

    /**
     * Create an instance of {@link EntityStateWifiCurrentStatusType }
     * 
     */
    public EntityStateWifiCurrentStatusType createEntityStateWifiCurrentStatusType() {
        return new EntityStateWifiCurrentStatusType();
    }

    /**
     * Create an instance of {@link EntityStateWifiPairwiseCipherType }
     * 
     */
    public EntityStateWifiPairwiseCipherType createEntityStateWifiPairwiseCipherType() {
        return new EntityStateWifiPairwiseCipherType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AppmanagerState }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#android", name = "appmanager_state", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "state")
    public JAXBElement<AppmanagerState> createAppmanagerState(AppmanagerState value) {
        return new JAXBElement<AppmanagerState>(_AppmanagerState_QNAME, AppmanagerState.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BluetoothTest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#android", name = "bluetooth_test", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "test")
    public JAXBElement<BluetoothTest> createBluetoothTest(BluetoothTest value) {
        return new JAXBElement<BluetoothTest>(_BluetoothTest_QNAME, BluetoothTest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocationserviceState }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#android", name = "locationservice_state", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "state")
    public JAXBElement<LocationserviceState> createLocationserviceState(LocationserviceState value) {
        return new JAXBElement<LocationserviceState>(_LocationserviceState_QNAME, LocationserviceState.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SystemdetailsState }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#android", name = "systemdetails_state", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "state")
    public JAXBElement<SystemdetailsState> createSystemdetailsState(SystemdetailsState value) {
        return new JAXBElement<SystemdetailsState>(_SystemdetailsState_QNAME, SystemdetailsState.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CameraTest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#android", name = "camera_test", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "test")
    public JAXBElement<CameraTest> createCameraTest(CameraTest value) {
        return new JAXBElement<CameraTest>(_CameraTest_QNAME, CameraTest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PasswordTest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#android", name = "password_test", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "test")
    public JAXBElement<PasswordTest> createPasswordTest(PasswordTest value) {
        return new JAXBElement<PasswordTest>(_PasswordTest_QNAME, PasswordTest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AppmanagerObject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#android", name = "appmanager_object", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "object")
    public JAXBElement<AppmanagerObject> createAppmanagerObject(AppmanagerObject value) {
        return new JAXBElement<AppmanagerObject>(_AppmanagerObject_QNAME, AppmanagerObject.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocationserviceTest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#android", name = "locationservice_test", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "test")
    public JAXBElement<LocationserviceTest> createLocationserviceTest(LocationserviceTest value) {
        return new JAXBElement<LocationserviceTest>(_LocationserviceTest_QNAME, LocationserviceTest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WifinetworkState }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#android", name = "wifinetwork_state", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "state")
    public JAXBElement<WifinetworkState> createWifinetworkState(WifinetworkState value) {
        return new JAXBElement<WifinetworkState>(_WifinetworkState_QNAME, WifinetworkState.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocationserviceObject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#android", name = "locationservice_object", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "object")
    public JAXBElement<LocationserviceObject> createLocationserviceObject(LocationserviceObject value) {
        return new JAXBElement<LocationserviceObject>(_LocationserviceObject_QNAME, LocationserviceObject.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DevicesettingsTest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#android", name = "devicesettings_test", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "test")
    public JAXBElement<DevicesettingsTest> createDevicesettingsTest(DevicesettingsTest value) {
        return new JAXBElement<DevicesettingsTest>(_DevicesettingsTest_QNAME, DevicesettingsTest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CertificateTest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#android", name = "certificate_test", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "test")
    public JAXBElement<CertificateTest> createCertificateTest(CertificateTest value) {
        return new JAXBElement<CertificateTest>(_CertificateTest_QNAME, CertificateTest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WifiTest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#android", name = "wifi_test", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "test")
    public JAXBElement<WifiTest> createWifiTest(WifiTest value) {
        return new JAXBElement<WifiTest>(_WifiTest_QNAME, WifiTest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WifinetworkObject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#android", name = "wifinetwork_object", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "object")
    public JAXBElement<WifinetworkObject> createWifinetworkObject(WifinetworkObject value) {
        return new JAXBElement<WifinetworkObject>(_WifinetworkObject_QNAME, WifinetworkObject.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EncryptionState }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#android", name = "encryption_state", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "state")
    public JAXBElement<EncryptionState> createEncryptionState(EncryptionState value) {
        return new JAXBElement<EncryptionState>(_EncryptionState_QNAME, EncryptionState.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BluetoothState }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#android", name = "bluetooth_state", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "state")
    public JAXBElement<BluetoothState> createBluetoothState(BluetoothState value) {
        return new JAXBElement<BluetoothState>(_BluetoothState_QNAME, BluetoothState.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EncryptionTest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#android", name = "encryption_test", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "test")
    public JAXBElement<EncryptionTest> createEncryptionTest(EncryptionTest value) {
        return new JAXBElement<EncryptionTest>(_EncryptionTest_QNAME, EncryptionTest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CertificateState }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#android", name = "certificate_state", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "state")
    public JAXBElement<CertificateState> createCertificateState(CertificateState value) {
        return new JAXBElement<CertificateState>(_CertificateState_QNAME, CertificateState.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BluetoothObject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#android", name = "bluetooth_object", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "object")
    public JAXBElement<BluetoothObject> createBluetoothObject(BluetoothObject value) {
        return new JAXBElement<BluetoothObject>(_BluetoothObject_QNAME, BluetoothObject.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SystemdetailsTest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#android", name = "systemdetails_test", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "test")
    public JAXBElement<SystemdetailsTest> createSystemdetailsTest(SystemdetailsTest value) {
        return new JAXBElement<SystemdetailsTest>(_SystemdetailsTest_QNAME, SystemdetailsTest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WifinetworkTest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#android", name = "wifinetwork_test", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "test")
    public JAXBElement<WifinetworkTest> createWifinetworkTest(WifinetworkTest value) {
        return new JAXBElement<WifinetworkTest>(_WifinetworkTest_QNAME, WifinetworkTest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PasswordObject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#android", name = "password_object", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "object")
    public JAXBElement<PasswordObject> createPasswordObject(PasswordObject value) {
        return new JAXBElement<PasswordObject>(_PasswordObject_QNAME, PasswordObject.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NetworkTest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#android", name = "network_test", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "test")
    public JAXBElement<NetworkTest> createNetworkTest(NetworkTest value) {
        return new JAXBElement<NetworkTest>(_NetworkTest_QNAME, NetworkTest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CameraState }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#android", name = "camera_state", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "state")
    public JAXBElement<CameraState> createCameraState(CameraState value) {
        return new JAXBElement<CameraState>(_CameraState_QNAME, CameraState.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WifiState }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#android", name = "wifi_state", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "state")
    public JAXBElement<WifiState> createWifiState(WifiState value) {
        return new JAXBElement<WifiState>(_WifiState_QNAME, WifiState.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EncryptionObject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#android", name = "encryption_object", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "object")
    public JAXBElement<EncryptionObject> createEncryptionObject(EncryptionObject value) {
        return new JAXBElement<EncryptionObject>(_EncryptionObject_QNAME, EncryptionObject.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TelephonyObject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#android", name = "telephony_object", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "object")
    public JAXBElement<TelephonyObject> createTelephonyObject(TelephonyObject value) {
        return new JAXBElement<TelephonyObject>(_TelephonyObject_QNAME, TelephonyObject.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CertificateObject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#android", name = "certificate_object", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "object")
    public JAXBElement<CertificateObject> createCertificateObject(CertificateObject value) {
        return new JAXBElement<CertificateObject>(_CertificateObject_QNAME, CertificateObject.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DevicesettingsState }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#android", name = "devicesettings_state", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "state")
    public JAXBElement<DevicesettingsState> createDevicesettingsState(DevicesettingsState value) {
        return new JAXBElement<DevicesettingsState>(_DevicesettingsState_QNAME, DevicesettingsState.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WifiObject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#android", name = "wifi_object", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "object")
    public JAXBElement<WifiObject> createWifiObject(WifiObject value) {
        return new JAXBElement<WifiObject>(_WifiObject_QNAME, WifiObject.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TelephonyTest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#android", name = "telephony_test", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "test")
    public JAXBElement<TelephonyTest> createTelephonyTest(TelephonyTest value) {
        return new JAXBElement<TelephonyTest>(_TelephonyTest_QNAME, TelephonyTest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NetworkState }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#android", name = "network_state", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "state")
    public JAXBElement<NetworkState> createNetworkState(NetworkState value) {
        return new JAXBElement<NetworkState>(_NetworkState_QNAME, NetworkState.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SystemdetailsObject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#android", name = "systemdetails_object", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "object")
    public JAXBElement<SystemdetailsObject> createSystemdetailsObject(SystemdetailsObject value) {
        return new JAXBElement<SystemdetailsObject>(_SystemdetailsObject_QNAME, SystemdetailsObject.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NetworkObject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#android", name = "network_object", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "object")
    public JAXBElement<NetworkObject> createNetworkObject(NetworkObject value) {
        return new JAXBElement<NetworkObject>(_NetworkObject_QNAME, NetworkObject.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TelephonyState }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#android", name = "telephony_state", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "state")
    public JAXBElement<TelephonyState> createTelephonyState(TelephonyState value) {
        return new JAXBElement<TelephonyState>(_TelephonyState_QNAME, TelephonyState.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DevicesettingsObject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#android", name = "devicesettings_object", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "object")
    public JAXBElement<DevicesettingsObject> createDevicesettingsObject(DevicesettingsObject value) {
        return new JAXBElement<DevicesettingsObject>(_DevicesettingsObject_QNAME, DevicesettingsObject.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PasswordState }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#android", name = "password_state", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "state")
    public JAXBElement<PasswordState> createPasswordState(PasswordState value) {
        return new JAXBElement<PasswordState>(_PasswordState_QNAME, PasswordState.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CameraObject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#android", name = "camera_object", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "object")
    public JAXBElement<CameraObject> createCameraObject(CameraObject value) {
        return new JAXBElement<CameraObject>(_CameraObject_QNAME, CameraObject.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AppmanagerTest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#android", name = "appmanager_test", substitutionHeadNamespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", substitutionHeadName = "test")
    public JAXBElement<AppmanagerTest> createAppmanagerTest(AppmanagerTest value) {
        return new JAXBElement<AppmanagerTest>(_AppmanagerTest_QNAME, AppmanagerTest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityStateStringType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#android", name = "data_directory", scope = AppmanagerState.class)
    public JAXBElement<EntityStateStringType> createAppmanagerStateDataDirectory(EntityStateStringType value) {
        return new JAXBElement<EntityStateStringType>(_AppmanagerStateDataDirectory_QNAME, EntityStateStringType.class, AppmanagerState.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityStateStringType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#android", name = "application_name", scope = AppmanagerState.class)
    public JAXBElement<EntityStateStringType> createAppmanagerStateApplicationName(EntityStateStringType value) {
        return new JAXBElement<EntityStateStringType>(_AppmanagerStateApplicationName_QNAME, EntityStateStringType.class, AppmanagerState.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityStateStringType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#android", name = "uid", scope = AppmanagerState.class)
    public JAXBElement<EntityStateStringType> createAppmanagerStateUid(EntityStateStringType value) {
        return new JAXBElement<EntityStateStringType>(_AppmanagerStateUid_QNAME, EntityStateStringType.class, AppmanagerState.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityStateIntType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#android", name = "last_update_time", scope = AppmanagerState.class)
    public JAXBElement<EntityStateIntType> createAppmanagerStateLastUpdateTime(EntityStateIntType value) {
        return new JAXBElement<EntityStateIntType>(_AppmanagerStateLastUpdateTime_QNAME, EntityStateIntType.class, AppmanagerState.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityStateStringType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#android", name = "package_file_location", scope = AppmanagerState.class)
    public JAXBElement<EntityStateStringType> createAppmanagerStatePackageFileLocation(EntityStateStringType value) {
        return new JAXBElement<EntityStateStringType>(_AppmanagerStatePackageFileLocation_QNAME, EntityStateStringType.class, AppmanagerState.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityStateStringType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#android", name = "package_name", scope = AppmanagerState.class)
    public JAXBElement<EntityStateStringType> createAppmanagerStatePackageName(EntityStateStringType value) {
        return new JAXBElement<EntityStateStringType>(_AppmanagerStatePackageName_QNAME, EntityStateStringType.class, AppmanagerState.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityStateBoolType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#android", name = "current_status", scope = AppmanagerState.class)
    public JAXBElement<EntityStateBoolType> createAppmanagerStateCurrentStatus(EntityStateBoolType value) {
        return new JAXBElement<EntityStateBoolType>(_AppmanagerStateCurrentStatus_QNAME, EntityStateBoolType.class, AppmanagerState.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityStateStringType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#android", name = "gid", scope = AppmanagerState.class)
    public JAXBElement<EntityStateStringType> createAppmanagerStateGid(EntityStateStringType value) {
        return new JAXBElement<EntityStateStringType>(_AppmanagerStateGid_QNAME, EntityStateStringType.class, AppmanagerState.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityStateIntType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#android", name = "first_install_time", scope = AppmanagerState.class)
    public JAXBElement<EntityStateIntType> createAppmanagerStateFirstInstallTime(EntityStateIntType value) {
        return new JAXBElement<EntityStateIntType>(_AppmanagerStateFirstInstallTime_QNAME, EntityStateIntType.class, AppmanagerState.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityStateBinaryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#android", name = "signing_certificate", scope = AppmanagerState.class)
    public JAXBElement<EntityStateBinaryType> createAppmanagerStateSigningCertificate(EntityStateBinaryType value) {
        return new JAXBElement<EntityStateBinaryType>(_AppmanagerStateSigningCertificate_QNAME, EntityStateBinaryType.class, AppmanagerState.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityStateStringType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#android", name = "native_lib_dir", scope = AppmanagerState.class)
    public JAXBElement<EntityStateStringType> createAppmanagerStateNativeLibDir(EntityStateStringType value) {
        return new JAXBElement<EntityStateStringType>(_AppmanagerStateNativeLibDir_QNAME, EntityStateStringType.class, AppmanagerState.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityStateStringType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#android", name = "version", scope = AppmanagerState.class)
    public JAXBElement<EntityStateStringType> createAppmanagerStateVersion(EntityStateStringType value) {
        return new JAXBElement<EntityStateStringType>(_AppmanagerStateVersion_QNAME, EntityStateStringType.class, AppmanagerState.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityStateStringType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#android", name = "permission", scope = AppmanagerState.class)
    public JAXBElement<EntityStateStringType> createAppmanagerStatePermission(EntityStateStringType value) {
        return new JAXBElement<EntityStateStringType>(_AppmanagerStatePermission_QNAME, EntityStateStringType.class, AppmanagerState.class, value);
    }

}
