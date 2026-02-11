
PN = "libldac"
PE = "0"
PV = "2.0.2.3"
PR = "17.el10"
PACKAGES = "libldac libldac-devel"


URI_libldac = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libldac-2.0.2.3-17.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libldac = " \
 glibc \
"

URI_libldac-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libldac-devel-2.0.2.3-17.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libldac-devel = " \
 libldac \
 pkgconf-pkg-config \
"
