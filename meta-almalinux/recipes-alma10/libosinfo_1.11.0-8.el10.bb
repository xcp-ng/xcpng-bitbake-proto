
PN = "libosinfo"
PE = "0"
PV = "1.11.0"
PR = "8.el10"
PACKAGES = "libosinfo libosinfo-devel"


URI_libosinfo = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libosinfo-1.11.0-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libosinfo = " \
 libsoup3 \
 libxslt \
 libgcc \
 libxml2 \
 hwdata \
 glib2 \
 glibc \
 osinfo-db \
 osinfo-db-tools \
"

URI_libosinfo-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libosinfo-devel-1.11.0-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libosinfo-devel = " \
 libosinfo \
 glib2-devel \
 pkgconf-pkg-config \
"
