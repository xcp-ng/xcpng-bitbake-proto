
PN = "libndp"
PE = "0"
PV = "1.9"
PR = "2.el10"
PACKAGES = "libndp libndp-devel"


URI_libndp = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libndp-1.9-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libndp = " \
 glibc \
"

URI_libndp-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libndp-devel-1.9-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libndp-devel = " \
 pkgconf-pkg-config \
 libndp \
"
