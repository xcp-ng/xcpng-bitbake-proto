
PN = "jboss-logging"
PE = "0"
PV = "3.5.3"
PR = "5.el10"
PACKAGES = "jboss-logging"


URI_jboss-logging = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/jboss-logging-3.5.3-5.el10.noarch.rpm;unpack=0"
RDEPENDS:jboss-logging = "
 javapackages-filesystem
 java-21-openjdk-headless
"
