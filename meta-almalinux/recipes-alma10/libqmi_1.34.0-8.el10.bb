
PN = "libqmi"
PE = "0"
PV = "1.34.0"
PR = "8.el10"
PACKAGES = "libqmi libqmi-utils libqmi-devel"


URI_libqmi = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libqmi-1.34.0-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libqmi = "
 libmbim
 libgcc
 libqrtr-glib
 glib2
 glibc
"

URI_libqmi-utils = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libqmi-utils-1.34.0-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libqmi-utils = "
 libmbim
 libqmi
 libgcc
 libqrtr-glib
 libgudev
 bash
 glib2
 glibc
"

URI_libqmi-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libqmi-devel-1.34.0-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libqmi-devel = "
 glib2-devel
 libmbim-devel
 libqmi
 pkgconf-pkg-config
 libqrtr-glib-devel
"
