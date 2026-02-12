
inherit dnf-bridge

PN = "jdeparser"
PE = "0"
PV = "2.0.3"
PR = "17.el10"
PACKAGES = "jdeparser"


URI_src = "https://vault.almalinux.org/10.0/devel/Source/Packages/jdeparser-2.0.3-17.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_jdeparser = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/jdeparser-2.0.3-17.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_jdeparser}"
RDEPENDS:jdeparser = " \
 javapackages-filesystem \
 java-21-openjdk-headless \
"
