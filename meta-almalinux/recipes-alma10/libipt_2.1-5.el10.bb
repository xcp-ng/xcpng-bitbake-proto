
inherit dnf-bridge

PN = "libipt"
PE = "0"
PV = "2.1"
PR = "5.el10"
PACKAGES = "libipt libipt-devel"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/libipt-2.1-5.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_libipt = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libipt-2.1-5.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libipt}"
RDEPENDS:libipt = " \
 glibc \
"

URI_libipt-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libipt-devel-2.1-5.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libipt-devel}"
RDEPENDS:libipt-devel = " \
 libipt \
"
