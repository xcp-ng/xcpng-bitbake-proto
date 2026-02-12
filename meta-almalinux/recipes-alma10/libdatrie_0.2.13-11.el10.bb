
inherit dnf-bridge

PN = "libdatrie"
PE = "0"
PV = "0.2.13"
PR = "11.el10"
PACKAGES = "libdatrie libdatrie-devel"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/libdatrie-0.2.13-11.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_libdatrie = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libdatrie-0.2.13-11.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libdatrie}"
RDEPENDS:libdatrie = " \
 glibc \
"

URI_libdatrie-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libdatrie-devel-0.2.13-11.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libdatrie-devel}"
RDEPENDS:libdatrie-devel = " \
 glibc \
 libdatrie \
 pkgconf-pkg-config \
"
