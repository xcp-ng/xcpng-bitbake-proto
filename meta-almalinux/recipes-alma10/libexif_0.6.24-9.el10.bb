
inherit dnf-bridge

PN = "libexif"
PE = "0"
PV = "0.6.24"
PR = "9.el10"
PACKAGES = "libexif libexif-devel libexif-doc"


URI_libexif = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libexif-0.6.24-9.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libexif = " \
 glibc \
"

URI_libexif-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libexif-devel-0.6.24-9.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libexif-devel = " \
 pkgconf-pkg-config \
 libexif \
"

URI_libexif-doc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libexif-doc-0.6.24-9.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libexif-doc = " \
 libexif \
"
