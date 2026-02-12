
inherit dnf-bridge

PN = "jboss-jaxrs-2.0-api"
PE = "0"
PV = "1.0.0"
PR = "27.el10"
PACKAGES = "jboss-jaxrs-2.0-api"


URI_src = "https://vault.almalinux.org/10.0/devel/Source/Packages/jboss-jaxrs-2.0-api-1.0.0-27.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_jboss-jaxrs-2.0-api = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/jboss-jaxrs-2.0-api-1.0.0-27.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_jboss-jaxrs-2.0-api}"
RDEPENDS:jboss-jaxrs-2.0-api = " \
 javapackages-filesystem \
 java-21-openjdk-headless \
 jaxb-api \
"
