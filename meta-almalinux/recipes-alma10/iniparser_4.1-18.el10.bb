
inherit dnf-bridge

PN = "iniparser"
PE = "0"
PV = "4.1"
PR = "18.el10"
PACKAGES = "iniparser iniparser-devel"


URI_src = "https://vault.almalinux.org/10.0/BaseOS/Source/Packages/iniparser-4.1-18.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_iniparser = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/iniparser-4.1-18.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_iniparser}"
RDEPENDS:iniparser = " \
 glibc \
"

URI_iniparser-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/iniparser-devel-4.1-18.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_iniparser-devel}"
RDEPENDS:iniparser-devel = " \
 iniparser \
"
