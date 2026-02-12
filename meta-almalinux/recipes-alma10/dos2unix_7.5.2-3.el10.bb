
inherit dnf-bridge

PN = "dos2unix"
PE = "0"
PV = "7.5.2"
PR = "3.el10"
PACKAGES = "dos2unix"


URI_src = "https://vault.almalinux.org/10.0/BaseOS/Source/Packages/dos2unix-7.5.2-3.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_dos2unix = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/dos2unix-7.5.2-3.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_dos2unix}"
RDEPENDS:dos2unix = " \
 glibc \
"
