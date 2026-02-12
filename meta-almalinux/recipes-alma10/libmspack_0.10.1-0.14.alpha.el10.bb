
inherit dnf-bridge

PN = "libmspack"
PE = "0"
PV = "0.10.1"
PR = "0.14.alpha.el10"
PACKAGES = "libmspack libmspack-devel"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/libmspack-0.10.1-0.14.alpha.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_libmspack = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libmspack-0.10.1-0.14.alpha.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libmspack}"
RDEPENDS:libmspack = " \
 glibc \
"

URI_libmspack-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libmspack-devel-0.10.1-0.14.alpha.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libmspack-devel}"
RDEPENDS:libmspack-devel = " \
 libmspack \
 pkgconf-pkg-config \
"
