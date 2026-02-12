
inherit dnf-bridge

PN = "apache-logging-parent"
PE = "0"
PV = "9"
PR = "6.el10"
PACKAGES = "apache-logging-parent"


URI_src = "https://vault.almalinux.org/10.0/devel/Source/Packages/apache-logging-parent-9-6.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_apache-logging-parent = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/apache-logging-parent-9-6.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_apache-logging-parent}"
RDEPENDS:apache-logging-parent = " \
 java-21-openjdk-headless \
 javapackages-filesystem \
 apache-parent \
"
