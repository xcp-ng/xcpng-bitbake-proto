
PN = "libqrtr-glib"
PE = "0"
PV = "1.2.2"
PR = "7.el10"
PACKAGES = "libqrtr-glib libqrtr-glib-devel"


URI_libqrtr-glib = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libqrtr-glib-1.2.2-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libqrtr-glib = "
 glibc
 libgcc
 glib2
"

URI_libqrtr-glib-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libqrtr-glib-devel-1.2.2-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libqrtr-glib-devel = "
 glib2-devel
 libqrtr-glib
 pkgconf-pkg-config
"
