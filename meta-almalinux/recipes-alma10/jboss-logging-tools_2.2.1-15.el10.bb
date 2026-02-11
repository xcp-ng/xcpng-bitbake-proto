
inherit dnf-bridge

PN = "jboss-logging-tools"
PE = "0"
PV = "2.2.1"
PR = "15.el10"
PACKAGES = "jboss-logging-tools"


URI_jboss-logging-tools = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/jboss-logging-tools-2.2.1-15.el10.noarch.rpm;unpack=0"
RDEPENDS:jboss-logging-tools = " \
 jdeparser \
 javapackages-filesystem \
 java-21-openjdk-headless \
"
