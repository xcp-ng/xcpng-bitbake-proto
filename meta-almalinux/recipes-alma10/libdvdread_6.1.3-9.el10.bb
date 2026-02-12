
inherit dnf-bridge

PN = "libdvdread"
PE = "0"
PV = "6.1.3"
PR = "9.el10"
PACKAGES = "libdvdread libdvdread-devel"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/libdvdread-6.1.3-9.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_libdvdread = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libdvdread-6.1.3-9.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libdvdread}"
RDEPENDS:libdvdread = " \
 glibc \
"

URI_libdvdread-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libdvdread-devel-6.1.3-9.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libdvdread-devel}"
RDEPENDS:libdvdread-devel = " \
 libdvdread \
 pkgconf-pkg-config \
"
