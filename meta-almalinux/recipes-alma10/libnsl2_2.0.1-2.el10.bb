
inherit dnf-bridge

PN = "libnsl2"
PE = "0"
PV = "2.0.1"
PR = "2.el10"
PACKAGES = "libnsl2 libnsl2-devel"


URI_libnsl2 = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libnsl2-2.0.1-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libnsl2 = " \
 glibc \
 libtirpc \
"

URI_libnsl2-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libnsl2-devel-2.0.1-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libnsl2-devel = " \
 libtirpc-devel \
 pkgconf-pkg-config \
 libnsl2 \
"
