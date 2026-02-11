
inherit dnf-bridge

PN = "speexdsp"
PE = "0"
PV = "1.2.1"
PR = "8.el10"
PACKAGES = "speexdsp speexdsp-devel"


URI_speexdsp = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/speexdsp-1.2.1-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:speexdsp = " \
 glibc \
"

URI_speexdsp-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/speexdsp-devel-1.2.1-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:speexdsp-devel = " \
 speexdsp \
 pkgconf-pkg-config \
"
