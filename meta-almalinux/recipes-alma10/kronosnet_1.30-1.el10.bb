
inherit dnf-bridge

PN = "kronosnet"
PE = "0"
PV = "1.30"
PR = "1.el10"
PACKAGES = "libknet1 libknet1-devel libnozzle1-devel"


URI_libknet1 = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libknet1-1.30-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libknet1 = " \
 glibc \
"

URI_libknet1-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libknet1-devel-1.30-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libknet1-devel = " \
 libknet1 \
 pkgconf-pkg-config \
"

URI_libnozzle1-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libnozzle1-devel-1.30-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libnozzle1-devel = " \
 pkgconf-pkg-config \
"
