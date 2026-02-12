
inherit dnf-bridge

PN = "libdisplay-info"
PE = "0"
PV = "0.2.0"
PR = "2.el10"
PACKAGES = "libdisplay-info libdisplay-info-devel libdisplay-info-tools"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/libdisplay-info-0.2.0-2.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_libdisplay-info = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libdisplay-info-0.2.0-2.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libdisplay-info}"
RDEPENDS:libdisplay-info = " \
 glibc \
"

URI_libdisplay-info-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libdisplay-info-devel-0.2.0-2.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libdisplay-info-devel}"
RDEPENDS:libdisplay-info-devel = " \
 libdisplay-info \
 pkgconf-pkg-config \
"

URI_libdisplay-info-tools = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libdisplay-info-tools-0.2.0-2.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libdisplay-info-tools}"
RDEPENDS:libdisplay-info-tools = " \
 glibc \
 libdisplay-info \
"
