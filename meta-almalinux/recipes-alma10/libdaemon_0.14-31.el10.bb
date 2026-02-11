
PN = "libdaemon"
PE = "0"
PV = "0.14"
PR = "31.el10"
PACKAGES = "libdaemon libdaemon-devel"


URI_libdaemon = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libdaemon-0.14-31.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libdaemon = "
 glibc
"

URI_libdaemon-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libdaemon-devel-0.14-31.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libdaemon-devel = "
 libdaemon
 pkgconf-pkg-config
"
