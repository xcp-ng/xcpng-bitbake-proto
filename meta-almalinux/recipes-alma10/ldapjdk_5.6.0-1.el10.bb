
PN = "ldapjdk"
PE = "0"
PV = "5.6.0"
PR = "1.el10"
PACKAGES = "idm-ldapjdk idm-ldapjdk-javadoc"


URI_idm-ldapjdk = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/idm-ldapjdk-5.6.0-1.el10.noarch.rpm;unpack=0"
RDEPENDS:idm-ldapjdk = "
 javapackages-filesystem
 idm-jss
 java-21-openjdk-headless
 slf4j-jdk14
 slf4j
"

URI_idm-ldapjdk-javadoc = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/idm-ldapjdk-javadoc-5.6.0-1.el10.noarch.rpm;unpack=0"
RDEPENDS:idm-ldapjdk-javadoc = "
 javapackages-filesystem
"
