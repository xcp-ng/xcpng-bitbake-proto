
inherit dnf-bridge

PN = "keyutils"
PE = "0"
PV = "1.6.3"
PR = "5.el10"
PACKAGES = "keyutils keyutils-libs keyutils-libs-devel"


URI_src = "https://vault.almalinux.org/10.0/BaseOS/Source/Packages/keyutils-1.6.3-5.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_keyutils = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/keyutils-1.6.3-5.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_keyutils}"
RDEPENDS:keyutils = " \
 glibc \
 keyutils-libs \
 bash \
"

URI_keyutils-libs = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/keyutils-libs-1.6.3-5.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_keyutils-libs}"
RDEPENDS:keyutils-libs = " \
 glibc \
"

URI_keyutils-libs-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/keyutils-libs-devel-1.6.3-5.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_keyutils-libs-devel}"
RDEPENDS:keyutils-libs-devel = " \
 keyutils-libs \
 pkgconf-pkg-config \
"
