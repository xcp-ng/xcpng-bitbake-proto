
PN = "gcab"
PE = "0"
PV = "1.6"
PR = "7.el10"
PACKAGES = "libgcab1 libgcab1-devel gcab"


URI_libgcab1 = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libgcab1-1.6-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libgcab1 = " \
 glibc \
 libgcc \
 glib2 \
 zlib-ng-compat \
"

URI_libgcab1-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libgcab1-devel-1.6-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libgcab1-devel = " \
 libgcab1 \
 glib2-devel \
 pkgconf-pkg-config \
"

URI_gcab = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/gcab-1.6-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:gcab = " \
 glibc \
 libgcab1 \
 libgcc \
 glib2 \
"
