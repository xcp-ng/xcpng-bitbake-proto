
inherit dnf-bridge

PN = "resteasy"
PE = "0"
PV = "3.0.26"
PR = "30.el10"
PACKAGES = "pki-resteasy-client pki-resteasy-core pki-resteasy-jackson2-provider pki-resteasy-servlet-initializer"


URI_src = "https://vault.almalinux.org/10.0/devel/Source/Packages/resteasy-3.0.26-30.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_pki-resteasy-client = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/pki-resteasy-client-3.0.26-30.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_pki-resteasy-client}"
RDEPENDS:pki-resteasy-client = " \
 pki-resteasy-core \
 javapackages-filesystem \
 java-21-openjdk-headless \
 jboss-logging \
 jboss-logging-tools \
"

URI_pki-resteasy-core = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/pki-resteasy-core-3.0.26-30.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_pki-resteasy-core}"
RDEPENDS:pki-resteasy-core = " \
 httpcomponents-client \
 jakarta-activation \
 jakarta-annotations \
 apache-commons-io \
 javapackages-filesystem \
 tomcat-servlet-4.0-api \
 jaxb-api \
 jboss-jaxrs-2.0-api \
 jboss-logging \
 jboss-logging-tools \
 java-21-openjdk-headless \
"

URI_pki-resteasy-jackson2-provider = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/pki-resteasy-jackson2-provider-3.0.26-30.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_pki-resteasy-jackson2-provider}"
RDEPENDS:pki-resteasy-jackson2-provider = " \
 javapackages-filesystem \
 tomcat-servlet-4.0-api \
 jackson-annotations \
 jackson-core \
 jackson-databind \
 jackson-jaxrs-json-provider \
 java-21-openjdk-headless \
"

URI_pki-resteasy-servlet-initializer = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/pki-resteasy-servlet-initializer-3.0.26-30.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_pki-resteasy-servlet-initializer}"
RDEPENDS:pki-resteasy-servlet-initializer = " \
 pki-resteasy-core \
 javapackages-filesystem \
 tomcat-servlet-4.0-api \
 jaxb-api \
 jboss-jaxrs-2.0-api \
 jboss-logging \
 jboss-logging-tools \
 java-21-openjdk-headless \
"
