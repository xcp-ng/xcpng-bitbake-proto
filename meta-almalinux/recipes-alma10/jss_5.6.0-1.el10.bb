
PN = "jss"
PE = "0"
PV = "5.6.0"
PR = "1.el10"
PACKAGES = "idm-jss idm-jss-tomcat idm-jss-javadoc idm-jss-tests idm-jss-tools"


URI_idm-jss = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/idm-jss-5.6.0-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:idm-jss = "
 nss
 javapackages-filesystem
 apache-commons-lang3
 libgcc
 libstdc++
 slf4j
 java-21-openjdk-headless
 slf4j-jdk14
 glibc
 nspr
"

URI_idm-jss-tomcat = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/idm-jss-tomcat-5.6.0-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:idm-jss-tomcat = "
 tomcat9
 tomcat-lib
 javapackages-filesystem
 idm-jss
"

URI_idm-jss-javadoc = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/idm-jss-javadoc-5.6.0-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:idm-jss-javadoc = "
 javapackages-filesystem
"

URI_idm-jss-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/idm-jss-tests-5.6.0-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:idm-jss-tests = "
 bash
"

URI_idm-jss-tools = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/idm-jss-tools-5.6.0-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:idm-jss-tools = "
 glibc
 nss
 nspr
"
