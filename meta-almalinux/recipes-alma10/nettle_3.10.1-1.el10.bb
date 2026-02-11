
PN = "nettle"
PE = "0"
PV = "3.10.1"
PR = "1.el10"
PACKAGES = "nettle nettle-devel"


URI_nettle = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/nettle-3.10.1-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:nettle = "
 glibc
"

URI_nettle-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/nettle-devel-3.10.1-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:nettle-devel = "
 gmp-devel
 nettle-devel
 pkgconf-pkg-config
 nettle
"
