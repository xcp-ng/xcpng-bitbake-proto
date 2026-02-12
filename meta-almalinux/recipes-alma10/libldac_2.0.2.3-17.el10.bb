
inherit dnf-bridge

PN = "libldac"
PE = "0"
PV = "2.0.2.3"
PR = "17.el10"
PACKAGES = "libldac libldac-devel"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/libldac-2.0.2.3-17.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_libldac = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libldac-2.0.2.3-17.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libldac}"
RDEPENDS:libldac = " \
 glibc \
"

URI_libldac-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libldac-devel-2.0.2.3-17.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libldac-devel}"
RDEPENDS:libldac-devel = " \
 libldac \
 pkgconf-pkg-config \
"
