
inherit dnf-bridge

PN = "libgtop2"
PE = "0"
PV = "2.41.2"
PR = "5.el10"
PACKAGES = "libgtop2 libgtop2-devel"


URI_libgtop2 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libgtop2-2.41.2-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libgtop2 = " \
 glibc \
 glib2 \
"

URI_libgtop2-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libgtop2-devel-2.41.2-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libgtop2-devel = " \
 glib2-devel \
 libgtop2 \
 pkgconf-pkg-config \
"
