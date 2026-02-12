
inherit dnf-bridge

PN = "libsass"
PE = "0"
PV = "3.4.5"
PR = "6.el10"
PACKAGES = "libsass libsass-devel"


URI_src = "https://vault.almalinux.org/10.0/devel/Source/Packages/libsass-3.4.5-6.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_libsass = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libsass-3.4.5-6.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libsass}"
RDEPENDS:libsass = " \
 glibc \
 libgcc \
 libstdc++ \
"

URI_libsass-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libsass-devel-3.4.5-6.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libsass-devel}"
RDEPENDS:libsass-devel = " \
 libsass \
 pkgconf-pkg-config \
"
