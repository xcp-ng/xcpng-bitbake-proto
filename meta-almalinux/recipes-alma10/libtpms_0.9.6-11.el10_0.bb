
PN = "libtpms"
PE = "0"
PV = "0.9.6"
PR = "11.el10_0"
PACKAGES = "libtpms libtpms-devel"


URI_libtpms = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libtpms-0.9.6-11.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:libtpms = "
 glibc
 openssl-libs
"

URI_libtpms-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libtpms-devel-0.9.6-11.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:libtpms-devel = "
 pkgconf-pkg-config
 libtpms
"
