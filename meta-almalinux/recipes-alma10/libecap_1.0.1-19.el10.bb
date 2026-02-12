
inherit dnf-bridge

PN = "libecap"
PE = "0"
PV = "1.0.1"
PR = "19.el10"
PACKAGES = "libecap libecap-devel"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/libecap-1.0.1-19.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_libecap = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libecap-1.0.1-19.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libecap}"
RDEPENDS:libecap = " \
 glibc \
 libgcc \
 libstdc++ \
"

URI_libecap-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libecap-devel-1.0.1-19.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libecap-devel}"
RDEPENDS:libecap-devel = " \
 libecap \
 pkgconf-pkg-config \
"
