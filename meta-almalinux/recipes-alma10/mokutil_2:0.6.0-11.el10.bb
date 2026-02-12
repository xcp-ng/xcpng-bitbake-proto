
inherit dnf-bridge

PN = "mokutil"
PE = "2"
PV = "0.6.0"
PR = "11.el10"
PACKAGES = "mokutil"


URI_src = "https://vault.almalinux.org/10.0/BaseOS/Source/Packages/mokutil-0.6.0-11.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_mokutil = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/mokutil-0.6.0-11.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_mokutil}"
RDEPENDS:mokutil = " \
 efivar-libs \
 keyutils-libs \
 libxcrypt \
 openssl-libs \
 glibc \
"
