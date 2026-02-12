
inherit dnf-bridge

PN = "kronosnet"
PE = "0"
PV = "1.30"
PR = "1.el10"
PACKAGES = "libknet1 libknet1-devel libnozzle1-devel"


URI_src = "https://vault.almalinux.org/10.0/CRB/Source/Packages/kronosnet-1.30-1.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_libknet1 = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libknet1-1.30-1.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libknet1}"
RDEPENDS:libknet1 = " \
 glibc \
"

URI_libknet1-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libknet1-devel-1.30-1.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libknet1-devel}"
RDEPENDS:libknet1-devel = " \
 libknet1 \
 pkgconf-pkg-config \
"

URI_libnozzle1-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libnozzle1-devel-1.30-1.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libnozzle1-devel}"
RDEPENDS:libnozzle1-devel = " \
 pkgconf-pkg-config \
"
