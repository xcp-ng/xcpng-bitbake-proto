
inherit dnf-bridge

PN = "pciutils"
PE = "0"
PV = "3.13.0"
PR = "5.el10"
PACKAGES = "pciutils pciutils-libs pciutils-devel pciutils-devel-static"


URI_pciutils = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/pciutils-3.13.0-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:pciutils = " \
 kmod-libs \
 hwdata \
 pciutils-libs \
 bash \
 glibc \
"

URI_pciutils-libs = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/pciutils-libs-3.13.0-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:pciutils-libs = " \
 glibc \
"

URI_pciutils-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pciutils-devel-3.13.0-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:pciutils-devel = " \
 pciutils \
 zlib-ng-compat-devel \
 pciutils-libs \
 pkgconf-pkg-config \
"

URI_pciutils-devel-static = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/pciutils-devel-static-3.13.0-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:pciutils-devel-static = " \
 pciutils-devel \
"
