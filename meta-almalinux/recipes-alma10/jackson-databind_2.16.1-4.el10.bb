
inherit dnf-bridge

PN = "jackson-databind"
PE = "0"
PV = "2.16.1"
PR = "4.el10"
PACKAGES = "jackson-databind"


URI_src = "https://vault.almalinux.org/10.0/devel/Source/Packages/jackson-databind-2.16.1-4.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_jackson-databind = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/jackson-databind-2.16.1-4.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_jackson-databind}"
RDEPENDS:jackson-databind = " \
 jackson-core \
 java-21-openjdk-headless \
 javapackages-filesystem \
 jackson-annotations \
"
