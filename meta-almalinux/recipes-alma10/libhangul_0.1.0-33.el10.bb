
inherit dnf-bridge

PN = "libhangul"
PE = "0"
PV = "0.1.0"
PR = "33.el10"
PACKAGES = "libhangul libhangul-devel"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/libhangul-0.1.0-33.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_libhangul = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libhangul-0.1.0-33.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libhangul}"
RDEPENDS:libhangul = " \
 glibc \
"

URI_libhangul-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libhangul-devel-0.1.0-33.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libhangul-devel}"
RDEPENDS:libhangul-devel = " \
 libhangul \
 pkgconf-pkg-config \
"
