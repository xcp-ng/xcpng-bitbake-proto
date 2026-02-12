
inherit dnf-bridge

PN = "libcbor"
PE = "0"
PV = "0.11.0"
PR = "3.el10"
PACKAGES = "libcbor libcbor-devel"


URI_src = "https://vault.almalinux.org/10.0/BaseOS/Source/Packages/libcbor-0.11.0-3.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_libcbor = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libcbor-0.11.0-3.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libcbor}"
RDEPENDS:libcbor = " \
 glibc \
"

URI_libcbor-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libcbor-devel-0.11.0-3.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libcbor-devel}"
RDEPENDS:libcbor-devel = " \
 libcbor \
 cmake-filesystem \
 pkgconf-pkg-config \
"
