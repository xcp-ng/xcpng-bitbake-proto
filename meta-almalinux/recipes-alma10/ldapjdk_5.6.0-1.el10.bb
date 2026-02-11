
PN = "ldapjdk"
PE = "0"
PV = "5.6.0"
PR = "1.el10"
PACKAGES = "idm-ldapjdk idm-ldapjdk-javadoc"


URI_idm-ldapjdk = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/idm-ldapjdk-5.6.0-1.el10.noarch.rpm;unpack=0"
RDEPENDS:idm-ldapjdk = "javapackages-filesystem ( ) mvn(org.slf4j:slf4j-api) ( ) java-21-openjdk-headless ( ) mvn(org.slf4j:slf4j-jdk14) ( ) mvn(org.dogtagpki.jss:jss-base) ( ) mvn(org.dogtagpki.jss:jss-base) ( >=  5.6.0)"
RPROVIDES:idm-ldapjdk = "idm-ldapjdk ( =  5.6) idm-ldapjdk ( =  5.6.0-1.el10) ldapjdk ( =  5.6) ldapjdk ( =  5.6.0-1.el10) mvn(org.dogtagpki.ldap-sdk:java-sdk-parent:pom:) ( =  5.6.0.SNAPSHOT) mvn(org.dogtagpki.ldap-sdk:ldap-sdk-parent:pom:) ( =  5.6.0.SNAPSHOT) mvn(org.dogtagpki.ldap-sdk:ldapbeans) ( =  5.6.0.SNAPSHOT) mvn(org.dogtagpki.ldap-sdk:ldapbeans:pom:) ( =  5.6.0.SNAPSHOT) mvn(org.dogtagpki.ldap-sdk:ldapfilter) ( =  5.6.0.SNAPSHOT) mvn(org.dogtagpki.ldap-sdk:ldapfilter:pom:) ( =  5.6.0.SNAPSHOT) mvn(org.dogtagpki.ldap-sdk:ldapjdk) ( =  5.6.0.SNAPSHOT) mvn(org.dogtagpki.ldap-sdk:ldapjdk:pom:) ( =  5.6.0.SNAPSHOT) mvn(org.dogtagpki.ldap-sdk:ldapsp) ( =  5.6.0.SNAPSHOT) mvn(org.dogtagpki.ldap-sdk:ldapsp:pom:) ( =  5.6.0.SNAPSHOT) mvn(org.dogtagpki.ldap-sdk:ldaptools) ( =  5.6.0.SNAPSHOT) mvn(org.dogtagpki.ldap-sdk:ldaptools:pom:) ( =  5.6.0.SNAPSHOT)"

URI_idm-ldapjdk-javadoc = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/idm-ldapjdk-javadoc-5.6.0-1.el10.noarch.rpm;unpack=0"
RDEPENDS:idm-ldapjdk-javadoc = "javapackages-filesystem ( )"
RPROVIDES:idm-ldapjdk-javadoc = "idm-ldapjdk-javadoc ( =  5.6) idm-ldapjdk-javadoc ( =  5.6.0-1.el10) ldapjdk-javadoc ( =  5.6) ldapjdk-javadoc ( =  5.6.0-1.el10)"
