
PN = "libfabric"
PE = "0"
PV = "1.22.0"
PR = "1.el10"
PACKAGES = "libfabric libfabric-devel"


URI_libfabric = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libfabric-1.22.0-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libfabric = "
 glibc
 libnl3
 libibverbs
 librdmacm
"

URI_libfabric-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libfabric-devel-1.22.0-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libfabric-devel = "
 libfabric
 pkgconf-pkg-config
"
