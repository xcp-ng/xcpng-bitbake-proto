
inherit dnf-bridge

PN = "libdvdnav"
PE = "0"
PV = "6.1.1"
PR = "10.el10"
PACKAGES = "libdvdnav libdvdnav-devel"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/libdvdnav-6.1.1-10.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_libdvdnav = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libdvdnav-6.1.1-10.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libdvdnav}"
RDEPENDS:libdvdnav = " \
 glibc \
 libdvdread \
"

URI_libdvdnav-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libdvdnav-devel-6.1.1-10.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libdvdnav-devel}"
RDEPENDS:libdvdnav-devel = " \
 libdvdnav \
 pkgconf-pkg-config \
 libdvdread-devel \
"
