
inherit dnf-bridge

PN = "libtraceevent"
PE = "0"
PV = "1.8.4"
PR = "3.el10"
PACKAGES = "libtraceevent libtraceevent-devel"


URI_src = "https://vault.almalinux.org/10.0/BaseOS/Source/Packages/libtraceevent-1.8.4-3.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_libtraceevent = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libtraceevent-1.8.4-3.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libtraceevent}"
RDEPENDS:libtraceevent = " \
 glibc \
"

URI_libtraceevent-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libtraceevent-devel-1.8.4-3.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libtraceevent-devel}"
RDEPENDS:libtraceevent-devel = " \
 libtraceevent \
 pkgconf-pkg-config \
"
