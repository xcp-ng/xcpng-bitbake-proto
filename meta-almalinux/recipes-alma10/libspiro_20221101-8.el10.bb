
PN = "libspiro"
PE = "0"
PV = "20221101"
PR = "8.el10"
PACKAGES = "libspiro libspiro-devel"


URI_libspiro = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libspiro-20221101-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libspiro = " \
 glibc \
"

URI_libspiro-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libspiro-devel-20221101-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libspiro-devel = " \
 libspiro \
 pkgconf-pkg-config \
"
