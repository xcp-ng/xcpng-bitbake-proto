
PN = "libgexiv2"
PE = "0"
PV = "0.14.3"
PR = "3.el10"
PACKAGES = "libgexiv2 libgexiv2-devel"


URI_libgexiv2 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libgexiv2-0.14.3-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libgexiv2 = " \
 libgcc \
 exiv2-libs \
 libstdc++ \
 glib2 \
 glibc \
"

URI_libgexiv2-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libgexiv2-devel-0.14.3-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libgexiv2-devel = " \
 libgexiv2 \
 glib2-devel \
 pkgconf-pkg-config \
 exiv2-devel \
"
