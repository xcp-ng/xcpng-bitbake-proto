
inherit dnf-bridge

PN = "jackson-bom"
PE = "0"
PV = "2.16.1"
PR = "3.el10"
PACKAGES = "jackson-bom"


URI_src = "https://vault.almalinux.org/10.0/devel/Source/Packages/jackson-bom-2.16.1-3.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_jackson-bom = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/jackson-bom-2.16.1-3.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_jackson-bom}"
RDEPENDS:jackson-bom = " \
 jackson-parent \
 javapackages-filesystem \
 java-21-openjdk-headless \
"
