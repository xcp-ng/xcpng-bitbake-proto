
inherit dnf-bridge

PN = "pkgconf"
PE = "0"
PV = "2.1.0"
PR = "3.el10"
PACKAGES = "libpkgconf pkgconf pkgconf-m4 pkgconf-pkg-config bomtool libpkgconf-devel"


URI_libpkgconf = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libpkgconf-2.1.0-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libpkgconf = " \
 glibc \
"

URI_pkgconf = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/pkgconf-2.1.0-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:pkgconf = " \
 glibc \
 libpkgconf \
"

URI_pkgconf-m4 = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/pkgconf-m4-2.1.0-3.el10.noarch.rpm;unpack=0"
RDEPENDS:pkgconf-m4 = ""

URI_pkgconf-pkg-config = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/pkgconf-pkg-config-2.1.0-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:pkgconf-pkg-config = " \
 pkgconf-m4 \
 pkgconf \
 bash \
"

URI_bomtool = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/bomtool-2.1.0-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:bomtool = " \
 glibc \
 libpkgconf \
"

URI_libpkgconf-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libpkgconf-devel-2.1.0-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libpkgconf-devel = " \
 libpkgconf \
 pkgconf-pkg-config \
"
