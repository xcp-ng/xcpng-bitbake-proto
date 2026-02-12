
inherit dnf-bridge

PN = "jackson-core"
PE = "0"
PV = "2.16.1"
PR = "4.el10"
PACKAGES = "jackson-core"


URI_src = "https://vault.almalinux.org/10.0/devel/Source/Packages/jackson-core-2.16.1-4.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_jackson-core = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/jackson-core-2.16.1-4.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_jackson-core}"
RDEPENDS:jackson-core = " \
 javapackages-filesystem \
 java-21-openjdk-headless \
"
