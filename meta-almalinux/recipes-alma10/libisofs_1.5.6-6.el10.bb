
PN = "libisofs"
PE = "0"
PV = "1.5.6"
PR = "6.el10"
PACKAGES = "libisofs libisofs-doc libisofs-devel"


URI_libisofs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libisofs-1.5.6-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libisofs = " \
 glibc \
 libacl \
 zlib-ng-compat \
"

URI_libisofs-doc = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libisofs-doc-1.5.6-6.el10.noarch.rpm;unpack=0"
RDEPENDS:libisofs-doc = ""

URI_libisofs-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libisofs-devel-1.5.6-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libisofs-devel = " \
 pkgconf-pkg-config \
 libisofs \
"
